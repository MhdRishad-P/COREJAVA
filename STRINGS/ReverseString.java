
public class ReverseString {
	//USING  A LOOP
		public static void main(String[] args) {
			String Original="RISHAD";
			String Reverse="";
			for(int i=Original.length()-1;i>=0;i--) {
				Reverse=Reverse+Original.charAt(i);
			}
			System.out.println("Reversed ="+Reverse);
			
		}
}
