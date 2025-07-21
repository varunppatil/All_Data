import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> list = new ArrayList<>(Arrays.asList(33,342));
		
		//String str= list.remove(0);
		
		System.out.println(list);
		
		for (int k = 0, j = list.size() - 1; k < j; k++) 
        {
			list.add(k, list.remove(j));
			System.out.println(list);
        }

		
	}

}
