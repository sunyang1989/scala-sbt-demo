package akka.message;

import java.util.List;

/**
 * Map actor执行后的结果
 *
 * @user sun
 * @date 2016/7/4
 */
public class MapDataResult {

    private List<WordCount> dataList;

    public MapDataResult(List<WordCount> dataList) {
        this.dataList = dataList;
    }

    public List<WordCount> getDataList() {
        return dataList;
    }

    public void setDataList(List<WordCount> dataList) {
        this.dataList = dataList;
    }
}
