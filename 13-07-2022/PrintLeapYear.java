import java.util.Scanner;
class PrintLeapYear {
	public static void main(String args[])
	{
	int startyear,endyear,i;
	Scanner ck=new Scanner(System.in); //create a scanner object to get user input
	System.out.print("Enter the starting year:"); //get the start year from user
	startyear=ck.nextInt();
	System.out.print("Enter the end year:"); //get the end year from user
	endyear=ck.nextInt();
	System.out.print("Leap years:"); //print the leap year
		for(i=startyear;i<=endyear;i++) //loop between start and end year
		{	
			if(i%4==0)
		System.out.println(i); //print the leap years between start and end years	
		}	
	}
	}