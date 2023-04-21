import java.util.*;

public class FindPairs {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 6, 8, 9, 11};
        int sum = 12;
        findPairs(arr, sum);
    }

    public static void findPairs(int[] arr, int sum) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int complement = sum - arr[i];
            if (map.containsKey(complement)) {
                System.out.println("(" + arr[i] + ", " + complement + ")");
            }
            map.put(arr[i], i);
        }
    }
}