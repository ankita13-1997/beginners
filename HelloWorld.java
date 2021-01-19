package p1;
import java.util.Arrays;
import java.util.Scanner;
//import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
	       Scanner sc=new Scanner(System.in);
	       //System.out.println("enter the ");
	       int n = 100;
	       int m =170;
	       /**int a= 0;
	       int b=1;
	       
	       for(int i =1 ;i<=n ; i++)
	       {
	         System.out.print(a +  ","); 
	         int sum = a+b;
	         a=b;
	         b= sum;
	       }**/
          int t;
	       int sum =0;
	       int a;
	       
	       for(int i =n ; i<m ;i++) {
	    	   t=i;
	       while(i>0) {
	    	    a = i%10;
	    	    i= i/10;
	    	    sum=sum+(a*a*a);
	    	}
	       if(t==sum)
   	    {
   	    
   	    	System.out.println(t);
   	    }
	       
	       
	}}}
