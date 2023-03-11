import java.util.Arrays;

class Binary2DSearch {

    public static void main(String[] args) {
        int[][] ar = { { 10, 12, 13, 15 }, { 17, 21, 44, 56 }, { 59, 60, 65, 67 }, { 70, 79, 83, 95 } };
        int target = 893;

        int[] found = binary2dsearch(ar, target);
        System.out.print(Arrays.toString(found));
    }

    static int[] binary2dsearch(int[][] list, int target) {
        int rows = list.length;
        int cols = list[0].length;
        int row_start = 0;
        int row_end = rows - 1;
        int col_mid = cols / 2;

        if (rows == 1)
            return simplebinarysearch(list, 0, 0, cols - 1, target);

        // iterate till the rows remaining are 2.
        while (row_start < (row_end - 1)) { // while this is true, it will have more than 2 rows
            int mid = row_start + ((row_end - row_start) / 2);

            if (list[mid][col_mid] == target)
                return new int[] { mid, col_mid };
            else if (list[mid][col_mid] < target)
                row_start = mid;
            else
                row_end = mid;

        }
        // now we have two rows remaining
        // check whether the target is in the same column of the two rows
        if (list[row_start][col_mid] == target)
            return new int[] { row_start, col_mid };
        if (list[row_start + 1][col_mid] == target)
            return new int[] { row_start + 1, col_mid };

        // otherwise search in 1st half
        if (target <= list[row_start][col_mid - 1])
            return simplebinarysearch(list, row_start, 0, col_mid - 1, target);
        // search in 2nd half
        if (target >= list[row_start][col_mid + 1] && target <= list[row_start][cols - 1])
            return simplebinarysearch(list, row_start, col_mid + 1, cols - 1, target);
        // search in 3rd half
        if (target <= list[row_start + 1][col_mid - 1])
            return simplebinarysearch(list, row_start + 1, 0, col_mid - 1, target);
        // search in 4th half
        if (target >= list[row_start + 1][col_mid + 1])
            return simplebinarysearch(list, row_start + 1, col_mid + 1, cols - 1, target);
        return new int[] { -1, -1 };
    }

    // Search in the row provided between the columns provided.
    static int[] simplebinarysearch(int[][] list, int row, int col_start, int col_end, int target) {
        while (col_start <= col_end) {
            int mid = col_start + ((col_end - col_start) / 2);
            if (list[row][mid] == target)
                return new int[] { row, mid };
            if (list[row][mid] > target)
                col_end = mid - 1;
            else
                col_start = mid + 1;

        }
        return new int[] { -1, -1 };
    }
}