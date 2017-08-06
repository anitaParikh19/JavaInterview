package Array;

public class FindSingleNonDuplicateElement {

	public static void main(String args[]){
		
		int[] a={2,4,51,6,9,2,4,6,9};
		
		int c=0;
		for(int i=0;i<a.length;i++){
			c= c^a[i];
		}
		
			System.out.println(c);
	}
}
