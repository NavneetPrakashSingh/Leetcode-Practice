package RotateArray;

public class Main {
	public static void main(String[] args) {
		int[] arr = new int[] {1,2,3,4,5,6,7};
		int numberOfSwaps = 2;
		
		Reversal reversalObj = new Reversal();
		reversalObj.rotate(arr, numberOfSwaps);
		
		BubbleRotate bubbleRotateObj = new BubbleRotate();
		bubbleRotateObj.rotate(arr, numberOfSwaps);
		
		IntermediateArray intermediateObj = new IntermediateArray();
		intermediateObj.rotate(arr, numberOfSwaps);
	}
}
