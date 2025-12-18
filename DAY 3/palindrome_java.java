import java.util.*;
public class palindrome_java{
	public static boolean palindrome(String s , int i , int j){
		if(i>=j){
			return true;
		}
		else if(s.charAt(i)!=s.charAt(j)){
			return false;
		}
		else{
			return palindrome(s,i+1,j-1);
		}
	}
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		String s= sc.nextLine();
		int size=s.length();
		if(palindrome(s,0,size-1)){
			System.out.println("palindrome");
		}
		else{
			System.out.println("Not palindrome");
		}
	}
}
		