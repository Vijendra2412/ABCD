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

 class v{
    public static void main(String[] args) {
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


    }
 }