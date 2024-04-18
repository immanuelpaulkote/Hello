import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CoreJava1 {

	public static void main(String[] args) {
/*		int[] arr=new int[5];
		arr[0]=9;
		arr[1]=10;
		arr[2]=22;
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		int[] arr2= {1,2,3,4,5,6,7,8,9};
		for(int i=0;i<arr2.length;i++) {
			if(arr2[i]%2==0) {
				System.out.println(arr2[i]);
				break;
				}
			else {
				System.out.println(arr2[i]+" is not a even num");
			}
			
		}
    	for(int num:arr2) {
			System.out.println(num);
		}*/
		ArrayList<String> al=new ArrayList();
		al.add("hello");
		al.add("hai");
		al.add("welcome");
		System.out.println(al.get(2));
		System.out.println(al.contains("hai"));
		
		int[] arr2= {1,2,3,4,5,6,7,8,9};
		List<int[]> nameArrayList=Arrays.asList(arr2);
		System.out.println(nameArrayList.contains(2));
		System.out.println("Hello");
		System.out.println("HelloX1");
		System.out.println("HelloX2");
		System.out.println("jehfvjwhbvfjwv");
		System.out.println("ewkjfkjabvak");


		
		

	}

}
