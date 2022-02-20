package feb14;

import java.util.Arrays;
import java.util.Scanner;

public class sum_of_elements_array {

	public sum_of_elements_array() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of array");
		int size=sc.nextInt();
		System.out.println("enter array elements");
		 long[] arr=new long[size];
		 
	        long sum=0;
	        for(int i=0;i<arr.length;i++) {
	        	arr[i]=sc.nextInt();
	        }
	        for(int j=0;j<arr.length;j++) {
	        	sum=sum+arr[j];
	        	
	        	System.out.print((sum)+", ");
	}

}
}