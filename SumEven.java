import java.util.Scanner;
class SumEven 
{
	public static int[] store()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the size of the array");
		int size=sc.nextInt();
		int []arr=new int[size];
		System.out.println("Please enter the array elemnts");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		return arr;
	}
	public static void print(int [] a)
	{
		int sum=0;
		for (int i=0;i<a.length ;i++ )
		{
			if(a[i]%2==0)
			{
				sum=sum+a[i];
			}

		}
		System.out.println("the sum even numbers is"+sum);
	}
	public static void main(String[] args) 
	{
		int []a=store();
			print(a);
	}
}
