package LogicalPrograms;

import java.util.HashMap;
import java.util.Set;

public class find_repeating_String_in_paragraph {

	public static void main(String[] args) {
		String str = "abc abc xyz abc abb xyz abb abc abc xyz abb pqr";

		// 1. convert String/paragraph into Array
		String ar[] = str.split(" ");

		for (int i = 0; i <= ar.length - 1; i++) {
			System.out.println(ar[i]);
		}

		// 2. Create HashMap
		HashMap<String, Integer> map = new HashMap<String, Integer>();

		// 3.
		for (int i = 0; i <= ar.length - 1; i++) {
			String s1 = ar[i];

			if (map.containsKey(s1)) {// true
				map.put(s1, map.get(s1) + 1);
			} else {
				map.put(s1, 1);
			}
		}

		System.out.println(map);// {abb=3, pqr=1, abc=5, xyz=3}

		Set<String> keys = map.keySet();

		for (String key : keys) {
			System.out.println(key + ":" + map.get(key));
		}
	}
}
