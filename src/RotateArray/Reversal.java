package RotateArray;

import java.util.Arrays;

public class Reversal {
	public void rotate(int[] arr, int k) {
		if(null == arr || k<0) {
			throw new IllegalArgumentException("Invalid input");
		}
		
		int shift = k;
		if(k>arr.length) {
			shift = k%arr.length;
		}
		
		reverse(arr, 0, arr.length-shift-1);
		reverse(arr, arr.length-shift, arr.length-1);
		reverse(arr, 0, arr.length-1);
		
		System.out.println(Arrays.toString(arr));
	}

	private void reverse(int[] arr, int left, int right) {
		if(null == arr || arr.length == 1) {
			return;
		}
		while(left<right) {
			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			right--;
			left++;
		}		
	}

}
