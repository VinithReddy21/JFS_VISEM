public class print_1_to_10{
	public static void printing(int x,int n){
		if(x>n){
			return;
		}
		System.out.println(x);
		printing(x+1,n);
	}
	public static void main(String args[]){
		int i=1;
		int n=10;
		printing(i,n);
	}
}
