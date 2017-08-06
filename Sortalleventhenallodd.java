package Array;
//You have an array of int with different numbers. You have to sort it in a way that the all the even numbers should come in the starting and
//odd numbers in the end. You cannot use a temp array or extra array in your solution.  
public class Sortalleventhenallodd {

	
	public static int[] sortSeq(int[] arry){
		int j=0;//pointer to track even no
		
		for(int i=0;i<arry.length;i++){
			
			if(arry[i]%2==0){
				//swap
				int temp= arry[j];
				arry[j] = arry[i];
				arry[i] = temp;
				j++;
			}
		}
		return arry;	
	}
	
	public static String returnstring(int i){
		return ""+i;
	}
	
	public static void main(String args[]){
		int[] arry ={22,33,565,3424,9009,774764};
		int [] arry2 = sortSeq(arry);
		for(Integer i:arry2)
		System.out.println(i);		
	}
}
