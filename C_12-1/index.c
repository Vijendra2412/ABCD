// // // #include <stdio.h>
// // // int main(){
// // //-> single line comment

// // /* */ //-> multiple line comment

// //     /*
// // its c language class

// // STDIN_FILENOsdf
// // sad
// // STDIN_FILENOs
// // STDIN_FILENO
// // __AW_SUFFIXED__
// // */

// // //  dataTypes  variable_name     value
// // // int  = Integers
// // // char = characters
// // // float
// // // double
// // // bool = boolean
// // // int x = 12;
// // // char y = 'a';
// // // float z = 1.2f;
// // // double a = 1.2;
// // // // bool b = true;

// // // printf("%d\n", x);
// // // printf("%c\n", y);
// // // printf("%f\n", z);
// // // printf("%f\n", a);
// // // printf("%d\n", b);
// // // }

// // // Data Types

// // //  Types                                      Data Types

// // // basic Data Type                      int , char , float, double
// // // Derived DataType                      array , pointer , structure, union
// // // Enumeration Data Type                  enum 
// // // void data Type                          void


// // #include <stdio.h>
// // int main(){

// // // int xyz  = 12;
// // // printf("%d \n" ,xyz);


// // //format Specifier                 data Type 
// // // %d or %i                            int
// // // %f or %F                            float
// // // %lf                                 double
// // // %c                                  char 
// // // %s                                  strings


// // // int x = 5;
// // // double    y =12.3;
// // // char     z = 'D'; 

// // // char kabir = 'A';
// // // printf("%c",kabir);

// // // char a ='4',b = 'q',c = 'r';
// // // printf("%c" , a);
// // // printf("%c" , b);
// // // printf("%c" , c);
// // // printf("%c,%c,%c" ,a,b,c);



// // }


// #include <stdio.h>
// int main(){
//     // int x =9;
//     // printf("%d",x);

//     // double x =1.3;
//     // printf("%lf",x);
// // //-----------------------------------------------------
//     // float x = 2.3123456789;
//     // double y = 12.312345678934567;
//     // printf("%f \n",x);
//     // printf("%lf",y);

//     // float x = 1.5;
//     // printf("%f \n",x);
//     // printf("%.1f \n",x);
//     // printf("%.2f \n",x);
// //-----------------------------------------------------

//     // Memory Size 
//     /*
//     DataType      Size
//     int           2 or 4 bytes
//     float         4 bytes
//     double        8 bytes
//     char          1 byte
//     bool          1 byte



// */
// // // sizeOf()

// // int x;
// // float y;
// // double z;
// // char a;
// // bool b;
// // printf("%d \n",sizeof(x));
// // printf("%d \n",sizeof(y));
// // printf("%d \n",sizeof(z));
// // printf("%d \n",sizeof(a));
// // printf("%d \n",sizeof(b));
// //-----------------------------------------------------
// // int x =12;
// // float y = 1.2;
// // float z = x*y;
// // printf("%.1f",z);
// //-----------------------------------------------------
// // Type_Conversion
// // convert the value of one type to another type 

// // int x = 12;
// // int y =2;
// // int sum = 4/3;
// // printf("%d",sum);

// // there are two types of conversion 
// // 1. implicit conversion (automatically)  smaller type convert larger type
// // 2. Explicit conversoin(manually)       larger type convert smaller

// // 1. implicit conversion 
// // float x =2;
// // printf("%f", x);

// // int x = 1.2;
// // printf("%d",x);

// // // 2. Explicit conversoin
// // float x = (float)5*2;
// // printf("%f", x);

// //-----constant-----------------------------------------------------

// // const int x =9;
// // // x = 5;
// // printf("%d",x);

// // ------Operators----
// // operators are used to perform on variable and values
// // + , - , / ,  * , % 

// // int x  = 12/3;
// // printf("%d",x);

// // int x= 9;
// // int y = 3;
// // printf("%d" , x+y);

// // int x =9, y =8;
// // printf("%d",x+y);

// // int x = 1+2;
// // int y = x +3;
// // int z = x+y;
// // printf("%d",z);

// // C divides the operators into the following groups

// // Arithmetic operators : + , / , * , - , % , ++,--
// // int x = 9;
// // int y = 8;
// // printf("%d",x%y);
// //Assignment operators
// //Comparison/relational operators
// // Bitwise operators 

// // printf("%d\n",x++);
// // // printf("%d",x);
// // printf("%d",x);

// // printf("%d\n",x--);
// // printf("%d",x);

// // Assignment :- +=, -=,/=,*= 
// // int x = 9;
// // x+=8;  // x=x+8
// // printf("%d",x);

// // Comparision/relational    < , > , <= , >=

// // int x =9;
// // int y =8;
// // printf("%d",x>=y);

// //---  logical operator  ---
// // OR              AND                   NOT 
// // ||               &&                    !
//                                     //        !(or)     &&(and)
// //  0 1 -> 1         0 1 -> 0                 1 ->0       0 ->1
// //  1 0 -> 1         1 0 -> 0                 1 ->0       0 ->1
// //  0 0 -> 0         0 0 -> 0                 0 ->1       0 ->1
// //  1 1 -> 1         1 1 -> 1                 1 ->0       1 ->0

// // int x =10;
// // int y = 9;
// // printf("%d" , (x<y) || (x>y)  );
// // printf("%d" , (x<y) && (x>y) );
// // printf("%d" , !((x<y) || (x>y)) );
// // printf("%d" , !((x<y) && (x>y) ));

// }


// #include <stdio.h>
// #include <stdbool.h>
// int main(){

// int x = 10;
// int y = 9;
// printf("%d  \n" , !((x<y) || (x>y)) );
// printf("%d " , !((x<y) && (x>y) ));


// Conditions and if statement 
// Use if to specify a block of code to be executed, if a specified condition is true
// Use else to specify a block of code to be executed, if the same condition is false
// Use else if to specify a new condition to test, if the first condition is false
// Use switch to specify many alternative blocks of code to be executed

// if(condition){
//     //block of code
// }


// if(20<18){
//     printf("20 is greater than 18");
// }
// else{
//     printf("20 is not greater than 18");
// }
// int x =9;
// int y =8;
// if(x<y){
//     printf("x is greater than y");
// }

// else if(12<8){
//     printf("x is less than y");
// }


// else{
//     printf("x is not greater than y");
// }

// int time  =22;
// if(time<10){
//     printf("Good Morning");
// }
// else if(time<20){
// printf("good day");
// }
// else if(time<21){
// printf("good nighttyuiop");
// }
// else{
//     printf("good night");
// }
// }



// Short Hand if..else(Ternary operator)

// Syntax:- 

// (condition) ? expression1 : expression2;
#include<stdio.h>
int main(){
// int time =20;
// if(time<18){
//     printf("Good Morning");
// }
// else{
//     printf("Good night");
// }

// (time>18)?printf("Good Morning"):printf("Good night");
//------------------------------------------------------------
// int doorCode  = 1337;
// if(doorCode == 1337){
//     printf("correct code / door is open");
// }
// else{
//     printf("wrong code / door is closed");
// }
//---------------------------------------------------
// int myNum = 10;
// if(myNum>0){
//     printf("positive number");
// }
// else if(myNum<0){
//     printf("-ve number");
// }
// else{
//     printf("zero");
// }
//---------------------------------------------------
// int myAge =25;
// int votingAge = 18;
// if(myAge>=votingAge){
//     printf("you can vote");
// }
// else{
//     printf("you cannot vote");
// }
//---------------------------------------------------------
// int myNum = 5;
// if(myNum%2==0){
//     printf("%d is even  \n" , myNum);
// }
// else{
//     printf("%d is odd  \n" , myNum);
// }
//---------------------------------------------------------------
// Switch Statement:-  

// switch (expression){
// case x:
// //code
//     break;

// case x:
// //code
//     break;

// default:
//     break;
// }
//----------------------------------------------------------------
// int day = 8;
// switch(day){
// case 1:
//     printf("monday");
//     break;
// case 2:
//     printf("Tuesday");
//     break;
// case 3:
//     printf("Wednesday");
//     break;
// case 4:
//     printf("Thursday");
//     break;
// case 5:
//     printf("friday");
//     break;
// case 6:
//     printf("saturday");
//     break;
// case 7:
//     printf("sunday");
//     break;
// default:
//     printf("invalid day");
//--------------------------------------------------

/*---------------LOOPS----------------------*/
// it can execute a block of code as long as specified condition is reahced

// loops are handy beacause the save time, reduce error, and the make code more readable.


// while loop
// while loop loops through a block of code as long as specified condition is true 

// syntax:-
// while(condtion){
//     //code
// }

// int i=0;
// while (i>5)
// {
//     printf("%d \n" , i);
//     i++;
// }

//---Do-while Loop---

// it is a variant of while loop.
// the loop will execute the code block once, before checking the condtion is true, 
// then it will repeat the loopas long as the condtion is true.

// Syntax:- 
// do{
//     //code
// }while(condition);

// int i =1;

// do{
//     printf("%d \n" , i);
//     i++;
// } while (i<5);

// int countdown = 3;
// while (countdown>0)
// {
//     printf("%d \n" , countdown);
//     countdown--;
// }

// int i=0;
// while(i<=10){
//     printf("%d \n" , i);
//     i++;
// }

// int number =12345;

// int revNumber = 0;

// while(number){
//     revNumber = revNumber*10 + number%10;
//     number = number/10;
// }

// when you know the exactly how many times you want to loop throgh a block of code /
// so you use loop instead of while loop

// Syntax:- 

// for(initialization(start position); condition; increment/decrement){

// }


// for(int i =0;i<5;i++){
//     printf("%d \n" , i);
// }

// ----Nested Loop--
// for(int i=1;i<=2;++i){
//     printf("outer: %d\n", i);
//     for(int j=1;j<=3;++j){
//         printf("Inner: %d\n" ,j);
//     }
// }

// for(int i=0;i<=100;i++){
//     printf("%d \n" , i);
// }

// for(int i=1;i<=10;i++){
//     printf("3 * %d = %d\n", i, (i * 3));
// } 

// for(int i=0;i<10;i++){
//     if(i==4){
//         continue;
//     }
//     printf("%d\n",i);
// }

// int i=0;
// while (i<10){
//    if(i==4){
//     break;
//    }
//    printf("%d\n",i);
//    i++;
// }

// 200-100/2 // BODMAS

// int i=0;
// while (i<10){
//    if(i==){
//      i++;
//     continue;
   
//    }
//    printf("%d\n",i);
//    i++;
// }

// in Table 2  break at 5
// in Table 4  break at 5


// in Table 2  Continue at 5
// in Table 4  continue at 5


// Array :- they are used to store multiplevalues, instead of declaring seperate variavle for each value 

// int myArr[] = {1,2,3,4,5,6,7};
// myArr[0] = 8;
// printf("%d\n", myArr[0]);
// for(int i=0;i<4;i++){
//     printf("%d \n",myArr[i]);
// }

// int myNum[5];
// myNum[0] = 1;
// myNum[1] = 2;
// myNum[2] = 3;
// myNum[3] = 4;
// for(int i=0;i<4;i++){
//     printf("%d \n",myNum[i]);
// }

// int myNum[] = {1,2,3,4,5,6};
// printf("%lu",sizeof(myNum));

// int matrix[2][3] = {
//                     {1,2,3},
//                     {4,5,6}
//                     };

// matrix[0][2] = 8;

// printf("%d ",matrix[0][2]);


// ----- String:- ----
char x[] = "VijeNdra"; 
// x[4] ='n';
// printf("%s" ,x);
for(int i=0;i<=5;i++){
    printf("%c\n " ,x[i]);
}

}


















































