package akka.message;

/**
 * 单词计数类
 *
 * @user sun
 * @date 2016/7/4
 */
public class WordCount {
    private String word;
    private Integer count;

    public WordCount(String word, Integer count) {
        this.word = word;
        this.count = count;
    }

    public String getWord() {
        return word;
    }

    public Integer getCount() {
        return count;
    }
}
