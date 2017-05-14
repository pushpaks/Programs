package stringProb;

import java.util.HashSet;
import java.util.Set;

public class PalinPermutation {
	
	
	public static void main(String[] args) {
		
		if(!hasPalindromePermutation("Tact Coa"))
			System.out.println("not a palin permutation");
		else
			System.out.println("has a palain permutaion");
		
		
		
	}


	  public static boolean hasPalindromePermutation(String theString) {

	      // track characters we've seen an odd number of times
	      Set<Character> unpairedCharacters = new HashSet<Character>();

	      for (char c : theString.toLowerCase().toCharArray()) {
	          if (unpairedCharacters.contains(c)) {
	              unpairedCharacters.remove(c);
	          } else {
	              unpairedCharacters.add(c);
	          }
	      }

	      // the string has a palindrome permutation if it
	      // has one or zero characters without a pair
	      return unpairedCharacters.size() <= 1;
	  }
}
