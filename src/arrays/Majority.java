package arrays;

public class Majority {
	
void printMajority(int a[]){
	
	int candidate = findCandidate(a);
	
	if(isMajority(a,candidate))
		System.out.println("Majority");
	else
		System.out.println("No Majority");
	
}
	
public int findCandidate(int a[]){
	int auxIndex = 0, count =1;
	
	for(int i=1;i<a.length;i++){
		if(a[auxIndex]==a[i])
			count++;
		else count --;
		
		if(count==0)
			auxIndex=i;
		count =1;
		
	}
	return a[auxIndex];
}
	
	
	
public boolean isMajority(int a[],int candidate){
	
	int i,count=0;
	for(i=0;i<a.length;i++){
		if(a[i]==candidate)
			count++;
	}
	if(count>a.length/2)
		return true;
	else
		return false;
}

public static void main(String[] args) {

	Majority maj =  new Majority();
	int a[] = {1,5};
	maj.printMajority(a);
}

}
