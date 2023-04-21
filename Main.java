import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    int arr1[] = new int[100];
    int arr2[] = new int[100];
    int arr3[] = new int[100];
    int n, mm = 1, ctr = 0;
    int i, j;

    Scanner input = new Scanner(System.in);

    System.out.println("Count total number of duplicate elements in an array:");
    System.out.println("---------------------------------------------------------");

    System.out.print("Input the number of elements to be stored in the array : ");
    n = input.nextInt();

    System.out.println("Input " + n + " elements in the array :");
    for (i = 0; i < n; i++) {
      System.out.print("element - " + i + " : ");
      arr1[i] = input.nextInt();
    }

    
    for (i = 0; i < n; i++) {
      arr2[i] = arr1[i];
      arr3[i] = 0;
    }

   
    for (i = 0; i < n; i++) {
      for (j = 0; j < n; j++) {
        if (arr1[i] == arr2[j]) {
          arr3[j] = mm;
          mm++;
        }
      }
      mm = 1;
    }

  
    for (i = 0; i < n; i++) {
      if (arr3[i] == 2) {
        ctr++;
      }
    }
    System.out.println("The total number of duplicate elements found in the array is: " + ctr);
    System.out.println("\n\n");
  }
}