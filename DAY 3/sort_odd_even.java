import java.util.*;
class sort_odd_even {
    public static List<Integer> Order(int[] arr) {
        List<Integer> list1 = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                list1.add(arr[i]);
            }
			else if (arr[i] % 2 == 0) {
                list2.add(arr[i]);
            }
        }
		if(list1.size()>=list2.size()){
			for(int num : list2){
				list1.add(num);
			}
			return list1;
		}
		else{
			for(int num : list2){
				list2.add(num);
			}
			return list2;
		}
	
			
    }

    public static void main(String[] args) {
        int[] arr = {12, 27, 7, 4, 6, 2, 3, 5, 1, 16};
        List<Integer> list = Order(arr);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
