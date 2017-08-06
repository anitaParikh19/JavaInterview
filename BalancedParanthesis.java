import java.util.Stack;

/*.Determine whether a list of parentheses "[()]{}...etc" are balanced or unbalanced.*/
/** to count no of paranthesis if they are event/ odd
 *  using stack, convert string to array and then  push brackets as they come and pop as we find match 
 *   
 * 
 */
public class BalancedParanthesis {

	
	public static void main(String args[]) {
		
		String test ="(){<>()}";
		
        Stack<Integer> s = new Stack();
        
        String[] strArray = test.split("");
    	char[] ch=test.toCharArray();

        
        for(int i =0; i< ch.length ; i++){
        	int asccii = ch[i]; //40,41  91,93 123 125 60,62
        	if(asccii==40 || asccii ==91 || asccii==123 || asccii ==60)
        	{
        		s.push(asccii);
        		//add it to the stack
        	}
        	else {
        		if(!s.isEmpty() && (asccii==41 || asccii ==93 || asccii==125 || asccii ==62)){
	        		int stackTop = s.peek();
	        		if(((stackTop+1 )== asccii) || (stackTop+2 ==asccii)){
	        		 //check the top elements corresponds then pop 
	        			s.pop();
	        		}
	        		else {
	        			break;
	        		}
	        	}
        	}
        	
        }
        
        if(s.isEmpty()){
        	System.out.println("paranthesis is balanced ");
        } else{
        	System.out.println("paranthesis is NOT balanced ");
            
        }
	}
}
