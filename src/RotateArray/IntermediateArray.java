package RotateArray;

import java.util.Arrays;

public class IntermediateArray {
	public void rotate(int[] arr, int k) {
		int shift = k;
		int[] outputArray = new int[arr.length];
		
		if(k > arr.length) {
			shift = k%arr.length;
		}
		
		for(int i=0;i<arr.length-shift;i++) {
			outputArray[shift+i] = arr[i];
		}
		
		int j=0;
		for(int i=arr.length-shift;i<arr.length;i++) {
			outputArray[j] = arr[i];
			j++;
		}
		
		System.out.println(Arrays.toString(outputArray));
	}

}
