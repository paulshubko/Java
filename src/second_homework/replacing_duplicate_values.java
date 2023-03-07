package second_homework;
import java.util.Map;
import java.util.HashMap;
import java.util.Arrays;


public class replacing_duplicate_values {
    public static void main(String[] args) {
        int[] arr = {3,2,3,1,4,2,8,3};
        Map<Integer, Boolean> map = new HashMap<Integer, Boolean>();

        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                arr[i] = 0;
            } else {
                map.put(arr[i], true);
            }
        }

        System.out.println(Arrays.toString(arr));

    }
}
