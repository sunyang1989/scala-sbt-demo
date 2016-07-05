package akka.actor;

import akka.message.Result;


/**
 * @user sun
 * @date 2016/7/4
 */
public class MasterActor extends UntypedActor {

    private ActorRef aggregateActor = getContext().actorOf(Props.create(AggregateActor.class), "aggregate");

    private ActorRef reduceActor = getContext().actorOf(Props.create(
            (UntypedActorFactory) () -> new ReduceActor(aggregateActor)), "reduce");

    private ActorRef mapActor = getContext().actorOf(Props.create(
            (UntypedActorFactory) () -> new MapActor(reduceActor)), "map");

    @Override
    public void onReceive(Object message) throws Exception {
        if (message instanceof String) {
            mapActor.tell(message, getSelf());
        } else if (message instanceof Result) {
            aggregateActor.tell(message, getSelf());
        } else
            unhandled(message);
    }
}
