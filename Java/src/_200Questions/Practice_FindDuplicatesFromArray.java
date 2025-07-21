package _200Questions;

import java.util.HashMap;
import java.util.Map;

public class Practice_FindDuplicatesFromArray {

	public static void main(String[] args) {

		int str[] = { 56, 56, 29, 78, 6713,33,48, 452, 33, 56, 67, 48, 62, 99};

		HashMap<Integer, Integer> hm = new HashMap<>();

		for (int i = 0; i < str.length; i++) {
			if (hm.containsKey(str[i])) {
						hm.put(str[i], hm.get(str[i]) + 1);
					} else
						hm.put(str[i], 1);
		}
		int count =1;
		for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {

			if(entry.getValue()>count) {
				//count = entry.getValue();
				System.out.println(entry.getKey() + " " +"value present "+ entry.getValue()+" times");
			}
			//count =1;
		}
	}

}
