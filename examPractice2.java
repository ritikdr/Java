// public class examPractice2 {
//     public static void main(String[] args) {
//         int n = 5;
//         for(int i = 1; i <= n; i++) {
//             for(int j = 1; j <= i; j++) {
//                 System.out.print("*" + " ");
//             }
//             System.out.println();
//         }
//     }
// }


// public class examPractice2 {
//     public static void main(String[] args) {
//         int n = 5;
//         for(int i = 1; i <= n; i++) {
//             for(int j = 1; j <= i; j++) {
//                 System.out.print(j + " ");
//             }
//             System.out.println();
//         }
//     }
// }


// public class examPractice2 {
//     public static void main(String[] args) {
//         int n = 5;
//         for(int i = 1; i <= n; i++) {
//             for(int j = 1; j <= i; j++) {
//                 System.out.print(i + " ");
//             }
//             System.out.println();
//         }
//     }
// }


// public class examPractice2 {
//     public static void main(String[] args) {
//         char[] arr = {'A', 'B', 'C', 'D', 'E'};
//         for(int i = 0; i < arr.length; i++) {
//             for(int j = 0; j <= i; j++) {
//                 System.out.print(arr[i] + " ");
//             }
//             System.out.println();
//         }
//     }
// }


// public class examPractice2 {
//     public static void main(String[] args) {
//         char[] arr = {'A', 'B', 'C', 'D', 'E'};
//         for(int i = 0; i < arr.length; i++) {
//             for(int j = 0; j <= i; j++) {
//                 System.out.print(arr[j] + " ");
//             }
//             System.out.println();
//         }
//     }
// }


// public class examPractice2 {
//     public static void main(String[] args) {
//         int n = 4;
//         int a = 0;
//         int b = 1;
//         for(int i = 0; i < n; i++) {
//             for(int j = 0; j <= i; j++) {
//                 System.out.print(b + " ");
//                 int c = (a + b);
//                 a = b;
//                 b = c;
//             }
//             System.out.println();
//         }
//     }
// }


// public class examPractice2 {
//     public static void main(String[] args) {
//         int n = 5;
//         for(int i = 0; i < n; i++) {
//             int a = 0;
//             int b = 1;
//             for(int j = 0; j <= i; j++) {
//                 System.out.print(a + " ");
//                 int c = (a + b);
//                 a = b;
//                 b = c;
//             }
//             System.out.println();
//         }
//     }
// }


public class examPractice2 {
    public static void main(String[] args) {
        int n = 4;
        int a = 0;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j <= i; j++) {
                System.out.print(a + " ");
                a++;
            }
            System.out.println();
        }
    }
}