package Array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class findMultipleDuplicatein1to100 {

	public static ArrayList<Integer> findDuplicate(int[] arry){
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		ArrayList<Integer> l1 = new ArrayList<Integer>();
		int k=0;
		for(int i=0;i<arry.length;i++){
			
			if(map.containsKey(arry[i])){
				l1.add(arry[i]);
			} else {
				map.put(arry[i], 1);
			}
		}
		
		return l1;
	}
}
