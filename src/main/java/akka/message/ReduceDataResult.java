package akka.message;

import java.util.Map;

/**
 * Reduce actor 处理后结果
 *
 * @user sun
 * @date 2016/7/4
 */
public class ReduceDataResult {

    private Map<String, Integer> reduceDataMap;

    public ReduceDataResult(Map<String, Integer> reduceDataMap) {
        this.reduceDataMap = reduceDataMap;
    }

    public Map<String, Integer> getReduceDataMap() {
        return reduceDataMap;
    }

    public void setReduceDataMap(Map<String, Integer> reduceDataMap) {
        this.reduceDataMap = reduceDataMap;
    }
}
