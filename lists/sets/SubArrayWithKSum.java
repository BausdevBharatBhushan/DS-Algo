package lists.sets;

import java.util.*;
import java.util.Set;

public class SubArrayWithKSum {

	public static void main(String[] args) {
		int []a= {5,2,1,-3,4,2};
		int k=3;
        boolean found =false;
        
        Set<Integer> set=new HashSet<>();
        
		int sum=0;
		for(int element:a) {
			set.add(sum);
			sum+=element;
			
			if(set.contains(sum-k)) {
				found=true;
				
				break;
			}
			
		}
		System.out.println("found "+found);
		
		
		
		//we are looking for sum -k = value present in set........because sum-value=k , which is our main objective to find k value 
          
	}

}
