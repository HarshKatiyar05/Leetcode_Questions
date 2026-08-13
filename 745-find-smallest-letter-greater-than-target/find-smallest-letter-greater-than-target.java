class Solution {
    public char nextGreatestLetter(char[] arr, char target) {
        int s = 0;
        int e = arr.length - 1;
        int ans = -1;

        while (s <= e) {
            int mid = s + (e - s) / 2;

            if (arr[mid] > target) {
                ans = mid;
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }

        if (ans == -1) {
            return arr[0];
        }

        return arr[ans];
    }
}