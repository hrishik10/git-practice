import java.util.Arrays;

class FirstAndLast {
    public static void main(String[] args) {

        int[] arr = { 2, 3, 4, 6, 7, 7, 7, 7, 7, 7, 23, 34, 56, 57 };
        int target = 7;
        int[] ans = { -1, -1 };

        int start = firstandlast(arr, target, true);
        int end = firstandlast(arr, target, false);
        ans[0] = start;
        ans[1] = end;
        System.out.print(Arrays.toString(ans));
    }

    static int firstandlast(int[] nums, int target, boolean arg) {
        int start = 0;
        int found = 0;
        int end = nums.length - 1;
        int middle = -1;
        while (end >= start) {
            middle = start + ((end - start) / 2);
            if (nums[middle] == target) {
                found = middle;
                if (arg)

                    end = middle - 1;
                else

                    start = middle + 1;
            } else if (target > nums[middle])

                start = middle + 1;
            else

                end = middle - 1;

        }
        return found;
    }
}