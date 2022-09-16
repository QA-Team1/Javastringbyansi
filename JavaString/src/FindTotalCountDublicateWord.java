//import java.util.Scanner;
public class FindTotalCountDublicateWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Scanner sc= new Scanner(System.in);
		System.out.println("Enter string data:");
		String name = "my name is ansi i am from india i love india";
		String[] word = name.split(" ");
		int count;
		for(int i=0; i<word.length; i++) {
			count=1;
			for(int j=i+1; j<word.length; j++) {
				
				if(word[i].equals(word[j])) {
					count = count+1;
					word[j]="0";
					
					
				}
				
					
			}
			if(word[i]!="0") {
				System.out.println(word[i]+"    "+count);
			}
		}
		
				
		

	}

}
