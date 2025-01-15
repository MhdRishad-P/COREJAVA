
public class ReverseString2 {

	public static void main(String[] args) {
		// USING toCharArray() Method
		String Name="RISHAD";
		String Rev="";
		char []ch=Name.toCharArray();
		for(int i=ch.length-1;i>=0;i--) {
			Rev=Rev+ch[i];
		}
		System.out.println("Reversed String ="+Rev);
		
		

	}

}
