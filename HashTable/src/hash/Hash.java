package hash;

import java.util.HashMap;
import java.util.Map;

public class Hash {


	public static void main(String[] args) {

		String str = "a green animal";

		Map<Character, Integer> hashMap = new HashMap<>();
		for (int i = 0; i < str.length(); i++) {
			hashMap.put(str.charAt(i), 0);

			for (int j = 0; j < str.length(); j++) {
				if (str.charAt(i) == str.charAt(j)) {
					hashMap.put(str.charAt(i), hashMap.get(str.charAt(i))+1);
				}
			}
			if (hashMap.get(str.charAt(i)) == 1) {
				System.out.println(str.charAt(i));
				break;
			}
		}

	}

}
