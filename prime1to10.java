public class prime1to10
{
public static void main(String[] args)
{
System.out.println("Prime numbers Between 1 to 20 are : ");

int a=20;

int flag=0;
int count=0;

for(int i=2;i<=a;i++)	
{
	for(int j=2;j<i;j++)
	{
		if(i%j==0)
		{
		flag=1;
		}
	}
	if(flag==0)
	{
	System.out.print(i+" ");
	count++;
	}
	else
	{
	flag=0;
	}
}
System.out.println();
System.out.println("There are "+count+" prime numbers");

}
}