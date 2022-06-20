import java.util.*;

class Add_num
{

	public static void main(String[] args)
	{

		Scanner sc=new Scanner(System.in);
		int sum=0;
		
		System.out.println("Enter number to add and press '0' to terminate = ");
		for(int i=1;true;i++)
		{

			int n=sc.nextInt();

			if(n==0)
			break;

			sum = sum+n;
		}
		
		System.out.println("total sum = "+ sum);
	}
}



