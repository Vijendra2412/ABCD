// java is programming language and a platform.
// it is a high level , robust, object-oriented and secure programming language 

/* 
comaprision                    C++                            Java
platform_independent         dependent                       independent
mainly used for             system programming             window-based,web-based,enterprise..
Multiple-inheritence       Support M-I                         does'nt support M-I,by using interface
*/

//  class nihal {
//     public static void main(String[] args) {

//     }
// }

/*
public class nihal {
    public static void main(String[] args) {
        System.out.println("");
    }
}
     */

//  public class a{
//     public static void main(String[] args) {
//         int  x= 9;
//         System.out.println(x);
//     }
//  }

/* 
    DataTypes            Default value            Default size
    boolean :- T/F          false                       1bit
    char :- ''            '\u0000'                    2byte
    byte  :- number         0                       byte
    short :-  num           0                       2byte
    int                     0                       4byte
    long                    0L                      8byte
    float :- decimal        0.0f                    4byte
    double:- decimal        0.0d                    8byte

    
*/

// class z{

//     public static void main(String[] args) {
//         // boolean a = true;
//         // System.out.println(a);

//         // long z  = 1243456781223452355L;
//         // System.out.println(z);
//     }
// }

// package :- 

// Operator is symbol that is used to perform operations. + - / * 

// Unary Opearator                postfix:-  var++ , var-- /   prefix:-  --var,++var
// arithmetic                       + - / * %
// shift Opearator                <<  >>  >>>
// relational/comparison operator  <,> , <= , >=, ==, !=
// bitwise operator               bitwise AND , bitwise exclusive OR, bitwise inclusive OR,
// logical operator               &&  ||   !
// ternary Opearator              ? :
// assignment operator            = += ,-=,/=,*=, %=, &=, ^=, |=, <<=,>>=,>>>=

// Unary operator required only one operand. 
// unary operator are used to perform various operations 
// increment /deccrement  a value by one 
// negating an expression
// inverting the value of a boolean

// class hero{
// public static void main(String[] args) {
// int x =10;
// System.out.println(++x);
// System.out.println(x++);
// System.out.println(x);
// //------------------------------------------------
// System.out.println(x++);
// System.out.println(++x);
// System.out.println(x--);
// System.out.println(--x);

// int a =10;
// int b =10;
// System.out.println(a++ + ++a);
// System.out.println(b++ + b++ );

//  !   ~  

//  int a =10;
//  int b =-10;
//  boolean c = true;
//  boolean d = false;

// System.out.println(~a);
// System.out.println(~b);

// System.out.println(!c);
// System.out.println(!d);

//     }
// }

/* 
public class a{
    public static void main(String[] args) {
        System.out.println("vijendra Sharma");
    }
}
*/

/*        n2
<<   n1*2^
 >>   
  >>>


 it is used to shift all of the bits in a value to the left side
  of a specified number of items

 */

// class v{
//     public static void main(String[] args) {
//         System.out.println(10<<3);
//         System.out.println(5<<3);
//     }
// }

/*
 it is used to move the value of the left operand to right by the number
 of bits specified by the right operand

 n1/2^n2
 */

//  class v{
//     public static void main(String[] args) {
/* 
if +ve number , so >> and >>> work same
for -ve ,>>>change by bits(MSB) to 0
*/
// System.out.println(10>>2);
// System.out.println(10>>>2);

// System.out.println("---------------------");
// System.out.println(-10>>2);
// System.out.println(-10>>>2);

/*
//---logical &&----
 it doesnt check the second if th efirst condtion is false

 bitwise & Operator
 its always check both conditions whether 
 first condition is true or false
 */

//  int a =10;
//  int b =5;
//  int c = 20;

//  System.out.println(a<b && a<c);
//  System.out.println(a<b & a<c);

// int x =7;
// int y=8;
// System.out.println(!((x<y)&&(x>y)));

// &&  &

// int x =10;
// int y =3;
// int z = 17;
// System.out.println(x<y && x<z);
// System.out.println(x<y & x<z);

// System.out.println(x<y || x<z);
// System.out.println(x<y | x<z);

//ternary operator ()?"true":"false"
// String x ="10";
// String y ="3";
// String z = (x==y)?"true":"false";
// System.out.println(z);

// += ,-= , /=, %= 
// int x =5;
// // x= x+9;
// x+=10;
// System.out.println(x);

/*
// Typecasting  

Widening Casting (automatically) - converting a smaller type to a larger type size
byte -> short -> char -> int -> long -> float -> double

Narrowing Casting (manually) - converting a larger type to a smaller size type
double -> float -> long -> int -> char -> short -> byte
*/

// int x =10;
// float y =x;
// System.out.println(y);.

// float x= 10.1f;
// int y =(int)x;
// System.out.println(y);

//keywords
// Java has a set of keywords that are reserved words 
// that cannot be used as variables, methods, classes, or any other identifiers
/* 
//---conrol flow statement---
decision making statemetns
        if statement
        switch statement

Loop statement
        for loop
        while loop
        do while loop
        for-each loop

Jump Statement
        break statement
        continue statement

------------------------------
simple if statement
if(condition){
//code
}

if-else statement
if(condition){
//code
}else{
//code
}

if else-if statement
if(condition){
//code
}else if(condition2){
//code
}

nested if-statement
if(condition){
        if(condition1.1){
        // code
        }
        else{
        //code
        }
}
else{
        if(condiotion){
        // code
        }
        else if(cond2){
        //code
        }
        else{

        }

}
*/

// int x= 10;
// int y =12;
// int z =30;
// // System.out.println(x<y);
// if(z>x){
//     if(x>y){
//         System.out.println(" its smaller");
//     }
//     else if(x>z){
//     System.out.println(" x is smaller");
//     }
//     else{
//         System.out.println(" condition wrong");
//     }
// }
// else{
//     System.out.println("condition wrong");
// }

//     }
//  }
// class M {
//     public static void main(String[] args) {
//         int x = 10;
//         int y = 12;
//         int z = 30;

//         if (x < z) {
//             if (x > y) {
//                 System.out.println("x is the smallest");
//             } else {
//                 System.out.println("y is the smallest");
//             }
//         } else {
//             System.out.println("z is not the largest");
//         }
//     }
// }
/* 
// 1. Find the Largest of Three Numbers
import java.util.Scanner;

public class LargestOfThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three numbers:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        
        if (num1 >= num2 && num1 >= num3) {
            System.out.println(num1 + " is the largest number.");
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println(num2 + " is the largest number.");
        } else {
            System.out.println(num3 + " is the largest number.");
        }
    }
}

// 2. Check If a Number Is Even or Odd
import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = scanner.nextInt();
        
        if (num % 2 == 0) {
            System.out.println(num + " is even.");
        } else {
            System.out.println(num + " is odd.");
        }
    }
}

// 3. Grade Calculation
import java.util.Scanner;

public class GradeCalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the marks:");
        int marks = scanner.nextInt();
        
        if (marks >= 90) {
            System.out.println("A");
        } else if (marks >= 80) {
            System.out.println("B");
        } else if (marks >= 70) {
            System.out.println("C");
        } else if (marks >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
    }
}

// 4. Check if a Year is a Leap Year
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a year:");
        int year = scanner.nextInt();
        
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
}

// 5. Number is Positive, Negative, or Zero
import java.util.Scanner;

public class NumberSign {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = scanner.nextInt();
        
        if (num > 0) {
            System.out.println("The number is positive.");
        } else if (num < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }
    }
}

// 6. Find the Category of a Person's Age
import java.util.Scanner;

public class AgeCategory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter age:");
        int age = scanner.nextInt();
        
        if (age < 13) {
            System.out.println("Child");
        } else if (age < 20) {
            System.out.println("Teenager");
        } else if (age < 60) {
            System.out.println("Adult");
        } else {
            System.out.println("Senior");
        }
    }
}

// 7. Check Eligibility to Vote
import java.util.Scanner;

public class VotingEligibility {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter age:");
        int age = scanner.nextInt();
        
        if (age >= 18) {
            System.out.println("Eligible to vote.");
        } else {
            System.out.println("Not eligible to vote.");
        }
    }
}

// 8. Temperature Check
import java.util.Scanner;

public class TemperatureCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter temperature:");
        double temp = scanner.nextDouble();
        
        if (temp > 30) {
            System.out.println("Hot Day");
        } else if (temp >= 20) {
            System.out.println("Warm Day");
        } else if (temp >= 10) {
            System.out.println("Cool Day");
        } else {
            System.out.println("Cold Day");
        }
    }
}

// 9. Check Whether a Character is a Vowel or Consonant
import java.util.Scanner;

public class VowelConsonant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a character:");
        char ch = scanner.next().charAt(0);
        
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
            ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
            System.out.println(ch + " is a vowel.");
        } else if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            System.out.println(ch + " is a consonant.");
        } else {
            System.out.println(ch + " is not a letter.");
        }
    }
}

// 10. Calculate BMI (Body Mass Index)
import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter weight in kg:");
        double weight = scanner.nextDouble();
        System.out.println("Enter height in meters:");
        double height = scanner.nextDouble();
        
        double bmi = weight / (height * height);
        
        if (bmi < 18.5) {
            System.out.println("Underweight");
        } else if (bmi < 25) {
            System.out.println("Normal weight");
        } else if (bmi < 30) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obesity");
        }
    }
}


// */
// import java.util.Scanner;
// class q{
//     public static void main(String[] args) {
//         Scanner sc =  new Scanner(System.in);
//         System.out.println("enter ur number:- ");
//         int x =sc.nextInt();
//         char y =sc.next()
//         System.out.println("ur number is:- " + x);
//     }
// }

/*
 
import java.util.Scanner;

public class AdvancedConditionalExercises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 1. Day of the Week
        System.out.println("Enter a number (1-7):");
        int day = scanner.nextInt();
        if (day == 1) System.out.println("Monday");
        else if (day == 2) System.out.println("Tuesday");
        else if (day == 3) System.out.println("Wednesday");
        else if (day == 4) System.out.println("Thursday");
        else if (day == 5) System.out.println("Friday");
        else if (day == 6) System.out.println("Saturday");
        else if (day == 7) System.out.println("Sunday");
        else System.out.println("Invalid input");

        // 2. Triangle Type Checker
        System.out.println("Enter three side lengths:");
        int a = scanner.nextInt(), b = scanner.nextInt(), c = scanner.nextInt();
        if (a == b && b == c) System.out.println("Equilateral");
        else if (a == b || b == c || a == c) System.out.println("Isosceles");
        else System.out.println("Scalene");

        // 3. Quadrant of a Point
        System.out.println("Enter x and y coordinates:");
        int x = scanner.nextInt(), y = scanner.nextInt();
        if (x > 0 && y > 0) System.out.println("First Quadrant");
        else if (x < 0 && y > 0) System.out.println("Second Quadrant");
        else if (x < 0 && y < 0) System.out.println("Third Quadrant");
        else if (x > 0 && y < 0) System.out.println("Fourth Quadrant");
        else if (x == 0 && y == 0) System.out.println("Origin");
        else System.out.println("On an axis");

        // 4. Simple Calculator
        System.out.println("Enter two numbers and an operator (+, -, *, /):");
        double num1 = scanner.nextDouble(), num2 = scanner.nextDouble();
        char operator = scanner.next().charAt(0);
        if (operator == '+') System.out.println(num1 + num2);
        else if (operator == '-') System.out.println(num1 - num2);
        else if (operator == '*') System.out.println(num1 * num2);
        else if (operator == '/') {
            if (num2 != 0) System.out.println(num1 / num2);
            else System.out.println("Cannot divide by zero");
        } else System.out.println("Invalid operator");

        // 5. Season Determiner
        System.out.println("Enter a month number (1-12):");
        int month = scanner.nextInt();
        if (month >= 3 && month <= 5) System.out.println("Spring");
        else if (month >= 6 && month <= 8) System.out.println("Summer");
        else if (month >= 9 && month <= 11) System.out.println("Autumn");
        else if (month == 12 || month == 1 || month == 2) System.out.println("Winter");
        else System.out.println("Invalid month");

        // 6. Discount Calculator
        System.out.println("Enter purchase amount:");
        double amount = scanner.nextDouble();
        if (amount > 5000) System.out.println("Final price: " + (amount * 0.8));
        else if (amount > 2000) System.out.println("Final price: " + (amount * 0.9));
        else if (amount > 1000) System.out.println("Final price: " + (amount * 0.95));
        else System.out.println("Final price: " + amount);

        // 7. Character Type Checker
        System.out.println("Enter a character:");
        char ch = scanner.next().charAt(0);
        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) System.out.println("Letter");
        else if (ch >= '0' && ch <= '9') System.out.println("Digit");
        else System.out.println("Special Character");

        // 8. Time of Day Greeting
        System.out.println("Enter current hour (0-23):");
        int hour = scanner.nextInt();
        if (hour >= 5 && hour < 12) System.out.println("Good Morning");
        else if (hour >= 12 && hour < 17) System.out.println("Good Afternoon");
        else if (hour >= 17 && hour < 21) System.out.println("Good Evening");
        else System.out.println("Good Night");

        // 9. Number to Word Converter
        System.out.println("Enter a single-digit number (0-9):");
        int digit = scanner.nextInt();
        if (digit == 0) System.out.println("Zero");
        else if (digit == 1) System.out.println("One");
        else if (digit == 2) System.out.println("Two");
        else if (digit == 3) System.out.println("Three");
        else if (digit == 4) System.out.println("Four");
        else if (digit == 5) System.out.println("Five");
        else if (digit == 6) System.out.println("Six");
        else if (digit == 7) System.out.println("Seven");
        else if (digit == 8) System.out.println("Eight");
        else if (digit == 9) System.out.println("Nine");
        else System.out.println("Invalid input");

        // 10. Traffic Light Simulator
        System.out.println("Enter current light color (Red/Green/Yellow):");
        String color = scanner.next().toLowerCase();
        if (color.equals("red")) System.out.println("Next: Green");
        else if (color.equals("green")) System.out.println("Next: Yellow");
        else if (color.equals("yellow")) System.out.println("Next: Red");
        else System.out.println("Invalid color");

        // 11. Loan Approval Checker
        System.out.println("Enter credit score and annual income:");
        int creditScore = scanner.nextInt();
        double income = scanner.nextDouble();
        if (creditScore >= 700 && income >= 50000) System.out.println("Loan Approved");
        else if (creditScore >= 650 && income >= 70000) System.out.println("Loan Approved");
        else System.out.println("Loan Denied");

        // 12. Rock-Paper-Scissors Game
        System.out.println("Enter choices for two players (rock/paper/scissors):");
        String player1 = scanner.next().toLowerCase();
        String player2 = scanner.next().toLowerCase();
        if (player1.equals(player2)) System.out.println("Tie");
        else if ((player1.equals("rock") && player2.equals("scissors")) ||
                 (player1.equals("scissors") && player2.equals("paper")) ||
                 (player1.equals("paper") && player2.equals("rock")))
            System.out.println("Player 1 wins");
        else System.out.println("Player 2 wins");

        // 13. Zodiac Sign Determiner
        System.out.println("Enter birth month and day:");
        month = scanner.nextInt();
        int day = scanner.nextInt();
        if ((month == 3 && day >= 21) || (month == 4 && day <= 19)) System.out.println("Aries");
        else if ((month == 4 && day >= 20) || (month == 5 && day <= 20)) System.out.println("Taurus");
        else if ((month == 5 && day >= 21) || (month == 6 && day <= 20)) System.out.println("Gemini");
        else if ((month == 6 && day >= 21) || (month == 7 && day <= 22)) System.out.println("Cancer");
        else if ((month == 7 && day >= 23) || (month == 8 && day <= 22)) System.out.println("Leo");
        else if ((month == 8 && day >= 23) || (month == 9 && day <= 22)) System.out.println("Virgo");
        else if ((month == 9 && day >= 23) || (month == 10 && day <= 22)) System.out.println("Libra");
        else if ((month == 10 && day >= 23) || (month == 11 && day <= 21)) System.out.println("Scorpio");
        else if ((month == 11 && day >= 22) || (month == 12 && day <= 21)) System.out.println("Sagittarius");
        else if ((month == 12 && day >= 22) || (month == 1 && day <= 19)) System.out.println("Capricorn");
        else if ((month == 1 && day >= 20) || (month == 2 && day <= 18)) System.out.println("Aquarius");
        else System.out.println("Pisces");

        // 14. Grade Point Calculator
        System.out.println("Enter a letter grade (A, B, C, D, F):");
        char grade = scanner.next().toUpperCase().charAt(0);
        if (grade == 'A') System.out.println("4.0");
        else if (grade == 'B') System.out.println("3.0");
        else if (grade == 'C') System.out.println("2.0");
        else if (grade == 'D') System.out.println("1.0");
        else if (grade == 'F') System.out.println("0.0");
        else System.out.println("Invalid grade");

        // 15. Leap Year with Century Rule
        System.out.println("Enter a year:");
        int year = scanner.nextInt();
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
            System.out.println("Leap Year");
        else
            System.out.println("Not a Leap Year");

        scanner.close();
    }
}

 */

import java.util.Scanner;

class z {
    public static void main(String[] args) {
        /* 
        Scanner sc = new Scanner(System.in);
        // day of the week
        System.out.println("Enter ur day");
        int day = sc.nextInt();
        if(day==1){
            System.out.println("Monday");
        }
        else if(day == 2){
            System.out.println("Tuesday");
        }
        else if(day == 3){
            System.out.println("Wednesday");
        } else if(day == 4){
            System.out.println("Thursday");
        } else if(day == 5){
            System.out.println("Friday");
        } else if(day == 6){
            System.out.println("Saturday");
        } else if(day == 7){
            System.out.println("Sunday");
        }
            

        Scanner sc = new Scanner(System.in);

            System.out.println("Enter three side lengths:");

            int a = sc.nextInt();
            int b = sc.nextInt();
           int  c = sc.nextInt();
            if (a == b && b == c){
             System.out.println("Equilateral");
            }
            else if (a == b || b == c || a == c){
                System.out.println("Isosceles");
            }
            else{ 
                System.out.println("Scalene");
        }
               

                // 3. Quadrant of a Point
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter x and y coordinates:");
        int x = sc.nextInt(), 
        y = sc.nextInt();
        if (x > 0 && y > 0) {
            System.out.println("First Quadrant");
        }
        else if (x < 0 && y > 0){
             System.out.println("Second Quadrant");
        }
        else if (x < 0 && y < 0){
             System.out.println("Third Quadrant");
        }
        else if (x > 0 && y < 0) {
            System.out.println("Fourth Quadrant");
        }
        else if (x == 0 && y == 0) {
            System.out.println("Origin");
        }
        else {
            System.out.println("On an axis");
        }
 


  // 4. Simple Calculator
  Scanner sc = new Scanner(System.in);

  System.out.println("Enter two numbers and an operator (+, -, *, /):");
  System.out.println("enter 1st number");
  double num1 = sc.nextDouble();
  System.out.println("enter Symbol");

  char operator = sc.next().charAt(0);

  System.out.println("enter 2nd number");
   double num2 = sc.nextDouble();
  if (operator == '+'){
     System.out.println(num1 + num2);
  }
  else if (operator == '-'){
     System.out.println(num1 - num2);
  }
  else if (operator == '*') {
    System.out.println(num1 * num2);
  }
  else if (operator == '/') {
      if (num2 != 0) {
        System.out.println(num1 / num2);
      }
      else {
        System.out.println("Cannot divide by zero");
      }
  } else{
     System.out.println("Invalid operator");
  }
      
  // 5. Season Determiner
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter a month number (1-12):");
  int month = sc.nextInt();
  if (month >= 3 && month <= 5) {
    System.out.println("Summer");
  }
  else if (month >= 6 && month <= 8) {
    System.out.println("Spring");
  }
  else if (month >= 9 && month <= 11) {
    System.out.println("Autumn");
  }
  else if (month == 12 || month == 1 || month == 2) {
    System.out.println("Winter");
  }
  else {
     System.out.println("Invalid month");   
  }

  
   */
        
    }
}