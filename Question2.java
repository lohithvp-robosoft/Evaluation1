import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Question2 {
    public static ArrayList<Integer> sortByFreq(int[] arr) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        HashMap<Integer, Integer> firstIndex = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            freq.put(arr[i], freq.getOrDefault(arr[i], 0) + 1);
            if (!firstIndex.containsKey(arr[i])) {
                firstIndex.put(arr[i], i);
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        for (int num : arr) {
            if (!list.contains(num)) {
                list.add(num);
            }
        }
        Collections.sort(list, (a, b) -> {
            int freqCompare = freq.get(b) - freq.get(a);
            if (freqCompare != 0) return freqCompare;
            return firstIndex.get(a) - firstIndex.get(b);
        });
        ArrayList<Integer> result = new ArrayList<>();
        for (int num : list) {
            int frequency = freq.get(num);
            for (int i = 0; i < frequency; i++) {
                result.add(num);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {12, 3, 1, 9, 4, 12, 9, 7, 8, 12, 9, 4, 8, 8, 2, 3, 8};
        ArrayList<Integer> res = sortByFreq(arr);
        System.out.println(res);
    }
}
