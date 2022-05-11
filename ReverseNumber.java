line1
line2
public class ReverseNumber
{
public static void main(String[] args)
{

int num=153;
int rev=0;
int temp;

System.out.println("The number to be reversed is : "+num);

while(num>0)
	{
	temp=num%10; 		//temp=3 temp=5 temp=1
	rev = rev*10+temp;	//rev=3 rev=35 rev=351
	num=num/10; 		//	num=1
	}

System.out.println("The number after reversal is : "+rev);
}


}
