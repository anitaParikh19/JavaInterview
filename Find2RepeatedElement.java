package Array;

public class Find2RepeatedElement {

	
	public static void main(String args[]){
		
		int[] a={1,2,3,4,5,6,4,5};
		int sum=0, mul=1;

		for(int i=0;i<a.length;i++){
			sum =sum + a[i];
			mul=mul*a[i];
		}
		
		int n = a.length-2;
		int nsum = n*(n+1)/2;
		int x=0,y=0;
		
		//(x+y)^2-4xy = (x-y)^2
		
		//d =x-y
		sum =sum-nsum;
		mul=mul/fact(a.length-2);
		System.out.println(fact(a.length-2));
		System.out.println(mul);
		int d =(int)  Math.sqrt((sum*sum-4*mul));
	    System.out.println("diff"+d);
		x= (sum+d)/2;
	    y=(sum-d)/2;
	    
	    System.out.println(x);
	    System.out.println(y);
	}
	
	static int fact(int n) 
    {
        return (n == 0) ? 1 : n * fact(n - 1);
    }
}
