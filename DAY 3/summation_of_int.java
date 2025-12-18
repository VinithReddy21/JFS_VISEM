import java.util.*;
public class summation_of_int{
	public static int summing(int n){
		if(n<=0){
			return 0;
		}
		return n%10+summing(n/10);
	}
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int x=summing(n);
		System.out.println(x);
	}
}
