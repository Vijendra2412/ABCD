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

// import java.util.Scanner;

// class z {
//     public static void main(String[] args) {
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
// 13. Zodiac Sign Determiner
//   Scanner sc = new Scanner(System.in);
//   System.out.println("Enter birth month and day:");
//   month = scanner.nextInt();
//   int day = scanner.nextInt();
//   if ((month == 3 && day >= 21) || (month == 4 && day <= 19)) System.out.println("Aries");
//   else if ((month == 4 && day >= 20) || (month == 5 && day <= 20)) System.out.println("Taurus");
//   else if ((month == 5 && day >= 21) || (month == 6 && day <= 20)) System.out.println("Gemini");
//   else if ((month == 6 && day >= 21) || (month == 7 && day <= 22)) System.out.println("Cancer");
//   else if ((month == 7 && day >= 23) || (month == 8 && day <= 22)) System.out.println("Leo");
//   else if ((month == 8 && day >= 23) || (month == 9 && day <= 22)) System.out.println("Virgo");
//   else if ((month == 9 && day >= 23) || (month == 10 && day <= 22)) System.out.println("Libra");
//   else if ((month == 10 && day >= 23) || (month == 11 && day <= 21)) System.out.println("Scorpio");
//   else if ((month == 11 && day >= 22) || (month == 12 && day <= 21)) System.out.println("Sagittarius");
//   else if ((month == 12 && day >= 22) || (month == 1 && day <= 19)) System.out.println("Capricorn");
//   else if ((month == 1 && day >= 20) || (month == 2 && day <= 18)) System.out.println("Aquarius");
//   else System.out.println("Pisces");

//     }
// }
// import java.util.*;

// class mno {
//     public static void main(String[] args) {
// 15. Leap Year with Century Rule
//  Scanner sc = new Scanner(System.in);

//  System.out.println("Enter a year:");
//  int year = sc.nextInt();
//  if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
//      System.out.println("Leap Year");
//  else{
//      System.out.println("Not a Leap Year");

// 4. Simple Calculator
//   Scanner sc = new Scanner(System.in);

//   System.out.println("Enter two numbers and an operator (+, -, *, /):");
//   System.out.println("enter 1st number");
//   double num1 = sc.nextDouble();
//   System.out.println("enter Symbol");

//   char operator = sc.next().charAt(0);

//   System.out.println("enter 2nd number");
//    double num2 = sc.nextDouble();
//   if (operator == '+'){
//      System.out.println(num1 + num2);
//   }
//   else if (operator == '-'){
//      System.out.println(num1 - num2);
//   }
//   else if (operator == '*') {
//     System.out.println(num1 * num2);
//   }
//   else if (operator == '/') {
//       if (num2 != 0) {
//         System.out.println(num1 / num2);
//       }
//       else {
//         System.out.println("Cannot divide by zero");
//       }
//   } else{
//      System.out.println("Invalid operator");
//   }

//   Scanner sc = new Scanner(System.in);
// System.out.println("Enter a character:");
// char ch = scanner.next().charAt(0);
// if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')){
//     System.out.println("Letter");
// } 
// else if (ch >= '0' && ch <= '9') {
//     System.out.println("Digit");
// }
// else {System.out.println("Special Character");
// }

// Scanner sc = new Scanner(System.in);
// System.out.println("Enter current hour (0-23):");
//         int hour = scanner.nextInt();
//         if (hour >= 5 && hour < 12) {
//             System.out.println("Good Morning");
//     }
//         else if (hour >= 12 && hour < 17) {
//             System.out.println("Good Afternoon");
//     }
//         else if (hour >= 17 && hour < 21){ 
//             System.out.println("Good Evening");
//     }
//         else {
//             System.out.println("Good Night");
//     }

// 12. Rock-Paper-Scissors Game
// Scanner sc = new Scanner(System.in);

//  System.out.println("Enter choices for two players (rock/paper/scissors):");
//  String player1 = scanner.next().toLowerCase();
//  String player2 = scanner.next().toLowerCase();
//  if (player1.equals(player2)){ 
//     System.out.println("Tie");
// }
//  else if ((player1.equals("rock") && player2.equals("scissors")) ||
//           (player1.equals("scissors") && player2.equals("paper")) ||
//           (player1.equals("paper") && player2.equals("rock")))
//     { 
//         System.out.println("Player 1 wins");
//     }
//  else {
//     System.out.println("Player 2 wins");

// }

// Scanner sc = new Scanner(System.in);
// 15. Leap Year with Century Rule
//  System.out.println("Enter a year:");
//  int year = scanner.nextInt();
//  if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
//      {
//         System.out.println("Leap Year");
//     }
//  else
//      {
//         System.out.println("Not a Leap Year");
//     }
// }
// }

//Switch 
// switch statement execute one statement from Multiple conditions.
// switch (expression) {
//     case value:

//         break;

//     default:
//         break;
// } 
// import java.util.*;
// class jkl{
//     public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter ur day");
// int day = sc.nextInt();
// switch (day) {
//     case 1:
//         System.out.println("Monday");
//         break;
//     case 2:
//         System.out.println("Tuesday");
//         break;
//     case 3:
//         System.out.println("Wednesday");
//         break;
//     case 4:
//         System.out.println("thursday");
//         break;
//     case 5:
//         System.out.println("Friday");
//         break;
//     case 6:
//         System.out.println("saturday");
//         break;
//     case 7:
//         System.out.println("Sunnday");
//         break;

//     default:
//     System.out.println("case not found");
//         break;
// }

// int month = 3;
// String mnthstrng = "";
// switch (month) {
//     case 1:
//         mnthstrng ="1-jan";
//         break;
//     case 2:
//     mnthstrng ="2-feb";

//         break;
//     case 3:
//     mnthstrng ="3-march";

//         break;
//     case 4:
//     mnthstrng ="4-april";

//         break;

//     default:
//     System.out.println("Month not found");
//         break;
// }
// System.out.println(mnthstrng);

// char Branch = 'C';
// int collegeYear = 2;
// switch (collegeYear) {
//     case 1:
//         System.out.println("English,math, physcs,chemestry");
//         break;
//         case 2:
//             switch (Branch) {
//               case 'C':
//                 System.out.println("os,java,ds");
//                 break;
//               case 'E':
//                 System.out.println("abc,def, ghi");
//                 break;
//         }
//         case 3:
//         switch (Branch) {
//             case 'g':
//                 System.out.println("1,2,3,4,5");
//                 break;
//               case 'h':
//                 System.out.println("6,7,8,9");
//                 break;
//         }

//     default:
//         break;
// }

// it is a class that represent the group of constant.

//     }
// }

// loops
// it is used to iterate a part of program several times. 
// there three types of loop
// for loop 
// while loop
// do while loop 

// for-each loop

// syntax of forloop 
// for(initilization, condition, i/d){
// code
// }
// class kl{
//     public static void main(String[] args) {
//         for(int i=0;i<=10;i++){
//             System.out.println("2 * " + i + " = " + 2*i);
//         }
//     }
// }

// import java.util.Scanner;

//  class CurrencyConverter {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         // Input: amount in INR
//         System.out.print("Enter amount in INR: ");
//         double inrAmount = scanner.nextDouble();

//         // Input: target currency
//         System.out.println("Choose the target currency (1 for USD, 2 for EUR, 3 for GBP): ");
//         int currencyChoice = scanner.nextInt();

//         // Variable to store converted amount
//         double convertedAmount = 0.0;

//         // Conversion rates
//         double inrToUsd = 0.012;
//         double inrToEur = 0.011;
//         double inrToGbp = 0.0098;

//         // Switch case to handle currency conversion
//         switch (currencyChoice) {
//             case 1: // INR to USD
//                 convertedAmount = inrAmount * inrToUsd;
//                 System.out.println("Converted amount in USD: " + convertedAmount);
//                 break;

//             case 2: // INR to EUR
//                 convertedAmount = inrAmount * inrToEur;
//                 System.out.println("Converted amount in EUR: " + convertedAmount);
//                 break;

//             case 3: // INR to GBP
//                 convertedAmount = inrAmount * inrToGbp;
//                 System.out.println("Converted amount in GBP: " + convertedAmount);
//                 break;

//             default:
//                 System.out.println("Invalid currency choice.");
//         }

//         scanner.close();
//     }
// }

// import java.util.Scanner;

//  class BankApp {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         double balance = 0.0; // Initial balance
//         boolean exit = false; // To control the loop

//         while (!exit) {
//             // Display menu
//             System.out.println("\nBanking Menu:");
//             System.out.println("1. View Balance");
//             System.out.println("2. Deposit Money");
//             System.out.println("3. Withdraw Money");
//             System.out.println("4. Exit");
//             System.out.print("Choose an option (1-4): ");

//             int choice = scanner.nextInt();

//             // Perform operations based on user choice
//             switch (choice) {
//                 case 1: // View balance
//                     System.out.println("Current Balance: $" + balance);
//                     break;

//                 case 2: // Deposit money
//                     System.out.print("Enter the amount to deposit: $");
//                     double depositAmount = scanner.nextDouble();
//                     if (depositAmount > 0) {
//                         balance += depositAmount;
//                         System.out.println("$" + depositAmount + " deposited successfully.");
//                     } else {
//                         System.out.println("Invalid deposit amount.");
//                     }
//                     break;

//                 case 3: // Withdraw money
//                     System.out.print("Enter the amount to withdraw: $");
//                     double withdrawAmount = scanner.nextDouble();
//                     if (withdrawAmount > 0 && withdrawAmount <= balance) {
//                         balance -= withdrawAmount;
//                         System.out.println("$" + withdrawAmount + " withdrawn successfully.");
//                     } else if (withdrawAmount > balance) {
//                         System.out.println("Insufficient balance.");
//                     } else {
//                         System.out.println("Invalid withdrawal amount.");
//                     }
//                     break;

//                 case 4: // Exit
//                     System.out.println("Exiting the program.");
//                     exit = true;
//                     break;

//                 default: // Invalid input
//                     System.out.println("Invalid choice. Please choose between 1 and 4.");
//             }
//         }

//         scanner.close();
//     }
// }

//while loop
// it is used to iterate a part of the program repeatedly until the specified boolean is true .

// while(condition){
//     // code
//     i/d
// }
// class vs {
//     public static void main(String[] args) {
// int i=1;
// while (true) {
// System.out.print("hello ");

// }

// do{
// System.out.println(i);
// i++;

// }while(i<=10);

// for(int i=0;i<=10;i++){
// if(i==5){
// continue;
// }
// System.out.print(i);
// }

// Oops :-
// class:- collection of object is called class.it is a logical entity
// A class can also be defined as a blueprint from which you can create an
// individual object
// class doesn't consume any space

// Inheritence :- 
// when one object acquires all the properties and behaviour of a parents object ,
//  it is known as inheritence 

// Polymorphism :- 
// if one task is performed in different ways is known as polymorphism. 

// Abstraction:- 
// Hiding internal details and showing functionality is known as abstraction.

// coupling:- 
// its referes to the knowledge or information or  dependency of another class.

//     }
// }

// object and class 
// state:- represent the data of an object 
// behaviour:- 
// identity:-  it is used internally by the jvm to identify each object uniquely 

// class:- 
// field
// method 
// constructor 
// block 
// nested class and interface

// syntax
// class class_name{
//     field;
//     method;
// new:- 
// }

// class yups{
//     int age;
//     String name;
// }

// class zz{
//     public static void main(String[] args) {
//         yups obj = new yups();
//         System.out.println(obj.age);
//         System.out.println(obj.name);
//     }
// }


// by refrence variable 
// by method 
// by constructor

// class yups{
//     int age;
//     String name;
//     void abc(int a , String n){
//         age = a;
//         name = n;
//     }
//     void Display(){
//         System.out.println(age + " "+ name);
//     }
// }
// class zz{
//     public static void main(String[] args) {
//         yups obj = new yups();
//         obj.abc(12, "vijendra");

//         obj.Display();
//     }
// }


import java.util.*;
class rectangle{
    int length;
    int breadth;

    void insert(int l , int b){
        length =l;
        breadth =b;
    }
    void area(){
        System.out.println(length*breadth);
    }
   
}

class zz{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        rectangle obj = new rectangle();

        System.out.println(" enter the length ");
        int length = sc.nextInt();
        
        System.out.println(" enter ur breadth ");
        int breadth = sc.nextInt();

        obj.insert( length, breadth );
        obj.area();
    }
}