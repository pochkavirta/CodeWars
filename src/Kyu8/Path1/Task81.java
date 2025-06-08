package Kyu8.Path1;

//TODO Your task is to find the first element of an array that is not consecutive.
// By not consecutive we mean not exactly 1 larger than the previous element of the array.
// /E.g. If we have an array [1,2,3,4,6,7,8] then 1 then 2 then 3 then 4 are all consecutive but 6 is not, so that's the first non-consecutive number.
// If the whole array is consecutive then return null2.
// The array will always have at least 2 elements1 and all elements will be numbers. The numbers will also all
// be unique and in ascending order. The numbers could be positive or negative and the first non-consecutive could be either too!

public class Task81 {
    public static void main(String[] args) {
        System.out.println(find(new int[]{1, 2, 3, 4, 6, 7, 8}));
        System.out.println(find(new int[]{1, 2, 3, 4, 5, 6, 7, 8}));
        System.out.println(find(new int[]{4, 6, 7, 8, 9, 11}));
        System.out.println(find(new int[]{4, 5, 6, 7, 8, 9, 11}));
        System.out.println(find(new int[]{31, 32}));
    }

    static Integer find(final int[] array) {
        Integer otvet = null;
        int j = array[0];
        for (int k : array) {
            if (j != k) {
                otvet = k;
                break;
            }
            j++;
        }
        return otvet;
    }
}
