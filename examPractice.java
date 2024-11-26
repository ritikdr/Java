//1

import java.util.Scanner;

// public class examPractice {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the number: ");
//         int a = sc.nextInt();
//         int result = 1;
//         for(int i = 1; i <= a;i++) {
//             result *= i; 
//         }
//         System.out.println("factorial of "+ a + " is: "+ result);

//         sc.close();
//     }
// }

// import java.util.Scanner;

// public class examPractice {
//     public static int factorial(int n) {
//         if (n == 1 || n == 0){
//             return 1;
//         }
//         int fact1 = factorial(n - 1);
//         int fact2 = n * fact1;
//         return fact2;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the number: ");
//         int n = sc.nextInt();
//         int result = factorial(n);
//         System.out.println("factorial of " + n + " is: "+result);

//         sc.close();
//     }
// }


//3

// public class examPractice {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the number: ");
//         int n = sc.nextInt();

//         int reversenumber = 0;
//         while (n != 0) {
//             int digit  = n % 10;
//             reversenumber = reversenumber * 10 + digit;
//             n /= 10;
//         }
//         System.out.println("after reverse the number: "+ reversenumber);

//         sc.close();
//     }
// }


//4

// public class examPractice {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the number: ");
//         int n = sc.nextInt();
//         System.out.print("1 + ");
//         for(int i = 1; i <= n; i++) {
//             System.out.print("x^"+i);
//             if (i < n) {
//                 System.out.print(" + ");
//             }
//         }
//         sc.close();
//     }
// }


//5

// public class examPractice {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();

//         for(int i = 1; i <= n; i++) {
//             for(int j = 1; j <= i; j++) {
//                 System.out.print(j+" ");
//             }
//             System.out.println();
//         }
//         sc.close();
//     }
// }


//6

// public class examPractice {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         for(int i = 1; i <= n; i++) {
//             for(int j = 1; j <= n - i; j++) {
//                 System.out.print(" ");
//             }
//             for(int j = 1; j <= i; j++) {
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//         sc.close();
//     }
// }


//7

// public class examPractice {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the number: ");
//         int n = sc.nextInt();
//         for(int i = n; i >= 1; i--) {
//             for(int j = i; j < n; j++) {
//                 System.out.print(" ");
//             }
//             for(int j = 1; j <= (2 * i -1);j++) {
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//         sc.close();
//     }
// }


//8

// public class examPractice {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Addition(+)");
//         System.out.println("Subtraction(-)");
//         System.out.println("Multiplacation(*)");
//         System.out.println("Divided(/)");

//         System.out.println("Enter you choise (1-4) operation.");
//         int choise = sc.nextInt();

//         System.out.println("Enter the number: ");
//         int n1 = sc.nextInt();
//         int n2 = sc.nextInt();

//         int result;
//         switch(choise) {
//             case 1 :
//                 result = n1 + n2;
//                 System.out.println("Result: " + result);
//                 break;
//             case 2 :
//                 result = n1 - n2;
//                 System.out.println("Result: " + result);
//                 break;
//             case 3 :
//                 result = n1 * n2;
//                 System.out.println("Result: " + result);
//                 break;
//             case 4 :
//                 if(n2 != 0){
//                     result = n1 / n2;
//                     System.out.println("Result: " + result);
//                 } else {
//                     System.out.println("Error: division of zero is not allowed.");
//                 }
//                 break;
//             default :
//                 System.out.println("invlid choise. please choise any operation.");
//         }

//         sc.close();
//     }
// }


//10

// public class examPractice {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter the size of array: ");
//         int n = sc.nextInt();

//         int[] arr = new int[n];
//         System.out.println("Enter the element: ");
//         for(int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }

//         System.out.print("\nEnter the search number: ");
//         int m = sc.nextInt();
//         boolean found = false;
//         for(int i = 0; i < n; i++) {
//             if(arr[i] == m) {
//                 System.out.println("The value " + m + " at index " + i);
//                 found = true;
//             }
//         }
//         if(!found) {
//             System.out.println("This value not in this array.");
//         }

//         sc.close();
//     }
// }


//11

public class examPractice {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] arr1 = {{9,8,7},{6,5,4},{3,2,1}};

        int[][] arr2 = new int[3][3];
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                arr2[i][j] = arr[i][j] + arr1[i][j];
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }
    }
}