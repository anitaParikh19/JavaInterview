package StringExamples;
/**
 * Set  = [a,b,c]
power_set_size = pow(2, 3) = 8
Run for binary counter = 000 to 111

Value of Counter            Subset
    000                    -> Empty set
    001                    -> a
    010                    -> b
    011                    -> ab
    100                    -> c
    101                    -> ac
    110                    -> bc
    111                    -> abc
 */
import java.util.BitSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class PowerSet {

	
	public static void formualteBitset(int[] arry){
	
		HashSet<HashSet<Integer>> outerset = new HashSet<HashSet<Integer>>();
		
		for(int i =0;i< Math.pow(2,arry.length);i++){
		
			String binary = Integer.toBinaryString(i);
			
			BitSet bitset = setbit(binary, arry.length);
			if(bitset.cardinality()==2){
				HashSet<Integer> set = new HashSet<Integer>();
				
				for(int j=0;j<arry.length;j++){
					if(bitset.get(j)==true){
						set.add(arry[j]);
					}
				}
				outerset.add(set);
			}
		}
	}

	private static BitSet setbit(String m, int length) {
		
		BitSet bitset= new BitSet(length);

		int l= length-1;
		for(int k=m.length()-1; k>=0;k--,l--){
			if(m.charAt(k)=='1'){
				bitset.set(l);
			}
		}
	
	   return bitset;
	}
	
	
	public static void main(String args[]){
		int[] arry ={1,2,3,4};
		formualteBitset(arry);
	}
}
