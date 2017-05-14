package arrays;

public class ArrayMin {

static int [] array = {21,11,12,9,10};

int minArray(int[] min){
	int minIndex = 0;
	
	for(int i= 0;i < min.length;i++){
		if(min[minIndex] < min[i]){
			minIndex = min[i];
		}
	}
	return minIndex;
}

public static void main(String[] args) {
	 ArrayMin arrayMin = new ArrayMin();
	System.out.println(arrayMin.minArray(array)); 
	 
}	
	
}
