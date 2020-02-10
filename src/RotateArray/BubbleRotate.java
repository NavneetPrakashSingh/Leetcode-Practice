package RotateArray;

import java.util.Arrays;

public class BubbleRotate {
	public void rotate(int[] arr, int k) {
		if(arr == null || k<0) {
			throw new IllegalArgumentException("Illegal input");
		}
		
		int shift = k;
		if(arr.length<k) {
			shift = k%arr.length;
		}
		
		for(int i = 0;i<shift;i++) {
			for(int j=arr.length-1;j>0;j--) {
				int temp = arr[j];
				arr[j] = arr[j-1];
				arr[j-1] = temp;
			}
		}
		
		System.out.println(Arrays.toString(arr));
	}
}
