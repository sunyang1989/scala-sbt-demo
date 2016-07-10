package scala_akka.actor

import java.util
import java.util.StringTokenizer

import akka.actor.{Actor, ActorRef}

import scala_akka.message.{MapDataResult, Word}

/**
  * @user sun 
  * @date 2016/7/10
  */
class MapActor(reduceActor: ActorRef) extends Actor {
  val STOP_WORDS_LIST = List("a", "is")

  override def receive: Receive = {
    case message: String =>
      reduceActor ! evaluateExpression(message)
    case _ =>
  }

  def evaluateExpression(line: String): MapDataResult = {
    val dataList = new util.ArrayList[Word]
    val parse: StringTokenizer = new StringTokenizer(line)
    while (parse.hasMoreTokens) {
      val tem: String = parse.nextToken.toLowerCase
      if (!STOP_WORDS_LIST.contains(tem)) {
        dataList.add(new Word(tem, 1))
      }
    }
    new MapDataResult(dataList)
  }
}
