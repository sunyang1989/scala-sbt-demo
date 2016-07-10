package akka

import akka.actor.{ActorSystem, Props}

import scala_akka.actor.MasterActor
import scala_akka.message.Result

/**
  * 执行入口
  *
  * @user sun
  * @date 2016/7/10
  */
object MapReduceApplication {
  def main(args: Array[String]) {
    val system = ActorSystem("helloAkka")
    val master = system.actorOf(Props[MasterActor], "master")
    master ! "my name is sunyang"
    master ! "i hope you like it"
    Thread.sleep(500)
    master ! new Result
    system.shutdown()
  }
}
