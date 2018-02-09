package my.learning.arrays;

public class missingNumber {
      // Function to ind missing number
      static int getMissingNo (int a[], int n)
      {
          int i, total;
          total  = (n+1)*(n+2)/2;   
          for ( i = 0; i< n; i++)
             total -= a[i];
          return total;
      }
        
      /* program to test above function */
      public static void main(String args[])
      {
          int a[] = {1,2,4,5,6,7};
          int miss = getMissingNo(a,a.length);
          System.out.println(miss);   
      }
  }
