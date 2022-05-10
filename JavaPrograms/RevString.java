public class RevString{

public static void main(String[] args){

String rev="";

System.out.println("String before reversal is : ")	;
String r="This is Velocity Family";
System.out.println(r);
	for(int i=r.length()-1;i>=0;i--)
	{
		rev=rev+r.charAt(i);	
	}

	System.out.println("Reversed String is : ");
	System.out.println(rev);
}

}