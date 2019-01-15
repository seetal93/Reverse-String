import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		reverseString();

	}
	
	public static void reverseString() {
		
		System.out.println("Enter in a string: ");
		Scanner read = new Scanner(System.in);
		
		String input = read.nextLine();
		String reverse = "";
		
		for(int i = input.length() - 1; i >= 0; i--) {   // minus 1 from input length --> index from 0
			reverse = reverse + input.charAt(i);   // .charAt(i) --> specifically refers to each entry in the string array
		}
		System.out.println("The reversed string is: ");
		System.out.println(reverse);
	}
		

}
