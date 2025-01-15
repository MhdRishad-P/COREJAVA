
public class ReverseString4 {
	//USING StringBuilder() method

	public static void main(String[] args) {
		String Name="RISHAD";
		StringBuilder StrBuilder=new StringBuilder(Name);
		StringBuilder rev=StrBuilder.reverse();
		System.out.println("Reversed String = "+rev);

	}

}
