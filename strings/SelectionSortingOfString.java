package strings;

import java.util.Arrays;

public class SelectionSortingOfString {

	public static void main(String[] args) {

		String s ="qwertyyyyuiopaaaaaaaasdfghjklzxcvbnm";
		
		char c[]=new char[s.length()];
		for(int i = 0; i<s.length(); i++) {
			c[i]=s.charAt(i);
		}
//		for(int i = 0; i<s.length()-1; i++) {
//			int minInd =i;
//			for(int j =i+1; j<s.length(); j++) {
//				if((int)c[j]<(int)c[minInd]) 
//					minInd=j;
//			}	
//			    char temp = c[i];
//			    c[i]=c[minInd];
//			    c[minInd]=temp;
//			
//		}
		Arrays.sort(c);                  //instead of all the committed codes, using this pre defined function solves every problem
		
		s=String.valueOf(c);
		System.out.println(c);

	}

}
