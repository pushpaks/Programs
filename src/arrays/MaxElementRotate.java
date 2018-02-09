package my.learning.arrays;

public class MaxElementRotate {

  public static int binarySearch(int a[], int start, int end) {
    int max,mid;
    mid=(start+end)/2;
    if(start==end){   
     max=a[start]>a[end]?a[start]:a[end];
     return max;
    }
  //  if(start<=end) {
 //     return a[start];
   // }
  //  int mid = (start + end) / 2;
    if (a[mid] >=a[end]) {
      return binarySearch(a, mid+1, end);
    } else if (a[start] >=a[mid]) {
      return binarySearch(a, start, mid);
//    } else {
//      return a[end];
    }
    return -1;
  }

  public static void main(String[] args) {
    int a[] = {13,14,16,17,18,19,12};
    int max = binarySearch(a, 0, a.length-1);
    System.out.println(max);
  }
}

