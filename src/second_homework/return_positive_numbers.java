package second_homework;

public class return_positive_numbers {
    public static void main(String[] args) {
        int[] numbers = {-9,-8,-7,-6,-5,-4,-3,-2,-1,0,1,2,3,4,5,6,7,8,9};
        int sum = 0;
        for (int number : numbers) {
            if (number > 0) {
                sum += number;
            }

        }
        System.out.println("Sum positive numbers; " + sum);
    }

}
