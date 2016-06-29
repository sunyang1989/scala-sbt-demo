package actor

import scala.actors.Actor
import scala.actors.Actor._
/**
  * 线程 发送消息，接受消息
  *
  * @user sun 
  * @date 2016/6/28
  */
case class Person(name: String, age: Int)

class HelloActor extends Actor {
  def act() {
    while (true) {
      receive {
        case Person(name, age) => {
          println("Name: " + name + " : " + "Age: " + age)
          sender ! "Echo!!!" //给消息的发送者回信
        }
        case _ => println("Something else...")
      }
    }
  }
}

object Actor_With_CaseClass {

  def main(args: Array[String]) {
    val hiActor = new HelloActor
    hiActor.start //启动线程
    hiActor ! Person("Spark", 6) //发送消息

    self.receive { case msg => println(msg) } //self 主线程 receive方法一直阻塞
    self.receiveWithin(1000) { case msg => println(msg) } //receiveWithin 在毫秒时间内阻塞
  }

}
