class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int mid = (nums1.length + nums2.length) / 2;
        int[] arr = new int[mid + 1];
        int left = 0;
        int right = 0;
        int count = 0;
        while (count < mid + 1) {
            if (left < nums1.length && right < nums2.length && nums1[left] < nums2[right]) {
                arr[count++] = nums1[left++];
            } else if (right < nums2.length) {
                arr[count++] = nums2[right++];
            } else if (left < nums1.length) {
                arr[count++] = nums1[left++];
            }
        }
        if ((nums1.length + nums2.length) % 2 != 0) {
            return arr[mid];
        } else {
            return (arr[mid] + arr[mid - 1]) / 2.0;
        }
    }
}