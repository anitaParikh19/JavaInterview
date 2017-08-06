//incompelete 

/**An excel sheet has different rows and columns. For example, for column A, row number is 0. For column Z, row number is 25. After column Z, it again starts like AA, AB, AC...Write program to get the column name based on a number. The method should take 
*any number and return the column name corresponding to that.  
* a to z 1 to 26 , AA to AZ 27 to 52
* a 1
* z 26
* aa  ba .....za
* ..  ..  .. ...
* az  bz......zz
* formula : pow(26,i)*key(LHS)+pow(26,i)*key+....
* 
* aac ==> 26*26* key of a + 26 * key of a + key of c
*/
package Array;

import java.util.HashMap;

public class findCorrespoingColumnFromExcel {

	
	//firstkeykey+(26+secondkey)+(26+26+thirdkey);
	public static int print(char[] arry){
		HashMap m = new HashMap<Character, Integer>();//stores 1 to 26
		int k=97;
		int l =1;
		for(char ch='a';ch <='z';ch++){
			m.put(ch, l);
			k++;l++;
		}
		
		
		int totalvalue=0;
		int j=arry.length-1;
		for(int i=0;i<arry.length;i++){
			
			if(m.containsKey(arry[i])){
				Integer value = (Integer) m.get(arry[i]);
				System.out.println(value);
				System.out.println("total:"+totalvalue+"i:"+i+ "math pow:"+Math.pow(26, i));
				
				totalvalue = (int) (Math.pow(26, j)*value)+totalvalue;
				j--;
				System.out.println(totalvalue);
			}
		}
		return totalvalue;
	}

	public static void main(String args[]){
		char[] arry ={'a','a','c'};
		System.out.println(print(arry));
	}
	
}
