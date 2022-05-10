public class FrequencyOfChar{

public static void main(String[] args){

System.out.println("String from which frequency to be checked is : ");

String s="Welcome to velocity family";

System.out.println(s);


char f='z';
int count=0;	

for(int i=0;i<=s.length()-1;i++){

	if(f==s.charAt(i)){
	count++;
	}
}
System.out.println("Frequency of "+f+" is : ");
System.out.println(count);

}

}