public class numPrintWOLoops{

public void printMethod(int a)
{
	if(a<=20)
	{
	System.out.println(a);
	printMethod(a+1);
	}
}

public static void main(String[] args)
{
	numPrintWOLoops np=new numPrintWOLoops();
	np.printMethod(1);


}


}