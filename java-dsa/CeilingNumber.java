
class CeilingNumber {
    public static void main(String[] args) {
        int[] number = { 1, 5, 23, 67, 234, 490, 3234, 6873, 7774, 8422, 8600 };
        int target = 36723;
        int find = binarysearch(number, target);
        System.out.print(find);
    }

    static int binarysearch(int[] no, int target) {
        int start = 0;
        int end = no.length - 1;
        int middle = -1;
        while (end >= start) {
            middle = start + ((end - start) / 2);
            if (no[middle] == target)
                return target;
            else if (target > no[middle])

                start = middle + 1;
            else

                end = middle - 1;

        }
        if (start == no.length)
            return -1;
        else
            return no[start];
    }
}