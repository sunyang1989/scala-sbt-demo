package scala_akka.actor

import akka.actor.{Actor, ActorRef, Props}

import scala_akka.message.Result

/**
  * @user sun 
  * @date 2016/7/10
  */
class MasterActor extends Actor {
  val aggregateActor: ActorRef = context.actorOf(Props[AggregateActor], "aggregate")
  val reduceActor: ActorRef = context.actorOf(Props(new ReduceActor(aggregateActor)), "reduce")
  val mapActor: ActorRef = context.actorOf(Props(new MapActor(reduceActor)), "map")

  override def receive: Receive = {
    case message: String => mapActor ! message
    case message: Result => aggregateActor ! message
    case _ =>
  }
}
