package arrays;

public class ThirdLargest {
public static void main(String[] args) {
int[] a = {4,5,2,3,9,8,10,1,6,15,11};
	
	int first=20,second=20,third=20;
	
	for(int i=0;i<a.length;i++){
		if(a[i]<first){
			third=second;
			second=first;
			first=a[i];
			}else if(a[i]<second) {
				third=second;
				second=a[i];}
			else if(a[i]<third){
				third=a[i];	
		}
		
	}
	System.out.println("First-->"+first);
	System.out.println("second-->"+second);
	System.out.println("third-->"+third);
	
}
	
	
}
