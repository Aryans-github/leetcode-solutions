import java.util.Arrays;

public class Solution {
    public int[] sortByBits(int[] arr) {
        // Convert int[] to Integer[]
        Integer[] boxedArr = Arrays.stream(arr).boxed().toArray(Integer[]::new);

        // Sort using the custom comparator
        Arrays.sort(boxedArr, (a, b) -> {
            int countA = countBits(a);
            int countB = countBits(b);
            if (countA == countB) {
                return a - b; // Sort by value if bits are equal
            }
            return countA - countB; // Sort by number of 1's
        });

        // Convert Integer[] back to int[]
        return Arrays.stream(boxedArr).mapToInt(Integer::intValue).toArray();
    }

    private int countBits(int num) {
        int count = 0;
        while (num > 0) {
            count += num & 1; // Check last bit
            num >>= 1;        // Right shift
        }
        return count;
    }
}