package search_sort;

public class Searchingsorting{

	
	public static void swap(int[]arr,int i , int j) {
		int temp= arr[j];
		arr[j]=arr[i];
		arr[i]=temp;
	}
	
	public static void bubblesort(int[]arr) {
		for (int i =1; i< arr.length; i++) { 
			for(int j=1;j<arr.length;j++) {
				if (arr[j-1]>arr[j]) {
					swap(arr,j-1,i);
				}
			}
		}
	}
	public static int sequentialSearchIterative(int[]arr, int target) {
		
for (int i = 0; i < arr.length;i++) {
		if (i< arr.length) {
			
		if (target ==arr[i]) {
			return i;
		}
	
		else {
			return -1;
		}
	
}
}
}
	
	
	
	
	
public static int sequentialSearch(int[]arr, int target) {
	

	if (i< arr.length) {
		
	if (target ==arr[i]) {
		return i;
	}
	return sequentialSearch(arr,target,i+1);
	}
	return -1;
}
public static int binarySearch(int[]ar, int target, int startI, int endI) {
	int mid =(startI + endI)/2;
	if (target ==arr[mid]) {
		return mid;
	}
	else if (target < arr[mid]) {
		return binarySearch(arr,target,startI,mid-1);
	}
	else {
		return binarySearch(arr,target ,mid +1 ,endI);
	}
}
}
