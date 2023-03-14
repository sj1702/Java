public class Average {
  public static void main(String[] args) {

    // take two numbers
    double num1 = 10;
    double num2 = 15;
    double num3 = 20;

    // declare sum variable
    // and initialize with 0
    double sum = 0.0;
    // declare average variable
    double avg = 0.0;

    // calculate the sum value
    sum = num1 + num2 + num3;
    // calculate the average value
    avg = sum/3;

    // display result
    System.out.println("Average: " + avg );
  }
}



OR





import static java.lang.Float.sum;   //import sum class
import java.util.Scanner;          // import scanner class
public class Average {  
   public static void main(String[] args)  
    {  
      int n, count = 1;   
      float  number, average, sum = 0;           // initially sum is 0 , create number variable for storing number entered by user
      Scanner sc = new Scanner(System.in);     // create a scanner object
      System.out.println("Enter the value of n");      // asking for how many numbers to average
      n = sc.nextInt();             //read the integer number given by user
      while (count <= n)            //count begins until all numbers are given
             {   
                  System.out.println("Enter the "+count+" number?");    // asking for number user want average for
                  number = sc.nextInt();              // reading the numbers which can be integer or decimal
                  sum = sum + number;                // Adding each number to previous sum
                  ++count;                           // count increment
             }   
                  average = sum/n;                 // calculating average
        System.out.println("The Average is"+average);    print average
    }    
}  







Output will be:

Enter the value of n
5
Enter the 1 number?
23
Enter the 2 number?
5.8
Enter the 3 number?
8.2
Enter the 4 number?
10
Enter the 5 number?
9.5
The Average is 11.30
  
  
