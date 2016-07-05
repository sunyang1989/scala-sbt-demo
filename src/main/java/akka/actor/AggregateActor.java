package akka.actor;

import akka.message.ReduceDataResult;
import akka.message.Result;

import java.util.HashMap;
import java.util.Map;

/**
 * @user sun
 * @date 2016/7/4
 */
public class AggregateActor extends UntypedActor {

    private Map<String, Integer> finalReduceMap = new HashMap<>();

    @Override
    public void onReceive(Object message) throws Exception {
        if (message instanceof ReduceDataResult) {
            ReduceDataResult dataResult = (ReduceDataResult) message;
            aggregateInMemoryReduce(dataResult.getReduceDataMap());
        } else if (message instanceof Result) {
            System.out.println(finalReduceMap.toString());
        } else
            unhandled(message);
    }

    private void aggregateInMemoryReduce(Map<String, Integer> reduceMap) {
        Integer count;
        for (String key : reduceMap.keySet()) {
            if (finalReduceMap.containsKey(key)) {
                count = reduceMap.get(key) + finalReduceMap.get(key);
                finalReduceMap.put(key, count);
            } else {
                finalReduceMap.put(key, reduceMap.get(key));
            }
        }
    }
}
