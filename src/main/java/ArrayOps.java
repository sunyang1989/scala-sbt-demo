import java.util.Arrays;

/**
 * java 数组声明
 *
 * @author sun
 * @date 2016/5/29
 */
public class ArrayOps {
    public static void main(String[] args) {
        String[] strings1 = new String[2];
        String[] strings2 = new String[]{"123", "456"};
        String[] strings3 = {"a", "b"};

        System.out.println(Arrays.toString(strings1));
        System.out.println(Arrays.toString(strings2));
        System.out.println(Arrays.toString(strings3));
    }
}
