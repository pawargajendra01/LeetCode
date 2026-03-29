class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] arr = new int[nums1.length + nums2.length];
        int left = 0;
        int right = 0;
        int count = 0;
        while (count < arr.length) {
            if (left < nums1.length && right < nums2.length && nums1[left] < nums2[right]) {
                arr[count++] = nums1[left++];
            }
            else if (right < nums2.length && (left >= nums1.length || nums2[right] <= nums1[left])) {
                arr[count++] = nums2[right++];
            }
            else {
                arr[count++] = nums1[left++];
            }
        }
        if(arr.length%2!=0){
            return arr[arr.length/2];
        }
        else{
            return (arr[(arr.length/2)-1]+arr[(arr.length/2)])/2.0;
        }
    }
}