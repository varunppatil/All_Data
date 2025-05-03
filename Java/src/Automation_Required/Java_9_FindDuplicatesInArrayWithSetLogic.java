package Automation_Required;

import java.util.HashSet;

public class Java_9_FindDuplicatesInArrayWithSetLogic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arrToCheck = { 67, 5, 67, 26, 5, 2, 90 };

		HashSet<Integer> notRepeated = new HashSet();
		HashSet<Integer> duplicate = new HashSet();

		for (int arr : arrToCheck) {
			if (!notRepeated.add(arr)) {
				duplicate.add(arr);
			}

		}
		System.out.println(duplicate);
	}

}
