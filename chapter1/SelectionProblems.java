package chapter1;

import java.lang.reflect.Array;
import java.util.Date;

public class SelectionProblems { // 选择问题：一组N个数，确定其第k个最大者

	private static int N = 40000; // 总个数
	private static int k = N / 2; // 要确定的数序号

	// 排序1，从大到小排列，取k-1位置数字
	public static int sort1(int[] nums) {
		int temp = 0;
		int[] arr = new int[nums.length];

		for (int j = 0; j < arr.length; j++) {
			for (int i = 0; i < nums.length; i++) {
				if (j > 0) {
					if (temp < nums[i] && nums[i] <= arr[j - 1]) {
						temp = nums[i];
					}
				} else if (j == 0) {
					if (temp < nums[i]) {
						temp = nums[i];
					}
				}
			}
			arr[j] = temp;
			temp = 0;
		}

		for (int i = 0; i < nums.length; i++) {
			System.out.println("nums[" + i + "]" + nums[i]);
		}

		printArr(arr);
		return arr[k - 1];
	}

	// 排序2，从大到小排列，毁掉原数组
	public static int[] sort2(int[] nums) {
		int index = 0;
		int temp = 0;
		int[] arr = new int[nums.length];

		for (int i = 0; i < arr.length; i++) {
			index = getMax(nums);
			temp = nums[index];
			arr[i] = temp;
			Array.setInt(nums, index, -1);
		}
		printArr(arr);
		return arr;
	}

	public static void printArr(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "]" + arr[i]);
		}
		System.out.println("=====");
	}

	// 取最大值
	public static int getMax(int[] nums) {
		int index = 0;
		for (int i = 0; i < nums.length; i++)
			if (nums[i] >= nums[index])
				index = i;

		return index;
	}

	public static int getKthMax(int[] nums) {
		//nums = sort2(nums);
		Date start = new Date();
		int index = 0;
		for (int i = 0; i < k; i++) {
			index = getMax(nums);
			//System.out.println(i + "<----->" + nums[index]);
			if (i < k - 1) {
				// printArr(nums);
				Array.setInt(nums, index, -1);
			}
		}
		Date end = new Date();
		long s = end.getTime() - start.getTime();
		System.out.println("花费时间：" + s  + "ms");
		return nums[index];
	}

	public static void main(String[] args) {
		int[] nums = new int[SelectionProblems.N];
		for (int i = 0; i < nums.length; i++) {
			int r = (int) (100000 * Math.random());
			nums[i] = r;
		}
		int result = SelectionProblems.getKthMax(nums);
		System.out.println("结果是：" + result);

	}
}
