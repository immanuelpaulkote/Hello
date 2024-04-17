
public class CoreJava2 {

	public static void main(String[] args) {
		
		String s1="Welcome";
		String s2=new String("hello");
		String s3="Hello welcome to new world";
		String[] split=s3.split(" ");
		//System.out.println(split[2]);
		for(int i=s3.length()-1;i>=0;i--) {
			System.out.println(s3.charAt(i));
		}
		
		

	}

}
