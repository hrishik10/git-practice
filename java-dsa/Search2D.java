import java.util.Arrays;

class Search2D {

    public static void main(String[] args) {
        int[][] list = { { 10, 20, 30, 40 }, { 15, 25, 35, 45 }, { 28, 29, 37, 49 }, { 33, 34, 38, 50 } };
        int target = 45;
        int[] index = binary2dsearch(list, target);
        System.out.print(Arrays.toString(index));
    }

    static int[] binary2dsearch(int[][] list, int target) {
        int row = 0;
        int column = list.length - 1;
        int[] found = { -1, -1 };

        while (row < list.length && column >= 0) {
            if (list[row][column] == target) {
                found[0] = row;
                found[1] = column;
                return found;
            } else if (list[row][column] > target)
                column--;
            else
                row++;
        }
        return found;
    }
}
