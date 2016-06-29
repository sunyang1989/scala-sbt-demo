package actor

import scala.actors.Actor
import scala.actors.Actor._
/**
  * 匿名线程
  *
  * @user sun 
  * @date 2016/6/28
  */
object Actor_Message extends Actor {
  def act() {
    while (true) {
      receive {
        //接收消息
        case msg => println("Message content Actor from inbox: " + msg)
      }
    }
  }
}

object Actor_Messages {

  def main(args: Array[String]) {
    val actor_Message = actor {
      while (true) {
        receive {
          //apply isDefinedAt
          case msg => println("Message content from inbox: " + msg)
        }
      }
    }
    val double_Message = actor {
      while (true) {
        receive {
          case msg: Double => println("Double Number from inbox: " + msg)
          //    		case _ => println("Something Unkown" )
        }
      }
    }
    Actor_Message.start //启动线程
    Actor_Message ! "Hadoop" //发送消息
    actor_Message ! "Spark"
    double_Message ! Math.PI
    double_Message ! "Hadoop"

  }

}
