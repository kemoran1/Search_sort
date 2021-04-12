package search_sort;

public class Tester {

	public static void main(String[]args) {
		int[] num= {13,20,22,56,75,99};
		int target= 15;
		int location=SearchingSorting.binarySearch(num,target,0,num.length-1);
				System.out.println("Target= "+ target+"\nLocation"+ location);
	}
	
}
