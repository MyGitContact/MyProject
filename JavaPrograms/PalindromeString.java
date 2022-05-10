public class PalindromeString{
public static void main(String[] args){

String s="neveroddoreven";
String temp="";
System.out.println("String to check if Palindrome is :\n"+s);

for(int i=s.length()-1;i>=0;i--){
	temp=temp + s.charAt(i);
	}
if(s.equalsIgnoreCase(temp)){
System.out.println("Status : String is Palindrome");
}
else{
	System.out.println("Ststus : String is not Palindrome");
}
}
}