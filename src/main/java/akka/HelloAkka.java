package akka;

import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import akka.actor.MasterActor;
import akka.actor.Props;
import akka.message.Result;

/**
 * akka demo
 *
 * @user sun
 * @date 2016/7/4
 */
public class HelloAkka {
    public static void main(String[] args) throws Exception {
        ActorSystem system = ActorSystem.create("HelloAkka");
        ActorRef master = system.actorOf(Props.create(MasterActor.class), "master");

        master.tell("hi! my name is sunyang , I'm so happy to be here .", null);
        master.tell("hi! my name is sunyang ", null);
        Thread.sleep(500);
        master.tell(new Result(), null);
        system.shutdown();
    }
}
