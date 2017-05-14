package stringProb;

public class PalinDrome {

//using for loop
	
static boolean palin(String s){
	if(s.length()==0||s.length()==1)
		return true;
	String rev ="";
	for(int i =s.length()-1;i>=0;i--){
		rev +=s.charAt(i);
	}
	return s.equalsIgnoreCase(rev);
}


//using recursion

static boolean ispalin(String s){
	String str = s.toLowerCase();
	if(str.length()==0||str.length()==1)
		return true;
	if(str.charAt(0)==str.charAt(str.length()-1))
		return ispalin(str.substring(1, str.length()-1));
	return false;
}


//number palindrome

static void numPalin(int number){
	
	int rev =0;
	int num = number;
	while(num!=0){
		
		int rem = num % 10;
		rev = rev *10 + rem;
		num = num /10;
		
	}
	if(number==rev)
		System.out.println("Number is palin");
	else
		System.out.println("Number is not palin");
	
}

//number palin using recursive






public static void main(String[] args) {
	
	if(palin("Madam"))
		System.out.println(" Palin");
	else
		System.out.println("NOT Palin");
	
	if(ispalin("Madam"))
		System.out.println("Palin");
	else
		System.out.println("NOT Palin");
	numPalin(535);
	
}





}



