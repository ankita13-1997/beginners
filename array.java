package p1;

import java.util.Scanner;

public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the amount");
		int amount=sc.nextInt();
	    System.out.println("enter the size of array");
		int a=sc.nextInt();
		int arr[]=new int[a];
		for(int i =0; i<a; i++)
		{
			arr[i]=sc.nextInt();
			
		}
		System.out.print("the array is :");
		for(int i=0; i<a; i++) {
		System.out.print(arr[i] );
           
	}
		for(int i=0 ;i<a ; i++)
		{
			int quitent =amount/arr[i];
			amount= amount%arr[i];
			System.out.println("the amount of "+arr[i]+" present in atm is "+quitent);
			
			
		}

}
}