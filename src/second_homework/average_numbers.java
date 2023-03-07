package second_homework;

public class average_numbers {
    public static void main(String[] args) {
        int[] numbers = {-3, -7, -9, -14, 2, 6, 10};
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }

        double average = (double) sum / numbers.length;
        System.out.println("Average result: " + average);
    }
}
