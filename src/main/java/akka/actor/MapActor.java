package akka.actor;

import akka.message.MapDataResult;
import akka.message.WordCount;
import scala.actors.threadpool.Arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/**
 * @user sun
 * @date 2016/7/4
 */
public class MapActor extends UntypedActor {

    String[] STOP_WORDS = {"a", "is"};
    private ActorRef reduceActor;
    private List<String> STOP_WORDS_LIST = Arrays.asList(STOP_WORDS);

    public MapActor(ActorRef reduceActor) {
        this.reduceActor = reduceActor;
    }

    @Override
    public void onReceive(Object message) throws Exception {
        if (message instanceof String) {
            String word = (String) message;
            MapDataResult result = evaluateExpression(word);
            reduceActor.tell(result, getSelf());
        } else
            unhandled(message);
    }

    private MapDataResult evaluateExpression(String word) {
        List<WordCount> list = new ArrayList<>();
        StringTokenizer parse = new StringTokenizer(word);
        while (parse.hasMoreTokens()) {
            String tem = parse.nextToken().toUpperCase();
            if (!STOP_WORDS_LIST.contains(tem)) {
                list.add(new WordCount(tem, 1));
            }
        }
        return new MapDataResult(list);
    }
}
