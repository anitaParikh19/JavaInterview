package Array;

public class findSecondLargestElementinArry {

	
	public static int findSecondlargest(int[] arry){
		
		int max1 = Integer.MIN_VALUE;
		int max2 = Integer.MIN_VALUE;
		for(int i=0;i<arry.length;i++){
			if(arry[i]>max1){
				max2=max1;
				max1=arry[i];
			}
		}
		
		return max2;
	}
	
	public static void main(String args[]){
		int[] arry={4,55,245,886,11,59,23,887};
		System.out.println(findSecondlargest(arry));
	}
}
