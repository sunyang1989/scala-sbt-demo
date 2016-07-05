package akka.actor;

import akka.message.MapDataResult;
import akka.message.ReduceDataResult;
import akka.message.WordCount;

import java.util.HashMap;
import java.util.List;

/**
 * @user sun
 * @date 2016/7/4
 */
public class ReduceActor extends UntypedActor {

    private ActorRef aggregateActor;

    public ReduceActor(ActorRef aggregateActor) {
        this.aggregateActor = aggregateActor;
    }

    @Override
    public void onReceive(Object message) throws Exception {
        if (message instanceof MapDataResult) {
            MapDataResult dataResult = (MapDataResult) message;
            ReduceDataResult result = reduce(dataResult.getDataList());
            aggregateActor.tell(result, getSelf());
        } else
            unhandled(message);
    }

    private ReduceDataResult reduce(List<WordCount> wordCounts) {
        HashMap<String, Integer> reduceMap = new HashMap<>();
        for (WordCount wordCount : wordCounts) {
            if (reduceMap.containsKey(wordCount.getWord())) {
                int value = reduceMap.get(wordCount.getWord());
                value++;
                reduceMap.put(wordCount.getWord(), value);
            } else {
                reduceMap.put(wordCount.getWord(), 1);
            }
        }

        return new ReduceDataResult(reduceMap);
    }
}
