import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author yang.sun
 * @date 2016/6/1
 */
public class Size {
    public static void main(String[] args){
        int[] intAry = new int[10];
        System.out.println(intAry.length);

        String[] strings = new String[10];
        System.out.println(strings.length);

        Map<String, String> other_map = new HashMap<>(10);
        System.out.println(other_map.size());

        for(int i=0;i<10;i++){
            other_map.put(String.valueOf(i),i+"sun");
        }
        for(Iterator<String> it = other_map.keySet().iterator();it.hasNext();){
            if(Integer.parseInt(it.next()) % 2 ==0)
                it.remove();
        }
        System.out.println(other_map.size());

        other_map.keySet().stream().forEach(anArray -> System.out.println(0));

        List<String> list = new ArrayList<>(10);
        System.out.println(list.size());

        Set<Integer> set = new HashSet<>(10);
        System.out.println(set.size());

        for(int i=0;i<10;i++){
            set.add(i);
        }

        for(Iterator<Integer> it = set.iterator();it.hasNext();){
            if(it.next() % 2 ==0)
                it.remove();
        }
        System.out.println(Arrays.toString(set.toArray(new Integer[set.size()])));

    }
}
