//Finding total number of vowels in String
class TotalCountOfVowelsInString{

	public static void main(String[] args){

		String str="\"welcome to java world\"";

		
		int count=0;
		for(int i=0;i<str.length()-1;i++){
			
			char rq=str.charAt(i);
			if((rq==('a'))||(rq==('e'))||(rq==('i'))||(rq==('o'))||(rq==('u'))){
				count++;
			}
			
		}
			
		
		System.out.println("Total number of vowels in given string "+str+ "are : "+ count);
	}
}