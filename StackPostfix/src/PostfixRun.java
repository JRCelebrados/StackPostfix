
public class PostfixRun extends Postfix {
	
public static void main(String[] args) {
		
		String postfix = "234+*5-";
		int result = evalPostfix(postfix);
		System.out.println(postfix + " = " + result);
		
	}

}
