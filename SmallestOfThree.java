public class SmallestOfThree
{
	public static void main(String[] args)
{
	int a=36,b=35,c=56;
  if(a<=b){
	if(a<=c){
		System.out.println(a+"is smallest number");
	}
	else
	{
		System.out.println(c+"is smallest number");
	}
	}
  else{
	if(b<=c)
	{
		System.out.println(b+"is smallest number");
	}
	else{
		System.out.println(c+"is smallest number");
	}
	}
	}
	}