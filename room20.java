
// import java.util.Scanner;

// public class room20 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         float a=5.3f;
//         System.out.println(a);
//         double b=6.7d;
//         System.out.println(b);
//         String txt= "Sahil";
//         System.out.println("The value of x " + txt);
//         System.out.println("The value of x " + txt.length());
//         System.out.println("The value of x " + txt.toUpperCase());
//         System.out.println("The value of x " + txt.toLowerCase());

//     }
    
// }

import java.util.Scanner;
 public class room20{
   

 
        public static void main(String[] args) {  
            Scanner sc = new Scanner(System.in);  
            
            // Read starting and ending numbers  
            int s = sc.nextInt();  
            int e = sc.nextInt();  
            
            // Loop through the range from s to e  
            for (int i = s; i <= e; i++) {  
                int c = 0; // Reset divisor count for each number i  
                
                // Check for divisors from 1 to i  
                for (int k = 1; k <= i; k++) {  
                    if (i % k == 0) { // If k is a divisor of i  
                        c++; // Increment the divisor count  
                    }  
                }  
                
                // Check if the count of divisors equals 2 (indicating prime)  
                if (c == 2) {  
                    System.out.print(i + " "); // Print the prime number  
                }  
            }  
            
            // Close the scanner  
            sc.close();  
        }  
    }
    
    