package interview;

import java.util.HashMap;
import java.util.Map;

class Pair {

	int index;
	int count;

	public Pair(int index) {
		this.index = index;
		this.count=1;
	}

	public void incCount() {
		this.count++;
	}

}

public class FrstNonRepeatingCharacter {

	public static void main(String[] args) {

		String str = "gueeksforgeeksfzo";

		Map<Character, Pair> map = new HashMap<Character, Pair>();
		for (int i = 0; i < str.length(); i++) {
			if (map.containsKey(str.charAt(i))) {
				map.get(str.charAt(i)).incCount();
			} else {
				map.put(str.charAt(i), new Pair(i));
			}
		}
		int charInd=Integer.MAX_VALUE;
		for (Map.Entry<Character, Pair> entry : map.entrySet())
        {
            int c=entry.getValue().count;
            int ind=entry.getValue().index;
            if(c==1 && ind < charInd)
            {
            	charInd=ind;
            }
        }
		System.out.println(str.charAt(charInd));
	}

}
