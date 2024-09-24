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
