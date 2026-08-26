class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int ii = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while (ii >= 0 && j >= 0) {

            if (nums1[ii] > nums2[j]) {
                nums1[k] = nums1[ii];
                ii--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }

            k--;
        }

        while (j >= 0) {
            nums1[k] = nums2[j];
            j--;
            k--;
        }
    }
    
}