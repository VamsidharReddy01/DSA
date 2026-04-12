package Arrays.MEDIUM;

import java.util.HashMap;
import java.util.Map;

public class Frequency {
    public static void main(String[] args) {
        int[] nums={2,1,4,1,2,4,2,1,4};
        Map<Integer, Integer> freq = new HashMap<>();
        for (int x : nums) {
            freq.put(x, freq.getOrDefault(x, 0) + 1);
        }
        System.out.println(freq);
    }
}
