import java.util.Scanner;
public class LargestOfTwo{

public static void main(String args[])
{
	Scanner ck=new Scanner(System.in);
	System.out.print("Enter First value:");
	int firstNumber=ck.netInt();
	System.out.print("Enter Second value:");
	int secondNumber=ck.nextInt();
	if(firstNumber>secondNumber)
	{
		System.out.println(firstNumber+" is largest");
	}
	else{
		System.out.println(secondNumber+" is largest");
	}