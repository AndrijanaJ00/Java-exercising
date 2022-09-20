import java.util.*;

public class Main {

    static Object[] findDiference(int arr[], int arr2[]) {
        List<Integer> output = new ArrayList<>();
        Object[] arrOfDifference;
        for (int i = 0; i < arr.length; i++) {
            boolean flag = false;
            for (int j = 0; j < arr2.length; j++) {
                if (arr[i] == arr2[j]) {
                    flag = true;
                }
            }
            if (!flag) {
                output.add(arr[i]);
            }
        }

        for (int i = 0; i < arr2.length; i++) {
            boolean flag = false;
            for (int j = 0; j < arr.length; j++) {
                if (arr2[i] == arr[j]) {
                    flag = true;
                }
            }
            if (!flag) {
                output.add(arr2[i]);
            }
        }

        arrOfDifference = output.toArray();
        return arrOfDifference;
    }


    public static void main(String[] args) {
        int[] array1 = new int[]{1, 2, 4, 5,3};
        int[] array2 = new int[]{1, 2, 3,6,712,31};

        System.out.println(Arrays.toString(findDiference(array1,array2)));;

    }
}
