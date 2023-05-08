public class BinarySearch {
    public static void main(String[] args) {
        int[] strings = new int[128];
        for (int i = 0; i < strings.length; i++) {
            strings[i] = i * i;
        }
        System.out.println(binarySearch(strings,4));
    }

    public static int binarySearch(int[] strings, int s) {
        int result = -1;
        int low = 0;
        int high = strings.length - 1;
        while (low != high) {
            int mid = (low + high) / 2 + 1;
            int ques = strings[mid];
            if (ques == s) {
                return mid;
            }
            if (ques > s) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }
}
