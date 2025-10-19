import java.util.*;

class Ranks {
    public static String[] findRelativeRanks(int[] score) {
        int n = score.length;
        String[] result = new String[n];

        // store (score, index) so we know original positions
        int[][] arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            arr[i][0] = score[i]; // score
            arr[i][1] = i;        // original index
        }

        // sort by score (descending)
        Arrays.sort(arr, (a, b) -> b[0] - a[0]);

        for (int i = 0; i < n; i++) {
            int index = arr[i][1]; // original index
            if (i == 0) {
                result[index] = "Gold Medal";
            } else if (i == 1) {
                result[index] = "Silver Medal";
            } else if (i == 2) {
                result[index] = "Bronze Medal";
            } else {
                result[index] = String.valueOf(i + 1); // placement number
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] score = {5, 4, 3, 2, 1};
        String[] ranks = findRelativeRanks(score);

        System.out.println(Arrays.toString(ranks));
    }
}
