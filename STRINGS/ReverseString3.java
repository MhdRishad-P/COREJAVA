
public class ReverseString3 {
	// USING StringBuffer() Method

	public static void main(String[] args) {
		
		String Name="RISHAD";
		StringBuffer StrBuffer=new StringBuffer(Name);
		StringBuffer rev=StrBuffer.reverse();
		
		System.out.println("Reversed String="+rev);

	}

}
