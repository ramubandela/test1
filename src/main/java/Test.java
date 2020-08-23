
public class Test {

	public static void main(String[] args) {

		String input="abcdcdbaabcd";
		String target="ab";
	boolean check = check(input,target);
	System.out.println(check);
	}

	public static boolean check(String input, String target) {

		boolean status=false;
		
		if(input.contains(target))
		{
			status=true;
		}
		return status;
	}

	
}
