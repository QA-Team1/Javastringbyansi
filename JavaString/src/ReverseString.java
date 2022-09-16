
public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "my name is anshi.i am from india";
		
		char[] chars = name.toCharArray();
		int length = chars.length;
		
		System.out.println("string length is:"+length);
		
		for (int i = length-1; i>=0; i--) {
			System.out.print(chars[i]);
		}
		
		

	}

}
