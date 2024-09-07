import java.util.*;
// PRINT OUTPUT
// public class javaBasic{
//     public static void main(String args[]){
//         System.out.println("Pratik Majage");
//     }
// }

// FACTORIAL
// public class javaBasic{
//     public static void main(String args[]){
//         int n = 5;
//         int fact = 1;
//         for(int i = 1; i <= n; i++){
//             fact = fact * i; 
//         }
//         System.out.println(fact);
//     }
// }

// ADDITION
// import java.util.*;
// public class javaBasic {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int numberOne = sc.nextInt(); 
//         System.out.println("Number One : " + numberOne);
//         int numberTwo = sc.nextInt(); 
//         System.out.println("Number Two : " + numberTwo);
//         int result = numberOne + numberTwo;
//         System.out.println("Result : " + result);
//     }
// }

// SQUARE PATTERN
// public class javaBasic{
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         for(int i=1; i<=n; i++){
//             for(int j=1; j<=n; j++){
//                 System.out.print("*"+" ");
//             }
//             System.out.println();
//         }
//     }
// }
// * * * * *
// * * * * *
// * * * * *
// * * * * *
// * * * * *

// ASSENDING PATTERN
// public class javaBasic{
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         for(int i=1; i<=n; i++){
//             for(int j=1; j<=i; j++){
//                 System.out.print("*"+" ");
//             }
//             System.out.println();
//         }
//     }
// }
// *
// * *
// * * *
// * * * *
// * * * * *

// DESCENDING PATTERN
// public class javaBasic{
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         for(int i=n; i>=1; i--){
//             for(int j=i; j>=1; j--){
//                 System.out.print("*"+" ");
//             }
//             System.out.println();
//         }
//     }
// }
// * * * * *
// * * * *
// * * *
// * *
// *

// public class javaBasic{
//     public static void main(String args[]) {
//         System.out.println("\nPratik Majage\n");
//         int n = 4;
//         for(int i=1; i<=n; i++){
//             for(int j=1; j<=n; j++ ){
//                 if(i==1 || j==1 || i==n || j==n){
//                     System.out.print("*"+" ");
//                 }else{
//                     System.out.print(" "+" ");
//                 }
//             }
//             System.out.println();
//         }
//         System.out.println();
//     }
// }
// * * * *
// *     *
// *     *
// * * * *

// public class javaBasic{
//     public static void main(String args[]) {
//         int n = 4;
//         for(int i=1; i<=n; i++ ){
//             for(int j=n; j>=i; j--){
//                 System.out.print(" ");
//             }            
//             for(int j=1; j<=n; j++){
//                 if (i==1 || j==1 || i==n || j==n) {
//                     System.out.print("*"+" ");
//                 }else{
//                     System.out.print(" "+" ");

//                 }
//             }
//             System.out.println();
//         }
//     }
// }
//     * * * * 
//    *     *
//   *     *
//  * * * *

// public class javaBasic{
//     public static void main(String args[]){
//         int n = 4;
//         for(int i=1; i<=n; i++){
//             for(int j=1; j<=i; j++){
//                 System.out.print("*"+" ");
//             }
//             for(int j=1; j<=(n-i); j++){
//                 System.out.print("-"+" ");
//             }
//             for(int j=1; j<=(n-i); j++){
//                 System.out.print("-"+" ");
//             }
//             for(int j=1; j<=i; j++){
//                 System.out.print("*"+" ");
//             }
//             System.out.println();
//         }

//         for(int i=n; i>=1; i--){
//             for(int j=1; j<=i; j++){
//                 System.out.print("*"+" ");
//             }
//             for(int j=1; j<=n-i; j++){
//                 System.out.print("-"+" ");
//             }
//             for(int j=1; j<=n-i; j++){
//                 System.out.print("-"+" ");
//             }
//             for(int j=1; j<=i; j++){
//                 System.out.print("*"+" ");
//             }
//             System.out.println();
//         }
//     }
// }
// * - - - - - - * 
// * * - - - - * * 
// * * * - - * * * 
// * * * * * * * * 
// * * * * * * * *
// * * * - - * * *
// * * - - - - * *
// * - - - - - - *

// public class javaBasic{
//     public static void main(String args[]){
//         int n = 4;
//         for(int i=n; i>=1; i--){
//             for(int j=1; j<=i; j++){
//                 System.out.print("*"+" ");
//             }
//             System.out.println();
//         }
//     }
// }
// * * * * 
// * * *
// * *
// *

// public class javaBasic{
//     public static void main(String args[]){
//         int n = 5;
//         int num = 1;
//         for(int i=1; i<=n; i++){
//             for(int j=1; j<=i; j++){
//                 System.out.print(num+" ");
//                 num++;
//             }
//             System.out.println();
//         }
//     }
// }
// 1 
// 2 3
// 4 5 6
// 7 8 9 10
// 11 12 13 14 15

// public class javaBasic{
//     public static void main(String args[]){
//         int n = 8;
//         int num = 97;
//         char ch = (char)(num);
//         for(int i=1; i<=n; i++){
//             for(int j=1; j<=i; j++){
//                 System.out.print( ch + " " );
//                 ch++;
//             }
//             System.out.println();
//         }
//     }
// }
// a 
// b c
// d e f
// g h i j
// k l m n o
// p q r s t u
// v w x y z { |
// } ~  ? ? ? ? ?