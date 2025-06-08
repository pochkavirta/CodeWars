package Kyu7.Path2;

//TODO Your task is to write a function which returns the sum of a sequence of integers.
// The sequence is defined by 3 non-negative values: begin, end, step.
// If begin value is greater than the end, your function should return 0. If end is not the result
// of an integer number of steps, then don't add it to the sum. See the 4th example below.

public class Task47 {
    public static void main(String[] args) {
        System.out.println(sequenceSum(2, 2, 2));
        System.out.println(sequenceSum(2, 6, 2));
        System.out.println(sequenceSum(1, 5, 1));
        System.out.println(sequenceSum(1, 5, 3));
        System.out.println(sequenceSum(0, 15, 3));
        System.out.println(sequenceSum(16, 15, 3));
    }

    public static int sequenceSum(int start, int end, int step) {
        int sum = 0;
        for (int i = start; i <= end; i += step) sum += i;
        return sum;
    }

    public static int sequenceSum1(int start, int end, int step) {
        int result = start;
        while (start < end) {
            start += step;
            result += start;
        }
        return start == end ? result : result - start;
    }
}
