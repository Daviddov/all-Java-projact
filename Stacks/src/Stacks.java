import java.util.Stack;

public class Stacks {

	public static void main(String[] args) {
		String str = "abcd";
		Stack<Character> stackStr = new Stack();
		String newString = "";
		for (int j = 0; j < str.length(); j++) {
		stackStr.push(str.charAt(j));
		}
		for (int j = 0; j < str.length(); j++) {

			newString += stackStr.pop();
		}
		System.out.println(newString);
	}

}
