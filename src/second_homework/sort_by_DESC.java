package second_homework;

import java.util.Arrays;
import java.util.Collections;

public class sort_by_DESC {
    public static void main(String[] args) {
        int[] numbers = {2,3,1,7,11};
        Arrays.sort(numbers);
        int[] reversedNumbers = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            reversedNumbers[i] = numbers[numbers.length - i - 1];
        }
        System.out.println(Arrays.toString(reversedNumbers));
    }
}
