package scala_akka.actor

import java.util

import akka.actor.{Actor, ActorRef}

import scala_akka.message.{MapDataResult, ReduceDataResult, Word}

/**
  * @user sun 
  * @date 2016/7/10
  */
class ReduceActor(aggregateActor: ActorRef) extends Actor {
  override def receive: Receive = {
    case message: MapDataResult =>
      aggregateActor ! reduce(message.dataList)
    case _ =>
  }

  def reduce(dataList: util.ArrayList[Word]): ReduceDataResult = {
    val reduceMap = new util.HashMap[String, Integer]
    import scala.collection.JavaConversions._
    for (ws: Word <- dataList) {
      if (reduceMap.containsKey(ws.word)) {
        var value: Int = reduceMap.get(ws.word)
        value += 1
        reduceMap.put(ws.word, value)
      }
      else {
        reduceMap.put(ws.word, 1)
      }
    }
    new ReduceDataResult(reduceMap)
  }
}
