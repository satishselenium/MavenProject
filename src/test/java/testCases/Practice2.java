package testCases;

public class Practice2 {

	static {
		System.out.println("Hello world");
	}
	
	public static void main(String[] args) {
		
		String input = "satisfghfttytytyhthtgbgngjhjhkyuyuynsfdgdgrttrtrtrtrtrtrh";
		String CountedChar = "";
		int match = 0;
		char[] inputchar = input.toCharArray();
		for (int i = 0;i<=input.length()-1;i++) {
			for(int j=0;j<=input.length()-1;j++) { //aaaaaaaaaa
				if (CountedChar.contains(Character.toString(inputchar[i]))){
					break;
				}
				if (inputchar[i]==inputchar[j]) {
					match =match+1;
				}
			}//aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa
			if (match>0) {
				CountedChar =CountedChar+inputchar[i];
				System.out.println("the occurance of character  "+inputchar[i]+"  is = "+match);
			}		
			match = 0;
		}
	}
	
	public static void printNumber(int number) {
		if(number <= 5) {
			System.out.println(number);
			number++;
			printNumber(number);			//Note: method calling itself
		}else {
			System.exit(0);
		}
	}
	
	//count occurance of character in a string


	
	
	
	
	

}