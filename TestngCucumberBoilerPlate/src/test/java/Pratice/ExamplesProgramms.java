package Pratice;

public class ExamplesProgramms {

	public static void main(String[] args) {
		
		String s = removeZeros("Abcd0efg0hi0k0L");
     //System.out.println("Without removing Zeros: " + s);
	}
	
	public static String  removeZeros(String str) {
		int i = 0;
		
		while(i<str.length() && str.charAt(i) == '0') {
			
			i++;
			
			StringBuffer sb = new StringBuffer(str);
			sb.replace(0, i, " ");
			
			System.out.println(sb);
		}
		
		return  str.toString(); 
		
	}

}
