package my.learning.arrays;

public class AbsArray {
 public static void main(String[] args) {
  int a[]= {1,2,4,2,4};
  int k =0;
  for(int i=0;i<a.length;i++) {
    k = Math.abs(a[i]);
    if(a[k]>=0) {
      a[k]=-a[k];
    }else
      System.out.println(k);
  }
}
  
  
  
}
