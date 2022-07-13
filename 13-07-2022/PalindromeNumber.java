import java.util.Scanner;
class PalindromeNumber
{

public static void main(String args[])
{
	int num,sum=0;
	
	Scanner ck=new Scanner(System.in);     //create a scanner object to get the input
	System.out.println("Enter a Number:"); //get the number for user
	num=ck.nextInt();
	int copy=num;
	while(num!=0)  //loop for number
	{
	int rem=num%10;  //getting remainder 
	sum=sum*10+rem;
	num=num/10;
	}
	if(sum==copy)  //condition for checking the no 
	{
	System.out.println(copy+"is a palindrome");  //print the number is palindrome or not
	}
	else
	{
	System.out.println(copy+"is not a palindrome");
	}
}
}