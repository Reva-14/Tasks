package tasks;

public class CharCount {
	public static void main(String[] args) {
		String s = "Java Is A Simple Programming Languagerr";    
		int count = 0;  
		int num = 0;
		for(int i = 0; i < s.length(); i++) {    
			if(s.charAt(i) != ' ')    
				count++;    
			if(s.charAt(i) == 'r') {
				num++;
			}}   
		System.out.println("Total number of characters in the string is: " + count);   
		System.out.println("Total number of chr 'r' in the given string is : "+num);
	}
}
