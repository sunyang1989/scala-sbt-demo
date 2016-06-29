package actor
import java.net.{InetAddress, UnknownHostException}

import scala.actors.Actor
import scala.actors.Actor._

/**
  * loop：重复执行代码块
  * react：复用线程
  *
  * @user sun 
  * @date 2016/6/28
  */
object NameResolver extends Actor {

  def act() {
    //    react {
    //      case Net (name, actor) =>
    //        actor ! getIp(name)
    //        act //继续调用act方法
    //      case "EXIT" => println("Name resolver exiting.")
    //      case msg =>
    //        println("Unhandled message : " + msg)
    //      	act
    //    }
    loop {
      react {
        case Net(name, actor) =>
          actor ! getIp(name)
        case msg =>
          println("Unhandled message : " + msg)
      }
    }


  }

  def getIp(name: String): Option[InetAddress] = {
    try {
      println(InetAddress.getByName(name))
      Some(InetAddress.getByName(name))
    } catch {
      case _: UnknownHostException => None
    }
  }
}

case class Net(name: String, actor: Actor)

object Actor_More_Effective {

  def main(args: Array[String]) {
    NameResolver.start
    NameResolver ! Net("www.baidu.com", self)

    println(self.receiveWithin(1000) { case x => x })

  }

}
