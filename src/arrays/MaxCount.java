package my.learning.arrays;

public class MaxCount {
 public static int maxCount(int a[]) {
   int max = a[0], maxCount=0;
   int count[] = new int[a.length];
   
   for(int i=0;i<a.length;i++) {
     count[a[i]]++;
     if(count[a[i]]>maxCount) {
       maxCount = count[a[i]];
     }
   }
  return maxCount; 
 }
  public static void main(String[] args) {
    int a[]= {1,1,3,3,3,4,4,4,4,5,6};
    System.out.println(maxCount(a));;
  }
  
}
