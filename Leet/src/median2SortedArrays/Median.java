package median2SortedArrays;

public class Median {

	public static void main(String args[]) {
		int[] a = { 1, 3 };
		int[] b = { 2, 4 };

		System.out.println(findMedianSortedArrays(a, b));
	}

	static public double findMedianSortedArrays(int[] nums1, int[] nums2) {
		int l1 = nums1.length;
		int l2 = nums2.length;
		int total = l1 + l2;

		if (total % 2 == 1) {
			return findKth(nums1, 0, nums2, 0, total / 2 + 1);
		} else {
			return (findKth(nums1, 0, nums2, 0, total / 2) + findKth(nums1, 0, nums2, 0, total / 2 + 1)) / 2.0;
		}
	}

	static private int findKth(int[] nums1, int start1, int[] nums2, int start2, int k) {
		if (start1 >= nums1.length) {
			return nums2[start2 + k - 1];
		}

		if (start2 >= nums2.length) {
			return nums1[start1 + k - 1];
		}

		if (k == 1) {
			return Math.min(nums1[start1], nums2[start2]);
		}
		int index1 = start1 + k / 2 - 1;
		int index2 = start2 + k / 2 - 1;
		int key1 = index1 < nums1.length ? nums1[index1] : Integer.MAX_VALUE;
		int key2 = index2 < nums2.length ? nums2[index2] : Integer.MAX_VALUE;

		if (key1 < key2) {
			return findKth(nums1, start1 + k / 2, nums2, start2, k - k / 2);
		} else {
			return findKth(nums1, start1, nums2, start2 + k / 2, k - k / 2);
		}
	}

}
