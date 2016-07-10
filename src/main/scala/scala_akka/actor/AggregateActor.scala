package scala_akka.actor

import java.util

import akka.actor.Actor

import scala_akka.message.{ReduceDataResult, Result}

/**
  * @user sun 
  * @date 2016/7/10
  */
class AggregateActor extends Actor {
  var finalReduceMap = new util.HashMap[String, Integer]

  override def receive: Receive = {
    case message: ReduceDataResult =>
      aggregateInMemoryReduce(message.reduceMap)
    case message: Result =>
      System.out.println(finalReduceMap.toString)
    case _ =>
  }

  def aggregateInMemoryReduce(reduceMap: util.HashMap[String, Integer]) = {
    var count: Integer = 0
    import scala.collection.JavaConversions._
    val sets: util.Set[String] = reduceMap.keySet()
    for (key <- sets) {
      if (finalReduceMap.containsKey(key)) {
        count = reduceMap.get(key) + finalReduceMap.get(key)
        finalReduceMap.put(key, count)
      } else {
        finalReduceMap.put(key, reduceMap.get(key))
      }
    }
  }
}
