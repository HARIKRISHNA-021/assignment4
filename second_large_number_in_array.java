package feb14;

import java.util.Arrays;
import java.util.Scanner;

public class second_large_number_in_array {

	public second_large_number_in_array() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner sc=new Scanner(System.in);
		//int size=sc.nextInt();
		int[]arr1= {1,3,8,5,6,1};
		Arrays.sort(arr1);
		int l=arr1.length;
		System.out.print(arr1[l-2]);
	}

}
