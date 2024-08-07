// is prime..
// import java.util.*;
// class vj{
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// int n = sc.nextInt();
// if(n==2){
// System.out.println("is prime");
// }else{
// boolean isPrime = true;
// for(int i = 2;i<Math.sqrt(n);i++){
// if(n%i==0){
// isPrime = false;
// }
// }
// if(isPrime == true){
// System.out.println("is prime");
// }
// else{
// System.out.println("is not prime");
// }
// }
// }
// }

// // Question2:Write a program that reads a set of integers,and the n prints
// the sum of the even and odd integers
// import java.util.*;
// class vj{
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// int number;
// int choice;
// int evensum =0;
// int oddsum=0;
// do{
// System.out.println("Enter the number");
// number = sc.nextInt();
// if(number%2==0){
// evensum+=number;
// }else{
// oddsum+=number;
// }
// System.out.println("Do you want to continue press 1 for yes or 0 for no");
// choice = sc.nextInt();
// }while(choice==1);
// System.out.println("Evensum is "+evensum);
// System.out.println("Oddsum is "+oddsum);
// }
// }

// Question3: Write a program to find the factorial of any number entered by the
// user
// import java.util.*;;
// class vj{
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// int num ;
// int fact=1;
// System.out.println("Enter the number");
// num = sc.nextInt();
// for(int i=1;i<=num;i++){
// fact = fact*i;
// System.out.println("Factorial is "+fact);

// }
// }
// }

// Question4: Write a program to print the multiplication table of a number
// N,entered by the user
// import java.util.*;
// class vj{
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter the number");
// int num = sc.nextInt();
// for(int i = 1;i<=10;i++){
// System.out.println(num + " * " + i + " = " + num*i);
// }
// }
// }

// // Question5: print a right angle triangle
// class vj{
// public static void main(String[] args) {
// int n = 5;
// for(int i = 1;i<=5;i++){
// for(int j = 1 ; j<=i;j++){
// System.out.print("* ");
// }
// System.out.println();
// }
// }
// }

// // Question6: print a Number right angle triangle
// class vj{
// public static void main(String[] args) {
// int n = 5;
// for(int i= 1; i<n;i++){
// for(int j = 1;j<=i;j++){
// System.out.print(j);
// }
// System.out.println();

// }
// }
// }

// // Question6: print a character right angle triangle
// class vj{
// public static void main(String[] args) {
// int n = 5;
// char ch = 'A';
// for(int i =1;i<=n;i++){
// for(int j = 1; j<=i; j++){
// System.out.print(ch);
// ch++;
// }
// System.out.println();
// }
// }
// }

// // Question7: print a product of a and b

// import java.util.Scanner;

// class vj{
// public static int multiply(int a , int b){
// int product = a*b;
// int temp = a;
// a=b;
// b=temp;
// return product;
// }
// public static void main(String[] args) {
// // System.out.println(multiply(2, 3));

// Scanner sc = new Scanner(System.in);
// System.out.println("enter two numbers:- ");
// int a = sc.nextInt();
// int b = sc.nextInt();
// System.out.println(multiply(a, b));
// }
// }

// // Question8: print a factorial
// class vj{
// public static int fact(int n){
// int f= 1;
// for(int i = 1;i<=n;i++){
// f=f*i;
// }
// return f;
// }
// public static void main(String[] args) {
// // System.out.println(fact(5));
// // System.out.println(i + n+" "+fact(5));
// }
// }

// // Question9: print a binomial coefficient ( nCr = n!/r!(n-r)!)
// class vj{
// public static int fact(int n){
// int f= 1;
// for(int i = 1;i<=n;i++){
// f=f*i;
// }
// return f;
// }
// public static int factcoff(int n, int r){
// int nfact = fact(n);
// int rfact = fact(r);
// int nmrfact = fact(n-r);
// int binocoffi = nfact/(rfact*nmrfact);
// return binocoffi;
// }
// public static void main(String[] args) {
// System.out.println(factcoff(5, 2));
// }
// }

// // Question10: print a function prime or not

// import java.util.Scanner;
// class vj{
// public static boolean isPrime(int n){
// boolean isPrime = true;
// for(int i = 2;i<n;i++){
// if(n%i==0){
// isPrime = false;
// break;
// }
// }
// return isPrime;
// }
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.println("enter ur number:- ");
// int n= sc.nextInt();
// System.out.println(isPrime(n));
// }
// }

// class vj{
// public static boolean isPrime(int n){
// if(n==2){
// return true;
// }
// for(int i=2;i<n-1;i++){
// if(n%i==0){
// return false;
// }
// }
// return true;
// }
// }

// class vj{
// public static boolean isPrime(int n){
// if(n==2){
// return true;
// }
// for(int i = 2;i<=Math.sqrt(n);i++){
// if(n%i==0){
// return false;
// }
// }
// return true;
// }
// public static void main(String[] args) {
// System.out.println(isPrime(3));
// }
// }

// Question11: print all Prime a range
// class vj{
// public static boolean isPrime(int n){
// if(n==2){
// return true;
// }
// for(int i =2;i<=Math.sqrt(n);i++){
// if(n%i==0){
// return false;
// }
// }
// return true;

// }
// public static void PrimeInRange(int n){
// for(int i=2;i<=n;i++){
// if(isPrime(i)){
// System.out.println(i);
// }
// }
// }
// public static void main(String[] args) {
// PrimeInRange(10);
// }
// }

// Question12:- convert from Binary to Decimal
// class vj{
// public static void binToDec(int binNum){
// int myNum = 0;
// int pow = 0;
// int decNum = 0;
// while(binNum>0){
// int lastDigit = binNum%10;
// decNum = decNum + lastDigit*(int)(Math.pow(2, pow));
// pow++;
// binNum /= 10;
// }
// System.out.println("decimal of "+myNum+" is "+decNum);

// }
// public static void main(String[] args) {
// binToDec(111);
// }
// }

// // Question13:- convert from Decimal to Binary

// class vj{
// public static void decToBin(int decNum){
// int myNum = decNum;
// int pow = 0;
// int binNum = 0;
// while (decNum>0) {
// int rem = decNum%2;
// binNum = binNum + (rem*(int)(Math.pow(10, pow)));
// pow++;
// decNum /= 2;

// }
// System.out.println("Binary of "+myNum+" is "+binNum);
// }
// public static void main(String[] args) {
// decToBin(23);
// }
// }

// Question 14 :Write a Java method to compute the average of three numbers..
// class vj{
// public static double average(double a, double b, double c){
// return (a+b+c)/3;
// }

// public static void main(String[] args) {
// System.out.println(average(1, 2, 3));
// }
// }

// // Question15:Write a method named is Even that accepts an int argument.The
// method should return true if the argument is even,or false otherwise .Also
// write a program to test your method

// import java.util.Scanner;

// class vj{
// public static boolean isEven(int n){
// if(n%2==0){
// return true;
// }
// else{
// return false;
// }
// }
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter the number");
// int num = sc.nextInt();
// if(isEven(num)){
// System.out.println("Even");
// }
// else{
// System.out.println("Odd");
// }
// }
// }

// Question16: Write a Java program to check if a number is a palindrome in Java
// ? (121 is a palindrome, 321 is not)

// import java.util.Scanner;

// class vj{
// public static boolean isPalindrome(int number){
// int palindrome = number; //copy number into variable
// int reverse = 0;

// while(palindrome!=0){
// int remainder = palindrome%10;
// reverse = reverse*10 + remainder;
// palindrome = palindrome/10;
// }
// if(number==reverse){
// return true;
// }
// else{
// return false;
// }
// }
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter the number");
// int palindrome = sc.nextInt();
// if(isPalindrome(palindrome)){
// System.out.println("Number : " + palindrome + " is palindrome");
// }
// else{
// System.out.println("Number : " + palindrome + " is not palindrome");
// }
// }

// }

// Question 17 :READ & CODE EXERCISE Search about(Google) & use the following
// methods of the Math class in Java:
// a.Math.min( )
// b.Math.max( )
// c.Math.sqrt( )
// d.Math.pow( )
// e.Math.avg( )
// f.Math.abs( )

// Question 18 :Write a Java method to compute the sum of the digits in an
// integer

// import java.util.Scanner;

// class vj{
// public static int sumOfDigits(int n){
// int sum = 0;
// while(n>0){
// int lastDigit = n%10;
// sum = sum + lastDigit;
// n = n/10;
// }
// return sum;
// }
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter the number");
// int digit = sc.nextInt();
// System.out.println("the sum is " + sumOfDigits(digit));
// }
// }

// Question 19 : print a hollow rectangle
// class vj{
// public static void hollowRect(int totRows, int totCols){
// for(int i =1;i<=totRows; i++){
// for(int j =1 ;j<=totCols;j++){
// if(i==1||i==totRows||j==1||j==totCols){
// System.out.print("*");
// }
// else{
// System.out.print(" ");
// }
// }
// System.out.println();
// }
// }
// public static void main(String[] args) {
// hollowRect(5, 5);
// }
// }

// Question 20 : print a inverted and rotated half pyramid
// class vj{
// public static void halfpyramid(int n){
// for(int i =1;i<=n;i++){
// for(int j=1;j<=n-i;j++){
// System.out.print(" ");
// }
// for(int j=1;j<=i;j++){
// System.out.print("*");
// }
// System.out.println();
// }
// }
// public static void main(String[] args) {
// halfpyramid(5);
// }
// }

// // Question 21 : print a inverted and half pyramid with number
// class vj{
// public static void halfpyramid(int n){
// for(int i = 1;i<=n;i++){

// for(int j = 1;j<=n-i+1;j++){
// System.out.print(j);
// }
// // for(int j=1;j<=i;j++){
// // System.out.print(" ");
// // }
// System.out.println();

// }
// }
// public static void main(String[] args) {
// halfpyramid(5);
// }
// }

// // Question 22 : print a flyod pattern
// class vj{
// public static void flyod(int n){
// int counter = 1;
// for(int i=1;i<=n;i++){
// for(int j=1;j<=i;j++){
// System.out.print(counter + " ");
// counter++;
// }
// System.out.println();
// }
// }
// public static void main(String[] args) {
// flyod(5);
// }
// }

// // Question 23 : print a 0-1 Triangle
// class vj{
// public static void zero_1_tringle(int n){
// for(int i =1;i<=n;i++){
// for(int j=1;j<=i;j++){
// if((i+j)%2==0){
// System.out.print("1");
// }else{
// System.out.print("0");
// }
// }
// System.out.println();

// }
// }
// public static void main(String[] args) {
// zero_1_tringle(5);
// }
// }

// // Question 23 : print a butterfly pattern
// class vj{
// public static void butterfly(int n){
// for(int i =1;i<=n;i++){
// // star
// for(int j =1;j<=i;j++){
// System.out.print("*");
// }
// // space
// for(int j=1;j<=2*(n-i);j++){
// System.out.print(" ");
// }
// // star
// for(int j =1;j<=i;j++){
// System.out.print("*");
// }
// System.out.println();
// }

// for(int i =n;i>=1;i--){
// // star
// for(int j =1;j<=i;j++){
// System.out.print("*");
// }
// // space
// for(int j=1;j<=2*(n-i);j++){
// System.out.print(" ");
// }
// // star
// for(int j =1;j<=i;j++){
// System.out.print("*");
// }
// System.out.println();
// }

// }
// public static void main(String[] args) {
// butterfly(5);
// }
// }

// Question 23 : print a solid rhombus
// class vj{
// public static void rhombus(int n){
// for(int i =1;i<=n;i++){
// for(int j=1;j<=n-i;j++){
// System.out.print(" ");
// }
// for(int j = 1;j<=n;j++){
// System.out.print("* ");
// }
// System.out.println();
// }
// }
// public static void main(String[] args) {
// rhombus(5);
// }
// }

// Question 24: print a hollow rhombus
// class vj{
// public static void hollowRhombus(int n){
// for(int i =1;i<=n;i++){
// // spaces
// for(int j=1;j<=n-i;j++){
// System.out.print(" ");
// }
// // hollow rectangle

// for(int j = 1;j<=n;j++){
// if(i==1 || i==n || j==1 || j==n){
// System.out.print("*");
// }
// else{
// System.out.print(" ");
// }
// }
// System.out.println();
// }

// }
// public static void main(String[] args) {
// hollowRhombus(5);
// }
// }

// // Question 25: print a diamond
// class vj{
// public static void diamond(int n){
// for(int i = 1;i<=n;i++){

// // spaces
// for(int j =1;j<=n-i;j++){
// System.out.print(" ");
// }

// // stars
// for(int j =1;j<=2*i-1;j++){
// System.out.print("*");
// }

// System.out.println();
// }

// for(int i = n;i>=1;i--){

// // spaces
// for(int j =1;j<=n-i;j++){
// System.out.print(" ");
// }

// // stars
// for(int j =1;j<=2*i-1;j++){
// System.out.print("*");
// }

// System.out.println();
// }
// }
// public static void main(String[] args) {
// diamond(5);
// }
// }

// // Question 25: Linear Search
// class vj{
// public static int linearsearch(int n[],int key){
// for(int i=0;i<n.length;i++){
// if(n[i] == key){
// return i;
// }

// }
// return -1;
// }
// public static void main(String[] args) {
// int n[] = {1,2,3,4,5};
// int key = 4;

// int result = linearsearch(n,key);
// if(result == -1){
// System.out.println("Not Found");
// }
// else{
// System.out.println("key is at index:- "+ result);
// }
// }
// }

// // Question 25: largest Number
// import java.util.* ;
// class vj{
// public static int largest(int number[]){
// int largest = Integer.MIN_VALUE;
// int smallest = Integer.MAX_VALUE;
// for(int i =0;i<number.length;i++){
// if(number[i]>largest){
// largest = number[i];
// }
// if(number[i]<smallest){
// smallest = number[i];
// }
// }
// System.out.println("smallest number is :- "+ smallest);
// return largest;
// }
// public static void main(String[] args) {
// int number[] = {1,2,3,4,5};
// System.out.println("largest number is :- "+ largest(number));
// }
// }

// Question 27: Binary Search
// class vj {
// public static int Binary(int number[], int key) {
// int start = 0, end = number.length - 1;
// while (start <= end) {
// int mid = (start + end) / 2;

// // comparision
// if (number[mid] == key) {
// return mid;
// }
// if (number[mid] < key) { //right
// start = mid + 1;
// } else {//left
// end = mid - 1;
// }
// }
// return -1;
// }
// public static void main(String[] args) {
// int number[] = { 1, 2, 3, 4, 5 ,6,7,8,9,10};
// int key = 5;
// System.out.println("key is at index:- " + Binary(number, key));

// }
// }

// // Question 27: reverse an array
// class vj{
// public static void reverse(int number[]){
// int first =0, last = number.length-1;
// while(first<last){
// int temp = number[last];
// number[last] = number[first];
// number[first] = temp;
// first++;
// last--;
// }
// }
// public static void main(String[] args) {
// int number[] = {1,2,3,4,5};
// reverse(number);
// for(int i=0;i<number.length;i++){
// System.out.print(number[i]+" ");
// }
// System.out.println();
// }
// }

// Question 28:- Pairs in an array
// class vj{
// public static void printpairs(int number[]){
// int tp = 0;
// for(int i = 0;i<number.length;i++){
// int current = number[i];
// for(int j = i+1;j<number.length;j++){
// System.out.print("(" + current +","+ number[j] +")" );
// tp++;
// }
// System.out.println();
// }
// System.out.println("total pairs :- " + tp);
// }
// public static void main(String[] args) {
// int number[] = {1,2,3,4,5};
// printpairs(number);
// }
// }

// // Question 29:- subarrays
// class vj{
// public static void subarray(int num[]){
// int ts = 0; //total sub array

// for(int i=0;i<num.length;i++){
// int start =i;

// for(int j=i;j<num.length;j++){
// int end = j;
// for(int k=start;k<=end;k++){
// System.out.print(num[k] + " "); //subArray
// }
// ts++; //sum of n number :- n(n+1)/2
// System.out.println();
// }
// System.out.println();
// System.out.println("total subarrays :- " + ts);

// }

// }
// public static void main(String[] args) {
// int num[] = {2,4,6,8,10};
// subarray(num);
// }
// }

// // Question 30:- subarrays ,sum all element, max in array
// class vj{
// public static void subarray(int num[]){
// int ts = 0;
// int sum =0;
// for(int i=0;i<num.length;i++){
// int start =i;

// for(int j=i;j<num.length;j++){
// int end = j;
// for(int k=start;k<=end;k++){
// System.out.print(num[k] + " "); //subArray
// }
// ts++; //sum of n number :- n(n+1)/2
// System.out.println();
// }
// System.out.println();
// System.out.println("total subarrays :- " + ts);

// }
// System.out.print("array is :- [");
// for(int i=0;i<num.length;i++){
// System.out.print(num[i] + " ");
// }
// System.out.print("]");
// System.out.println();
// for(int j=0;j<num.length;j++){
// sum+=num[j];
// }
// System.out.println("sum of all elements :- " + sum);

// int largest = Integer.MIN_VALUE;
// int smallest = Integer.MAX_VALUE;
// for(int i=0;i<num.length;i++){
// if(num[i]>largest){
// largest = num[i];

// }
// if(num[i]<smallest){
// smallest = num[i];
// }
// }
// System.out.println("max element in array is :- " + largest);
// System.out.println("min element in array is :- " + smallest);
// }
// public static void main(String[] args) {
// int num[] = {2,4,6,8,10};
// subarray(num);
// }
// }

// // Question 31:- max Subarray sum
// class vj{
// public static void maxsubarray(int num[]){
// int currSum = 0;
// int maxSum = Integer.MIN_VALUE;

// for(int i=0;i<num.length;i++){
// int start =i;

// for(int j=i;j<num.length;j++){
// int end = j;
// currSum = 0;
// for(int k=start;k<=end;k++){
// currSum+=num[k];
// }
// System.out.println(currSum);
// if(currSum>maxSum){
// maxSum = currSum;
// }
// }
// System.out.println("------------------");

// }
// System.out.println("maximum sum is:- "+maxSum);

// }
// public static void main(String[] args) {
// int num[] = {2,4,6,8,10};
// maxsubarray(num);
// }
// }

// questions 32:- Array prefixSum
// import java.util.*;
// class vj{
// public static void maxsubarraySum(int numbers[]){
// int currSum = 0;
// int maxsum = Integer.MIN_VALUE;
// int prefix[] = new int[numbers.length];

// prefix[0] = numbers[0];
// for(int i=1;i<numbers.length;i++){
// prefix[i] = prefix[i-1] + numbers[i];
// }
// for(int i = 0;i<numbers.length;i++){
// int start = i;
// for(int j=i;j<numbers.length;j++){
// int end = j;
// currSum = start==0?prefix[end]:prefix[end]-prefix[start-1];
// if(currSum>maxsum){
// maxsum = currSum;
// }
// }
// }
// System.out.println("max sum:- " + maxsum);

// }

// public static void main(String[] args) {
// int numbers[] = {2,4,6,8,10};
// maxsubarraySum(numbers);
// }
// }

// //questions 32:- maxsum kadanes algorithm
// import java.util.*;
// class vj{
// public static void maxsubarraySum(int numbers[]){
// int currSum = 0;
// int maxsum = Integer.MIN_VALUE;
// int prefix[] = new int[numbers.length];

// prefix[0] = numbers[0];
// for(int i=1;i<numbers.length;i++){
// prefix[i] = prefix[i-1] + numbers[i];
// }
// for(int i = 0;i<numbers.length;i++){
// int start = i;
// for(int j=i;j<numbers.length;j++){
// int end = j;
// currSum = start==0?prefix[end]:prefix[end]-prefix[start-1];
// if(currSum>maxsum){
// maxsum = currSum;
// }
// }
// }
// // System.out.println("max sum:- " + maxsum);
// }

// public static void kadanes(int numbers[]){
// int ms = Integer.MIN_VALUE;
// int cs = 0;

// for(int i=0;i<numbers.length;i++){
// cs+=numbers[i];
// if(cs<0){
// cs = 0;
// }
// ms = Math.max(cs,ms);
// }
// System.out.println("max sum:- " + ms);
// }

// public static void main(String[] args) {
// int numbers[] = {2,4,6,8,10};
// // maxsubarraySum(numbers);
// kadanes(numbers);
// }
// }

// questions 32:- Trapping Rainwater [Auxiliary Arrays]
// class vj{
// public static int trappedRainwater(int height[]){
// int n = height.length;
// //calculate left max boundary - array
// int leftMax[] = new int[n];
// leftMax[0] = height[0];
// for(int i=1;i<n;i++){
// leftMax[i] = Math.max(height[i],leftMax[i-1]);
// }
// // calculate right max boundary - array
// int rightMax[] = new int[n];
// rightMax[n-1] = height[n-1];
// for(int i=n-2;i>=0;i--){
// rightMax[i] = Math.max(height[i],rightMax[i+1]);
// }

// int trapedWater = 0;
// for(int i=0;i<n;i++){
// int waterLevel = Math.min(leftMax[i],rightMax[i]);
// trapedWater+=waterLevel-height[i];

// }
// return trapedWater;

// }
// public static void main(String[] args) {
// int height[] = {4,2,0,6,3,2,5};
// System.out.println(trappedRainwater(height));
// }

// }

// questions 33:- array best time to buy and sell stock
// import java.util.*;
// class vj{
// public static int buyAndSellStock(int prices[]){

// int buyPrice = Integer.MAX_VALUE;
// int maxProfit = 0;
// for(int i = 0;i<prices.length;i++){
// if(buyPrice<prices[i]){
// int profit = prices[i]-buyPrice;
// maxProfit = Math.max(maxProfit,profit);
// }else{
// buyPrice = prices[i];
// }

// }
// return maxProfit;
// }
// public static void main(String[] args) {
// int prices[] = {7,1,5,3,6,4};
// System.out.println(buyAndSellStock(prices));
// }
// }

// Question 34:Given an integer array nums,
// return true if any value appears at least twice in the array,
// and return false if every element is distinct.

// Example 1:Input:nums = [1, 2, 3, 1]Output: true

// import java.util.*;
// class vj{
// public static boolean containDuplicate(int[] nums ){
// for(int i =0;i<nums.length;i++){
// for(int j=i+1;j<nums.length;j++){
// if(nums[i]==nums[j]){
// return true;
// }
// }

// }
// return false;
// }
// public static void main(String[] args) {

// Scanner obj = new Scanner(System.in);
// System.out.println("enter an array");
// int number= obj.nextInt();
// int [] arr = new int[number];
// for(int i=0;i<number;i++){
// arr[i] = obj.nextInt();

// }

// // int nums[] = {1, 2, 3, 1};
// System.out.println(containDuplicate(arr));

// }
// }

// Question 35: There is an integer array nums sorted in ascending order (with
// distinct values).
// Prior to being passed to your function, nums is possibly rotated at an
// unknown pivot
// index k (1 <= k < nums.length) such that the resulting
// array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ...,
// nums[k-1]] (0-indexed).
// For example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 and become
// [4,5,6,7,0,1,2].
// Given the array nums after the possible rotation and an integer target,
// returnthe index oftarget if it is in nums, or -1 if it is not in nums.
// You must write an algorithm with O(log n) runtime complexity.
// class Solution {
// public int search(int[] nums, int target) {
// int left = 0;
// int right = nums.length - 1;

// while (left <= right) {
// int mid = left + (right - left) / 2;

// if (nums[mid] == target) {
// return mid;
// }

// // Check which half is sorted and adjust the bounds accordingly
// if (nums[left] <= nums[mid]) { // Left half is sorted
// if (nums[left] <= target && target < nums[mid]) {
// right = mid - 1; // Search left half
// } else {
// left = mid + 1; // Search right half
// }
// } else { // Right half is sorted
// if (nums[mid] < target && target <= nums[right]) {
// left = mid + 1; // Search right half
// } else {
// right = mid - 1; // Search left half
// }
// }
// }

// return -1; // Target not found
// }
// public static void main(String[] args) {
// Solution solution = new Solution();
// int nums[] = {4,5,6,7,0,1,2};
// int target = 0;
// System.out.println(solution.search(nums,target));

// }

// }

// Question 36:You are given an array prices where prices[i] is the price of a
// given stock on the ith day.
// Return the maximum profit you can achieve from this transaction. If you
// cannot achieve any profit, return 0.

// Example 1:Input:prices = [7, 1, 5, 3, 6, 4]
// Output: 5
// Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit =
// 6-1 = 5.
// Note that buying on day 2 and selling on day 1 is not allowed because you
// must buy before you sell.

// Example 2:Input:Prices = [7, 6, 4, 3, 1]
// Output: 0
// Explanation: In this case, no transactions are done and the max profit = 0.
// Constraints:•1 <= prices . length <= 105•0 <= prices [ i ] <= 104

// import java.lang.reflect.Array;
// import java.util.Arrays;

// class vj{
// public int maxProfit(int[] prices) {
// int buy = prices[0];
// int profit = 0;

// for(int i=1;i<prices.length;i++){
// if(buy<prices[i]){
// profit = Math.max(profit,prices[i]-buy);
// }
// else{
// buy = prices[i];
// }
// }
// return profit;

// }
// }
// class index{
// public static void main(String[] args) {
// int prices[] = {7, 1, 5, 3, 6, 4};
// vj obj = new vj();
// Arrays.sort(prices);
// System.out.println(obj.maxProfit(prices));

// }
// }

// Question 37:Given n non-negative integers representing an elevation map where
// the width of each bar is 1,
// compute how much water it can trap after raining

// Example 1:
// Input: height = [0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1]
// Output: 6
// Explanation: The above elevation map (black section) is represented by
// array [0,1,0,2,1,0,1,3,2,1,2,1].
// In this case,
// 6 units of rain water (blue section) are being trapped

// Example 2:
// Input: height = [4, 2, 0, 3, 2, 5] Output: 9
// Constraints:
// •n == height . length
// •1 <= n <= 2 * 104
// •0 <= height [ i ] < = 105

// solution:-
// class TrappingRainwater {
// public static int trappedRainwater(int[] height) {
// int n = height.length;
// if (n <= 2) {
// return 0; // If there are less than 3 elements, no water can be trapped
// }

// // Calculate left max heights
// int[] leftMax = new int[n];
// leftMax[0] = height[0];
// for (int i = 1; i < n; i++) {
// leftMax[i] = Math.max(leftMax[i - 1], height[i]);
// }

// // Calculate right max heights
// int[] rightMax = new int[n];
// rightMax[n - 1] = height[n - 1];
// for (int i = n - 2; i >= 0; i--) {
// rightMax[i] = Math.max(rightMax[i + 1], height[i]);
// }

// // Calculate trapped water
// int trappedWater = 0;
// for (int i = 0; i < n; i++) {
// int waterLevel = Math.min(leftMax[i], rightMax[i]);
// trappedWater += waterLevel - height[i];
// }

// return trappedWater;
// }
// class vj{
// public int trappedRainwater(int [] height){
// int n= height.length;

// int res = 0, l=0, r=n-1;
// int rMax = height[r], lMax = height[l];

// while(l<r){
// if(lMax<rMax){
// l++;
// lMax = Math.max(lMax,height[l]);

// res += lMax - height[l];
// }
// else{
// r--;
// rMax = Math.max(rMax,height[r]);
// res += rMax - height[r];

// }
// }
// return res;
// }

// public static void main(String[] args) {
// vj obj = new vj();
// int[] height1 = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
// int[] height2 = {4, 2, 0, 3, 2, 5};
// System.out.println(obj.trappedRainwater(height1));
// System.out.println(obj.trappedRainwater(height2));

// }
// }

// Question 38:
// Given an integer array nums, return all the triplets [nums[i], nums[j],
// nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] +
// nums[k] == 0.
// Notice that the solution set must not contain duplicate triplets.

// Example 1:
// Input:nums = [-1, 0, 1, 2, -1, -4]
// Output: [ [-1, -1, 2] , [-1, 0, 1] ]

// Example 2:
// Input:nums = [ ]
// Output: [ ]

// Example 3:
// Input:nums = [ 0 ]
// Output: [ ]

// import java.util.*;

// class vj {
// public List<List<Integer>> threeSum(int[] nums) {
// List<List<Integer>> res = new ArrayList<>();
// for (int i = 0; i < nums.length; i++) {
// for (int j = i + 1; j < nums.length; j++) {
// for (int k = j + 1; k < nums.length; k++) {
// if (nums[i] + nums[j] + nums[k] == 0) {
// List<Integer> triplet = new ArrayList<>();
// triplet.add(nums[i]);
// triplet.add(nums[j]);
// triplet.add(nums[k]);
// Collections.sort(triplet);
// res.add(triplet);
// }
// }

// }
// }
// return res;
// }
// }
// class index{
// public static void main(String[] args) {
// vj obj = new vj();
// int[] nums = {-1, 0, 1, 2, -1, -4};
// System.out.println(obj.threeSum(nums));
// }
// }

// // Question 39:- Bubble sort
// class vj{
// public static void bubbleSort(int[] arr){

// // for(int i=0;i<arr.length-1;i++){
// // for(int j=0;j<arr.length-1-i;j++){
// // if(arr[j]>arr[j+1]){
// // int temp = arr[j];
// // arr[j] = arr[j+1];
// // arr[j+1] = temp;
// // }
// // }
// // }

// // ------------if array is already sorted--------------
// boolean swapped;
// for(int i=0;i<arr.length-1;i++){
// swapped = false;
// for(int j=0;j<arr.length-1-i;j++){
// int temp = arr[j];
// arr[j] = arr[j+1];
// arr[j+1] = temp;
// swapped = true;
// }
// }
// }
// public static void main(String[] args) {
// // int[] arr = {5, 4, 3, 2, 1};
// int[] arr = {1,2,3,4,5};

// vj obj = new vj();
// obj.bubbleSort(arr);
// for(int i=0;i<arr.length;i++){
// System.out.print(arr[i] + " ");
// }
// }
// }

// // Question 40:- SelectionSort
// class vj{
// public static void SelectionSort(int arr[]){
// for(int i=0;i<arr.length-1;i++){
// int minPos = i;
// for(int j=i+1;j<arr.length;j++){
// if(arr[minPos]>arr[j]){
// minPos = j;
// }
// }
// int temp = arr[i];
// arr[i] = arr[minPos];
// arr[minPos] = temp;
// }

// }

// public static void main(String[] args) {
// int[] arr = {5, 4,1, 3, 2};
// vj obj = new vj();
// obj.SelectionSort(arr);
// for(int i=0;i<arr.length;i++){
// System.out.print(arr[i] + " ");
// }
// }
// }

// // Question 41:-insertion sort
// import java.util.Arrays;
// import java.util.*;

// class vj{
// public static void insertionSort(int arr[]){
// for(int i=1;i<arr.length;i++){
// int curr = arr[i];
// int prev = i-1;
// // finding out the correct position to insert
// for(int j=prev;j>=0;j--){
// if(arr[prev] > curr){
// arr[prev+1] = arr[prev];
// prev--;

// }
// }
// arr[prev+1] = curr;
// }
// }
// public static void main(String[] args) {
// int[] arr = {5, 4,1, 3, 2};
// // vj obj = new vj();
// // obj.insertionSort(arr);
// Arrays.sort(arr);
// // System.out.println(Arrays.toString(arr));

// // for(int i=0;i<arr.length;i++){
// // System.out.print(arr[i]);
// // }
// }
// }

// // ----------------Inbuilt Sort----------------
// import java.util.Arrays;

// Arrays.sort(arrayname..)
// O(nlogn)

// Arrays.sort(arrayname,startingIndex,endingIndex)

// //--------------------------------------------------------------

// import java.util.Collections;

// Arrays.sort(arr,collections.reverseOrder())

// Arrays.sort(arr,si,ei,collections.reverseOrder())

// --------------------------
// // Question 42:- countingSort
// class vj{
// public static void countingSort(int arr[]){
// int largest = Integer.MIN_VALUE;
// for(int i=0;i<arr.length;i++){
// largest = Math.max(largest,arr[i]);
// }

// int count[] = new int[largest+1];
// for(int i=0;i<arr.length;i++){
// count[arr[i]]++;
// }

// //Sorting
// int j = 0;
// for(int i=0;i<count.length;i++){
// while(count[i]>0){
// arr[j]=i;
// j++;
// count[i]--;
// }
// }

// }
// public static void main(String[] args) {
// int[] arr = {5, 4,1, 3, 2,2,3};
// vj obj = new vj();
// obj.countingSort(arr);
// for(int i=0;i<arr.length;i++){
// System.out.print(" "+arr[i]);
// }

// }
// }

// Question 44 to 47:-

// Question :Use the following sorting algorithms tosort an array in DESCENDING
// order :
// a.Bubble Sort
// b.Selection Sort
// c.Insertion Sort
// d.Counting Sort
// You can use this array as an example :[3,6,2,1,8,7,4,5,3,1]

// a.Bubble Sort
// class vj{
// public static void bubbleSort(int arr[]){
// for(int i =0;i<arr.length-1;i++){
// for(int j=0;j<arr.length-1-i;j++){
// if(arr[j]<arr[j+1]){
// int temp = arr[j];
// arr[j] = arr[j+1];
// arr[j+1] = temp;

// }
// }
// }
// }
// public static void main(String[] args) {
// int arr[] = {3,6,2,1,8,7,4,5,3,1};
// vj obj = new vj();
// obj.bubbleSort(arr);
// for(int i=0;i<arr.length;i++){
// System.out.print(arr[i]);
// }
// }
// }

// b.Selection Sort
// class vj{
// public static void selectionSort(int arr[]){
// for(int i=0;i<arr.length;i++){
// int minPos = i;
// for(int j=i+1;j<arr.length;j++){
// if(arr[minPos]<arr[j]){
// minPos = j;
// }
// }
// int temp = arr[i];
// arr[i] = arr[minPos];
// arr[minPos] = temp;
// }
// }
// public static void main(String[] args) {
// int arr[] = {3,6,2,1,8,7,4,5,3,1};
// vj obj = new vj();
// obj.selectionSort(arr);
// for(int i=0;i<arr.length;i++){
// System.out.print(arr[i] + " ");
// }
// }
// }

// // c.Insertion Sort
// class vj{
// public static void insertionSort(int[] arr){
// for( int i =1;i<arr.length;i++){
// int curr = arr[i];
// int prev = i-1;
// while(prev>=0 && arr[prev]<curr){
// arr[prev+1] = arr[prev];
// prev--;
// }
// arr[prev+1] = curr;
// }

// }
// public static void main(String[] args) {
// int arr[] = {3,6,2,1,8,7,4,5,3,1};
// vj obj = new vj();
// obj.insertionSort(arr);
// for(int i=0;i<arr.length;i++){
// System.out.print(arr[i] + " ");
// }
// }
// }

// d.Counting Sort
// class vj{
// public static void countingSort(int arr[]){
// int largest = Integer.MIN_VALUE;
// for(int i=0;i<arr.length;i++){
// largest = Math.max(largest,arr[i]);
// }

// int count[] = new int[largest+1];
// for(int i =0;i<arr.length;i++){
// count[arr[i]]++;
// }
// int j =0;
// for(int i =count.length-1;i>=0;i--){
// while(count[i]>0){
// arr[j]=i;
// j++;
// count[i]--;
// }
// }

// }

// public static void main(String[] args) {
// int arr[] = {3,6,2,1,8,7,4,5,3,1};
// vj obj = new vj();
// obj.countingSort(arr);
// for(int i=0;i<arr.length;i++){
// System.out.print(arr[i] + " ");
// }
// }
// }

// questions 49:- Matrix

// import java.util.Scanner;

// class vj{
// public static void main(String[] args) {
// int matrix[][] = new int[3][3];
// int n = matrix.length;
// int m = matrix[0].length;

// Scanner sc = new Scanner(System.in);
// System.out.println("Enter the elements of the matrix");

// for(int i=0; i<n;i++){
// for(int j=0;j<m;j++){
// matrix[i][j] = sc.nextInt();
// }
// }

// for(int i=0;i<n;i++){
// for(int j=0;j<m;j++){
// System.out.print(matrix[i][j] + " ");
// }
// System.out.println();
// }
// }
// }

// questions 49:-search Element from Matrix

// import java.util.Scanner;

// class vj{

// public static boolean search(int matrix[][] ,int key){
// for(int i=0;i<matrix.length;i++){
// for(int j=0;j<matrix[0].length;j++){
// if(matrix[i][j]==key){
// System.out.println("found at cell ( "+ i+ " , "+ j+ " )");
// return true;
// }
// }
// System.out.println("not found");
// return false;

// }
// }
// public static void main(String[] args) {
// int matrix[][] = new int[3][3];
// int n = matrix.length;
// int m = matrix[0].length;

// Scanner sc = new Scanner(System.in);
// System.out.println("Enter the elements of the matrix");

// for(int i=0; i<n;i++){
// for(int j=0;j<m;j++){
// matrix[i][j] = sc.nextInt();
// }
// }

// for(int i=0;i<n;i++){
// for(int j=0;j<m;j++){
// System.out.print(matrix[i][j] + " ");
// }
// System.out.println();
// }
// }
// }

// questions 49:- Spiral
// class vj{
// public static void printSpiral(int matrix[][]){
// int startRow = 0;
// int startCol = 0;
// int endRow = matrix.length-1;
// int endCol = matrix[0].length-1;

// while(startRow<=endRow && startCol<=endCol){
// //top
// for(int j=startCol;j<=endCol;j++){
// System.out.print(matrix[startRow][j]+" ");
// }
// // right
// for(int i=startRow+1; i<=endRow;i++){
// System.out.print(matrix[i][endCol]+" ");
// }
// //bottom
// for(int j=endCol-1;j>=startCol;j--){
// if(startRow == endRow){
// break;
// }
// System.out.print(matrix[endRow][j]+" ");
// }
// //left
// for(int j = endRow-1;j>=startRow+1;j--){
// if(startCol == endCol){
// break;
// }
// System.out.print(matrix[j][startCol]+" ");
// }
// startRow++;
// startCol++;
// endRow--;
// endCol--;
// }
// System.out.println();

// }
// public static void main(String[] args) {
// int matrix[][] = {
// {1,2,3,4},
// {5,6,7,8},
// {9,10,11,12},
// {13,14,15,16}

// };
// printSpiral(matrix);

// }
// }

// // questions 49:-Diagonal Sum
// class vj{
// public static int diagonalSum(int matrix[][]){
// int sum = 0;
// for(int i=0;i<matrix.length;i++){
// for(int j=0;j<matrix[0].length;j++){
// if(i==j){
// sum+=matrix[i][j];
// }
// else if (i+j == matrix.length-1){
// sum+=matrix[i][j];
// }
// }
// }
// return sum; // Time Complexity:- O(n^2)
// }

// //Linear Equations
// public static int diagonalSum(int matrix[][]){
// int sum = 0;
// for(int i=0;i<matrix.length;i++){
// //primary Diagonal
// sum+=matrix[i][i];
// // Secondary Diagonal
// if(i!=matrix.length-1){
// sum+=matrix[i][matrix.length-i-1];
// }
// }
// return sum;
// }

// public static void main(String[] args) {
// int matrix[][] = {
// {1,2,3},
// {4,5,6},
// {7,8,9}
// };
// System.out.println(diagonalSum(matrix));
// }
// }

// // questions 49:- StairscaseSearch
// class vj{
// public static boolean StairscaseSearch(int matrix[][],int key){
// int row=0,col=matrix[0].length-1;
// while(row<matrix.length && col>=0){
// if(matrix[row][col]==key){
// System.out.println("found at cell ( "+ row+ " , "+ col+ " )");
// return true;
// }
// else if(key <matrix[row][col]){
// col--;
// }
// else{
// row++;
// }
// }
// System.out.println("not found");
// return false;
// }
// public static void main(String[] args) {
// int matrix[][] = {
// {10,20,30,40},
// {15,25,35,45},
// {27,29,34,47},
// {32,33,39,50}
// };
// int key = 29;
// System.out.println(StairscaseSearch(matrix,key));
// }
// }

// // questions 50:- Print the number of 7’s that are inthe 2d array.
// Example :
// Input - int[][] array = { {4,7,8},{8,8,7} };
// Output - 2
// -: Solutions :-

// class vj{
// public static void main(String[] args) {
// int[][] array = { {4,7,8},{8,8,7} };
// int countOf7 = 0;
// for(int i=0;i<array.length;i++){
// for(int j=0;j<array[0].length;j++){
// if(array[i][j]==7){
// countOf7++;
// }
// }
// }
// System.out.println("count of 7 is " + countOf7);
// }
// }

// // questions 50:-Print out the sum of the numbers in the second row of the
// “nums” array.
// Example :
// Input - int[][] nums = { {1,4,9},{11,4,3},{2,2,3} };
// Output - 18
// -: Solutions :-
// class vj{
// public static void main(String[] args) {
// int[][] nums = { {1,4,9},{11,4,3},{2,2,3} };
// int sum = 0;
// for(int j=0;j<nums[0].length;j++){
// sum+=nums[1][j];
// }
// System.out.println("sum is " + sum);
// }
// }

// // questions 50:-Write a program to FindTransposeofa Matrix.
// What is Transpose?
// Transpose of a matrix is the process of swapping the rows to columns. For a
// 2x3 matrix,

// Matrix
// a11 a12 a13
// a21 a22 a23
// Transposed Matrix

// a11 a21
// a12 a22
// a13 a23

// class vj{
// public static void printTransposeMatrix(int[][] matrix){
// System.out.println("The matrix is: ");
// for(int i=0; i<matrix.length;i++){
// for(int j=0;j<matrix[0].length;j++){
// System.out.print(matrix[i][j]+" ");
// }
// System.out.println();
// }
// }

// public static void main(String[] args) {
// int row =2,column = 3;
// int[][] matrix = {
// {1,2,3},
// {4,5,6}
// };
// printTransposeMatrix(matrix);

// int [][] transpose = new int [column][row];
// for(int i=0;i<row;i++){
// for(int j=0;j<column;j++){
// transpose[j][i] = matrix[i][j];
// }
// }

// printTransposeMatrix(transpose);
// }
// }

// ------------String------------
// // Question51:- find length of string
// class vj{
// public static void main(String[] args) {
// String str = "Vijendra Sharma";
// System.out.println(str.length());
// }
// }

// // Question52:- Print all string chracter
// class vj{
// public static void printAllChar(String str){
// for(int i=0;i<str.length();i++){
// System.out.print(str.charAt(i) + " ");
// }
// }
// public static void main(String[] args) {
// String str = "Vijendra Sharma";
// printAllChar(str);
// }
// }

// // Question53:- Pallindrome (mirror output)
// class vj{
// public static boolean palindrome(String str){
// for(int i=0;i<str.length()/2;i++){
// int n = str.length()-i-1;
// if(str.charAt(i)!=str.charAt(n)){
// return false;
// }
// }
// return true;
// }

// public static void main(String[] args) {
// String str = "racecar";
// System.out.println(palindrome(str));
// }
// }

/*
 * 
 * Questions 54:- Given a route conataining 4 directions (E,W,N,S),
 * Find the shortest path to reach destination
 * "WNEENESENNN"
 * 
 * note:- N ^ y+1
 * S v y-1
 * W < x-1
 * E > x+1
 * 
 * √ -> Square Root
 * Formulae:- √ ((x2-x1)^2 + (y2-y1)^2)
 */

// class vj{
// public static float getShortestPath(String path){
// int x=0,y=0;
// for(int i=0;i<path.length();i++){
// char dir = path.charAt(i);
// //South
// if(dir == 'S'){
// y--;
// }
// //North
// else if(dir == 'N'){
// y++;
// }
// //West
// else if(dir == 'W'){
// x--;
// }
// //East
// else{
// x++;
// }
// }
// int x2 = x*x;
// int y2 = y*y;
// return (float) Math.sqrt(x2+y2);
// }
// public static void main(String[] args) {
// String path = "WNEENESENNN";
// System.out.println(getShortestPath(path));
// }
// }

// // Questions 54:- String comparision
// class vj{
// public static void main(String[] args) {
// String x= "Vijendra";
// String y = "Vijendra";
// String z = new String("Vijendra");
// if(x==y){
// System.out.println("Same");
// }else{
// System.out.println("Not same");
// }
// if(x==z){
// System.out.println("Equal");
// }
// else{
// System.out.println("Not equal");
// }
// }
// }

// // Questions 55:- Print SubString
// class vj{
// public static String SubString(String str,int si,int ei){
// String substr = "";
// for(int i=si;i<ei;i++){
// substr = substr + str.charAt(i);
// }
// return substr;

// }
// public static void main(String[] args) {
// String str = "Vijendra";
// System.out.println(SubString(str, 1, 5));5
// }

// }

// Questions 56:- CompareTo or compareToIgnoreCase
// For a given set of Strings, print the largest string.
// "apple" ,"mango","banana"

// class vj{
// public static void main(String[] args) {
// String[] Fruits = {"apple" ,"mango","banana"};

// String largest = Fruits[0];
// for(int i=1;i<Fruits.length;i++){
// if(largest.compareTo(Fruits[i])<0){
// largest = Fruits[i];
// }
// }
// System.out.println(largest);

// }
// }

// agr hum baar baar string mai value change krke new value daalenge to time
// complexity bd jayegi
// ishlie hum Stringbuilder ka use krenge to use time Complexity km hogi

// Questions 57:-StringBuilder
// class vj{
// public static void main(String[] args) {
// StringBuilder sb = new StringBuilder();
// for(char ch ='a'; ch<='z';ch++){
// sb.append(ch +" ");

// }
// System.out.println(sb);
// }
// }

// Questions 57:-For a given String convert each the first letter of each word
// to uppercase
// "hi i am vijendra sharma"
// class vj{
// public static String toUpperCase(String str){
// StringBuilder sb = new StringBuilder();
// char ch = Character.toUpperCase(str.charAt(0));
// sb.append(ch);
// for(int i=1;i<str.length();i++){
// if(str.charAt(i)== ' ' && i<str.length()-1){
// sb.append(str.charAt(i));
// i++;
// sb.append(Character.toUpperCase(str.charAt(i)));
// }
// else{
// sb.append(str.charAt(i));
// }
// }
// return sb.toString();
// }
// public static void main(String[] args) {
// String str = "hi i am vijendra sharma";
// System.out.println(toUpperCase(str));
// }
// }

// // Questions 58:- String Compression
// // "aaabbcccdd" "a3b2c3d2"
// class vj{
// public static String compress(String str){
// String newStr = "";
// for(int i=0;i<str.length();i++){
// Integer count = 1;
// while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
// count++;
// i++;
// }
// newStr += str.charAt(i);
// if(count>1){
// newStr += count.toString();
// }
// }
// return newStr;
// }
// public static void main(String[] args) {
// String str = "aaabbcccdd";
// System.out.println(compress(str));
// }
// }

// // questions 60:- Count how many times lowercase vowels occurred in a String
// entered by the user.

// import java.util.Scanner;

// class vj{
// public static void main(String[] args) {
// System.out.println("Enter a String");
// String str = new Scanner(System.in).next();
// int count = 0;
// for(int i=0;i<str.length();i++){
// char ch = str.charAt(i);
// if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
// count++;
// }
// }
// System.out.println("count of vowels is :- " + count);
// }
// }

// // questions 61:- What will be the output of the following code?
// class Solution{
// public static void main(String args[]) {
// String str="ShradhaDidi";
// String str1="ApnaCollege";
// String str2="ShradhaDidi";
// System.out.println(str.equals(str1) +" "+str.equals(str2));
// }
// }

// // Question 62:- What will be the output of the followingcode?
// class Solution{
// public static void main(String args[]) {
// String str="ApnaCollege".replace("l","");
// System.out.println(str);
// }
// }

// Question 63:- Determine if 2 Strings areanagrams of each other.
// What are anagrams?
// If two strings contain the same characters but in a different order,
// they can be said to be anagrams.Consider race and care.
// In this case,race's characters can be formed in to a study,or care's
// characters can be formed into race.Below is a java program to check if two
// strings are anagrams or not

// import java.util.Arrays;

// class vj{
// public static void main(String[] args) {
// String str1 = "race";
// String str2 = "care";
// //Convert Strings to lowercase. Why? so thatwe don't have to check separately
// for lower & uppercase.
// str1 = str1.toLowerCase();
// str2= str2.toLowerCase();

// // First check - if the lengths are the same
// if(str1.length() == str2.length()){
// // convert Strings int0 char array
// char[] str1charArray = str1.toCharArray();
// char[] str2charArray = str2.toCharArray();
// // sort the char array
// Arrays.sort(str1charArray);
// Arrays.sort(str2charArray);
// // if the sorted char arrays are sameor identical then the strings are
// anagram
// boolean result = Arrays.equals(str1charArray, str2charArray);
// if(result){
// System.out.println(str1 + " and " + str2 + " are anagrams");
// }
// else{
// System.out.println(str1 + " and " + str2 + " are not anagrams");
// }
// }
// else{
// System.out.println(str1 + " and " + str2 + " are not anagrams of each
// other");
// }
// }

// }

// Question 64:- Search and read about
// a.intern( ) method in String

// solutions:-
// The intern() method in Java is used to ensure that all strings having the
// same contents share the same memory location.
// This can help save memory by preventing duplicate string objects with the
// same content.
// class vj{
// public static void main(String[] args) {
// String str1 = "Hello";
// String str2 = "Hello";
// String str3 = new String("Hello");

// System.out.println(str1 == str2); // Output: true
// System.out.println(str1 == str3); // Output: false

// str1 = str1.intern();
// str2 = str2.intern();
// str3 = str3.intern();

// System.out.println(str1 == str2); // Output: true
// System.out.println(str1 == str3); // Output: true
// }
// }

// // b.StringBuffer
// StringBuffer in Java is a mutable sequence of characters.
// It provides methods to modify the sequence of characters in the string
// without creating a new memory allocation for every modification.
// // This can be more efficient when concatenating or modifying strings
// frequently.
// class vj{
// public static void main(String[] args) {
// StringBuffer sb = new StringBuffer("Hello");
// sb.append(" World");
// System.out.println(sb.toString()); // Output: Hello World

// sb.insert(5, "!");
// System.out.println(sb.toString()); // Output: Hello! World

// sb.delete(5, 6);
// System.out.println(sb.toString()); // Output: Hello World
// }
// }

/*-------------------------------------------------------------------------------------------------------------------------------------------------- */

// BIT MANIPULATION
// Question 65:-
// class BitManipulation{
// public static void oddOrEven(int n){
// int bitMask =1;
// if((n & bitMask)==0){
// System.out.println("even Number");
// }else{
// System.out.println("odd Number");
// }
// }
// public static void main(String[] args) {
// oddOrEven(10);
// oddOrEven(11);
// oddOrEven(14);
// }
// }

// // Question 66:- getInBit

// class vj{
// public static int getIthBit(int n,int i){
// int bitMask = 1<<i;
// if((n & bitMask)==0){
// return 0;

// }else{
// return 1;
// }
// }
// public static void main(String[] args) {
// System.out.println(getIthBit(5,1));
// }
// }

// // Question 66:- setIthBit
// class vj{
// public static int setInBit(int n,int i){
// int bitMask = 1<<i;
// return (n | bitMask);
// }
// public static void main(String[] args) {
// System.out.println(setIthBit(10,2));
// }
// }

// // Question 67:- clearIthBit
// class vj{
// public static int clearIthBit(int n,int i){
// int bitMask = ~(1<<i);
// return (n & bitMask);
// }
// public static void main(String[] args) {
// System.out.println(clearIthBit(10,2));
// }
// }

// // // Question 68:- updateIthBit
// class vj{
// public static int clearIthBit(int n,int i){
// int bitMask = ~(1<<i);
// return (n & bitMask);
// }

// public static int updateIthBit(int n,int i ,int newBit){
// n = clearIthBit(n,i);
// int bitMask = newBit<<i;
// return (n | bitMask);
// }
// public static void main(String[] args) {
// System.out.println(updateIthBit(10,2,1));
// }
// }

// // // Question 68:- clearIBit

// class vj{
// public static int clearIBit(int n,int i){
// int bitMask = ~(1<<i);
// return (n & bitMask);
// }
// public static void main(String[] args) {
// System.out.println(clearIBit(10,2));
// }
// }

// // Question 69:- clearBitsInRange
// class vj{
// public static int clearBitsInRange(int n,int i,int j){
// int a = ((~0)<<(j+1));
// int b = ((1<<i)-1);
// int bitMask = a|b;
// return (n & bitMask);
// }
// public static void main(String[] args) {
// System.out.println(clearBitsInRange(10,2,3));
// }
// }

// Questions:-70
// Check if a number is a Power of 2 or not
// class vj{
// public static boolean isPowerOfTwo(int n){
// return (n&(n-1))==0;
// }
// public static void main(String[] args) {
// System.out.println(isPowerOfTwo(16));
// }
// }

// Questions: 71
// Count Set Bits in a Number
// class vj{
// public static int countSetBits(int n){
// int count = 0;
// while(n>0){
// if((n&1)!=0){ //check our LSB (least significant bit)
// count++;
// }
// n = n>>1;
// }
// return count;

// }
// public static void main(String[] args) {
// System.out.println(countSetBits(10));
// }
// }

// Questions 72:- Fast Exponentiation
// class vj{
// public static int fastExpo(int a , int n){
// int ans =1;
// while(n>0){
// if((n&1)!=0){
// ans = ans*a;
// }
// a=a*a;
// n=n>>1;
// }
// return ans;
// }
// public static void main(String[] args) {
// System.out.println(fastExpo(2,3));
// }
// }

// BIT MANIPULATION QUESTIONS

// Questions 73:- What is the value of x^x for any value of x?
// Solution : The value of x^x = 0.
// ,x or gives 0 when the bits are the same.
// If we compare the same number toitself, the bits will always be the same.
// So, the answer of x^x will always be 0

// Question 74:- Swap two numbers without using any third variable.
// Solution:- The idea is to use XOR operators toswap two numbers by their
// property x ^ x = 0
// class vj{
// public static void main(String[] args) {
// int x =3,y=4;
// System.out.println("before swapping x = " + x + "and y = " + y);

// //Swap using xor
// x=x^y;
// y=x^y;
// x=x^y;
// System.out.println("after swapping x = " + x + "and y = " + y);

// }
// }

// Question 75:- Add 1 to an integer using Bit Manipulation.
// (Hint: try using Bitwise NOT Operator)
// Solution:
// The expression -~x will add 1 to an integer x.
// We know that to get negative of anumber,
// invert its bits and add 1 to it(Remember negative numbers a restored in 2’s
// complement form),
// i.e.,
// -x = ~x + 1;
// -~x = x + 1 (by replacing x by ~x)
// class vj{
// public static void main(String[] args) {
// int x = 6;
// System.out.println(x + " + " +1 +" is " + (-~x));
// x= -4;
// System.out.println(x + " + " +1 +" is " + (-~x));

// x= 0;
// System.out.println(x + " + " +1 +" is " + (-~x));

// }
// }

// Question 76 :This question is based on a trick, please directly look at the
// solution.
// Convert uppercase characters to lowercase using bits
// class vj{
// public static void main(String[] args) {
// for(char ch ='A';ch<='Z';ch++){
// System.out.println((char)(ch|' '));
// }
// }
// }

/*
 * NOTE
 * 
 * A Good read of hacks using bits (youcan check this out in your free time) :
 * http://graphics.stanford.edu/~seander/bithacks.html
 * 
 */

// -----------------OOPS----------
// Question 77:- Print the sum,difference and product of two complex numbers by
// creating a class named 'Complex' with separate methods for each operation
// whose real and imaginary parts are entered by the user.
// class complex{
// int real;
// int imag;
// public complex(int r,int i){
// real = r;
// imag = i;
// }
// public static complex add(complex a,complex b){
// return new complex((a.real+b.real) , (a.imag+b.imag));
// }

// public static complex diff(complex a,complex b){
// return new complex((a.real-b.real) , (a.imag-b.imag));
// }

// public static complex product(complex a,complex b){
// return new complex((a.real*b.real)-(a.imag*b.imag) ,
// ((a.real*b.imag)+(a.imag*b.real)));
// }
// public void printComplex(){
// if(real==0 && imag!=0){
// System.out.println(imag+"i");
// }
// else if(imag ==0 && real!=0){
// System.out.println(real);
// }
// else{
// System.out.println(real + " + " + imag + "i");
// }
// }
// public static void main(String[] args) {
// complex a = new complex(2,3);
// complex b = new complex(4,5);
// complex c = complex.add(a,b);
// complex d = complex.diff(a,b);
// complex e = complex.product(a,b);
// c.printComplex();
// d.printComplex();
// e.printComplex();
// }
// }

// -----Recursion----

// // Question 78:- print 10 to 1 using recursion
// class recursion{
// public static void printDec(int n){
// if(n==1){
// System.out.println(n);
// return ;
// }
// System.out.print(n+ " ");
// printDec(n-1);
// }
// public static void main(String[] args) {
// printDec(10);
// }
// }

// // Question 79- print 1 to n using recursion(increasing Order)
// class vj{
// public static void printInc(int n){
// if(n==1){
// System.out.print(n+ " ");
// return;
// }
// printInc(n-1);
// System.out.print(n+ " ");
// }
// public static void main(String[] args) {
// printInc(10);
// }
// }

// Question 80: Factorial
// class vj{
// public static int fact(int n){
// if(n==0){
// return 1;
// }
// int fn = n*fact(n-1);
// return fn;
// }
// public static void main(String[] args) {
// System.out.println(fact(5));
// }
// }

// // Question 81: Print of sum of natural number
// class vj{
// public static int calSum(int n){
// if(n==0){
// return 0;
// }
// int sum = n+calSum(n-1);
// return sum;
// }
// public static void main(String[] args) {
// System.out.println(calSum(5));
// }
// }

// Question 82: print nth Fibonacci number
// class vj{
// public static int fib(int n){
// if(n==0 || n==1){
// return n;
// }
// int a = fib(n-1);
// int b= fib(n-2);
// int fibo = a+b;
// return fibo;
// }
// public static void main(String[] args) {
// System.out.println(fib(5));
// }
// }

// // Question 83:- check array is sorted
// class vj{
// public static boolean isSorted(int arr[] ,int i){
// if(i == arr.length-1){
// return true;
// }
// if(arr[i]>arr[i+1]){
// return false;
// }
// return isSorted(arr, i+1);
// }
// public static void main(String[] args) {
// int arr[] = {1,2,3,4,5};
// System.out.println(isSorted(arr,0));
// }
// }

// // question 84: WAF(write a function) to find the first occurence of an
// element in an array
// class vj{
// public static int firstOccurence(int arr[] ,int key, int i){
// if(i==arr.length){
// return -1;
// }
// if(arr[i]==key){
// return i;
// }
// return firstOccurence(arr,key,i+1);
// }
// public static void main(String[] args) {
// int arr[] = {1,2,4,4,3,2,4,5,6,89,7,65};
// System.out.println(firstOccurence(arr,5,0));
// }
// }

// // question 85: WAF(write a function) to find the last occurence of an
// element in an array
// class vj{
// public static int lastOccurence(int arr[] ,int key, int i){
// if(i == arr.length){
// return -1;
// }
// int isFound = lastOccurence(arr,key,i+1);
// if(isFound == -1 && arr[i]==key){
// return i;
// }
// return isFound;
// }
// public static void main(String[] args) {
// int arr[] = {1,2,4,4,3,2,4,5,6,89,7,4,9};
// System.out.println(lastOccurence(arr,9,0));
// }
// }

// // Question 86: print x^n
// class vj{
// public static int power(int x,int n){
// if(n==0){
// return 1;
// }

// // int pow = power(x,n-1);
// // int z = x*pow;
// // return z;

// return x*power(x,n-1);
// }
// public static void main(String[] args) {
// System.out.println(power(2,3));
// }
// }

// // Question 87: print x^n in O(logn)
// class vj{
// public static int OptimizedPower(int a,int n){
// if(n==0){
// return 1;
// }
// // int halfPowerSq = OptimizedPower(a,n/2)*OptimizedPower(a, n/2);

// int halfPower = OptimizedPower(a,n/2);
// int halfPowerSq = halfPower*halfPower;

// // n is odd
// if(n%2!=0){
// halfPowerSq = a*halfPowerSq;
// }
// return halfPowerSq;
// }
// public static void main(String[] args) {
// int a=2;
// int n=5;
// System.out.println(OptimizedPower(a,n));
// }
// }

/*
 * 
 * Question 88: Tiling Problem
 * given a "2 * n" board/floor and tiles of size "2 * 1",
 * count the number of ways to tile the given board using the 2*1 tiles.
 * (A tile can either be placed horizontally or vertically).
 * 
 */
// class vj{
// public static int TilingProblem(int n){ //2 * n (floor size)

// //base case
// if(n==0 || n==1){
// return 1;
// }

// //kaam
// //vertical choice
// int vc1 = TilingProblem(n-1);

// //horizontal choice
// int hc1 = TilingProblem(n-2);

// int totWays = vc1 + hc1;
// return totWays;

// ---------2nd ways-------------
// return TilingProblem(n-1) + TilingProblem(n-2);

// }
// public static void main(String[] args) {
// System.out.println(TilingProblem(4));
// }
// }

// Question 89: remove Duplicate in a String
// "vijjenndrra"
// class vj{
// public static void removeDuplicate(String str, int idx, StringBuilder newStr,
// boolean map[] ){
// if(idx == str.length()){
// System.out.println(newStr);
// return;
// }

// //kaam
// char currChar = str.charAt(idx);
// if(map[currChar-'a'] == true){

// //duplicate
// removeDuplicate(str, idx+1, newStr, map);
// }else{
// map[currChar-'a'] = true;
// removeDuplicate(str, idx+1, newStr.append(currChar), map);
// }
// }
// public static void main(String[] args) {
// String str = "vijjenndrra";
// removeDuplicate(str, 0, new StringBuilder(""), new boolean[26]);
// }
// }

// for Array
// class vj {
// public static void removeDuplicate(String str, int idx, StringBuilder newStr,
// int[] count) {
// if (idx == str.length()) {
// System.out.println(newStr);
// return;
// }

// char currChar = str.charAt(idx);
// if (count[currChar - 'a'] > 0) {
// // Duplicate
// removeDuplicate(str, idx + 1, newStr, count);
// } else {
// count[currChar - 'a']++;
// removeDuplicate(str, idx + 1, newStr.append(currChar), count);
// }
// }

// public static void main(String[] args) {
// String str = "vijjenndrra";
// // Initialize count array
// int[] count = new int[26];
// removeDuplicate(str, 0, new StringBuilder(""), count);
// }
// }

// // for int[] = {....}
// import java.util.*;

// class Main {
// public static void removeDuplicate(int[] arr, int idx, List<Integer> newList,
// int[] count) {
// if (idx == arr.length) {
// System.out.println(newList);
// return;
// }

// int currInt = arr[idx];
// if (count[currInt] > 0) {
// // Duplicate
// removeDuplicate(arr, idx + 1, newList, count);
// } else {
// count[currInt]++;
// newList.add(currInt);
// removeDuplicate(arr, idx + 1, newList, count);
// newList.remove(newList.size() - 1); // Backtrack
// count[currInt]--;
// }
// }

// public static void main(String[] args) {
// int[] arr = {1, 2, 3, 4, 5, 6, 7};
// // Initialize count array
// int maxVal = Arrays.stream(arr).max().getAsInt();
// int[] count = new int[maxVal + 1];
// removeDuplicate(arr, 0, new ArrayList<>(), count);
// }
// }

/*
 * Question 90;
 * Friends Pairing Problem
 * Given n friends, each one can remain single or can be paired up with some
 * other friend.
 * Each friend can be paired only once.
 * Find out the total number of ways in which friends can remain single or can
 * be paired up.
 */

// class vj{
// public static int friendsPairing(int n){
// if(n==1 || n==2){
// return n;
// }
// //choice
// //single
// // int single = friendsPairing(n-1);

// // //pair
// // int pair = friendsPairing(n-2) * (n-1);
// // int pairsWays = (n-1) * pair;

// // //totalWays
// // int totways = single + pairsWays;
// // return totways;

// //----2nd way to write------
// return friendsPairing(n-1) + (n-1) * friendsPairing(n-2);
// }
// public static void main(String[] args) {
// System.out.println(friendsPairing(4));
// }
// }

/*
 * 
 * Question 91:
 * Binary String
 * Print all binary string of size N without consecutive_ones(010110 not allowed
 * bcz 11 ek sath h binary mai).
 * 
 */
// class vj{
// public static void printBinStrings(int n, int lastPlace , String str){

// //base case
// if(n==0){
// System.out.println(str);
// return;
// }

// //---kaam---
// // if(lastPlace ==0){
// // //sit 0 on chair n
// // printBinStrings(n-1, 0, str.append("0"));
// // printBinStrings(n-1, 1, str.append("1"));
// // }else{
// // printBinStrings(n-1, 0, str.append("0"));
// // }

// //---2nd way---
// printBinStrings(n-1,0, str+"0");
// if(lastPlace == 0){
// printBinStrings(n-1, 1, str+"1");
// }

// }
// public static void main(String[] args) {
// printBinStrings(3, 0, "");
// }
// }

/*
 * 
 * Question92:
 * For a given integer array of size N.
 * You have to find all the occurrences (indices) of a given element (Key) and
 * print them.
 * Use a recursive function to solve this problem.
 * Sample Input: arr[ ] = {3, 2, 4, 5, 6, 2, 7, 2, 2},key = 2
 * Sample Output: 1 5 7 8
 * 
 */
// class vj{
// public static void allOccurences(int arr[],int key,int i){
// if(i == arr.length){
// return;
// }
// if(arr[i]==key){
// System.out.println(i + " ");
// }
// allOccurences(arr, key, i+1);
// }
// public static void main(String[] args) {
// int arr[] = {3, 2, 4, 5, 6, 2, 7, 2, 2};
// int key = 2;
// allOccurences(arr, key, 0);
// System.out.println();
// }
// }

/*
 * 
 * Question 93 :You are given a number (eg - 2019),
 * convert it into a String of english like“two zero one nine”.
 * Use a recursive function to solve this problem.
 * NOTE-The digits of the number will only be in the range 0-9 and the last
 * digit of a number can’t be 0.
 * Sample Input: 1947
 * Sample Output: “one nine four seven”
 */
// class vj{
// static String digits[] =
// {"zero","one","two","three","four","five","six","seven","eight","nine"};
// public static void printDigit(int number){
// if(number == 0){
// return;
// }
// int lastDigit = number % 10;
// printDigit(number/10);
// System.out.print(digits[lastDigit ]+ " ");
// }
// public static void main(String[] args) {
// printDigit(12345);
// }
// }

/*
 * Question 94 :
 * Write a program to find Length of a String using Recursion
 */
// class vj{
// public static int lengthOfString(String str){
// if(str.length() == 0){
// return 0;
// }
// return lengthOfString(str.substring(1)) + 1;
// }
// public static void main(String[] args) {
// String str = "vijjenndrra";
// System.out.println(lengthOfString(str));
// }
// }

/*
 * 
 * Question95:
 * We are given a string S,
 * we need to find the count of all contiguous sub strings starting and ending
 * with the same character.
 * Sample Input 1: S = "abcab"
 * Sample Output 1: 7
 * There are 15 substrings of "abcab" : a, ab, abc, abca, abcab, b, bc, bca,
 * bcab, c, ca, cab, a, ab, b Out of the above substrings,there are 7
 * substrings: a,abca,b,bcab,c,aandb. So, only 7 contiguous substrings start and
 * end with the same character.
 * 
 * Sample Input 2: S = "aba"
 * Sample Output 2: 4The substrings are a, b, a and aba
 * //
 */
// class vj{
// public static int contSubstrs(String str, int i, int j, int n){
// if(n==1){
// return 1;
// }
// if(n<=0){
// return 0;
// }
// int res = contSubstrs(str, i+1, j, n-1) +
// contSubstrs(str, i, j-1, n-1)-
// contSubstrs(str, i+1, j-1, n-2);

// if(str.charAt(i) == str.charAt(j)){
// res++;
// }
// return res;
// }
// public static void main(String[] args) {
// String str = "abcab";
// int n = str.length();
// System.out.println(contSubstrs(str, 0, n-1, n));
// }
// }

/*
 * 
 * Question 96 :TOWER OF HANOI(Important!)
 * You have 3 towers and N disks of different sizes which can slide on to any
 * tower.The puzzle starts with disks sorted in ascending order of size from top
 * to bottom (i.e.,eachdisksitsontop of an even larger one).
 * You have the following constraints:
 * (1) Only one disk can be moved at a time.
 * (2) A disk is slid off the top of one tower onto another tower.
 * (3)A disk can not be placed on top of a smaller disk.
 * Write a program to move the disks from the first tower to the last using
 * Stacks.
 * Let rod 1 = 'A', rod 2 = 'B', rod 3 = 'C'.
 * An example with 2 disks i.e. N=2:
 * Step 1 : Shift the first disk from 'A' to 'B'.
 * Step 2 : Shift the second disk from 'A' to 'C'.
 * Step 3 : Shift the first disk from 'B' to 'C'.
 * An example with 3 disks i.e. N=3 :
 * Step 1 : Shift the first disk from 'A' to 'C'.
 * Step 2 : Shift second disk from 'A' to 'B'.
 * Step 3 : Shift the first disk from 'C' to 'B'.
 * Step 4 : Shift the third disk from 'A' to 'C'.
 * Step 5 : Shift the first disk from 'B' to 'A'.
 * Step 6 : Shift second disk from 'B' to 'C'.
 * Step 7 : Shift the first disk from 'A' to 'C'.
 * 
 */
// class vj{
// public static void towerOfHanoi(int n, String src , String helper, String
// dest){
// if(n==1){
// System.out.println("transfer disk " + n + " from " +src + "to" + dest);
// return;
// }

// // transfer top n-1 from src to helper using dest as 'helper'
// towerOfHanoi(n-1, src, dest, helper);
// // transfer nth disk from src to dest
// System.out.println("transfer disk " + n + " from " +src + "to" + helper);

// // transfer top n-1 from helper to dest using src as 'helper'
// towerOfHanoi(n-1, src, helper, dest);
// }
// public static void main(String[] args) {
// int n =4;towerOfHanoi(n,"A","B","C");

// }
// }

// ----------------divide and conquer approach----------------------

// Question 97: Merge Sort

// class vj{
// public static void printArr(int arr[]){
// for(int i=0;i<arr.length;i++){
// System.out.print(arr[i]+" ");
// }
// System.out.println();
// }
// public static void mergeSort(int arr[],int si,int ei){
// if(si>=ei){
// return;
// }
// //kaam
// int mid = si +(ei-si)/2;// or (si+ei)/2;
// mergeSort(arr, si, mid); //left part
// mergeSort(arr, mid+1, ei); //right part
// merge(arr,si,ei,mid);
// }

// public static void merge(int arr[],int si,int ei,int mid){
// // left(0,3) =4 right(4,6) = 3 -> 6-0+1 = 7
// int temp[] = new int[ei-si+1];
// int i = si; //iterator for left part
// int j = mid+1; //iterator for right part
// int k=0; //iterator for temp arr

// while (i<=mid && j<=ei) {
// if(arr[i]<arr[j]){
// temp[k] = arr[i];
// i++;
// }
// else{
// temp[k] = arr[j];
// j++;
// }
// k++;
// }

// //left part
// while(i<=mid){
// temp[k++] = arr[i++];

// }

// //right part
// while (j<=ei) {
// temp[k++] = arr[j++];

// }
// //copy temp to original arr
// for(k=0,i=si;k<temp.length;k++,i++){
// arr[i] = temp[k];
// }
// }

// public static void main(String[] args) {
// int arr[] = {5,4,3,2,1};
// System.out.println("Before Sorting");
// printArr(arr);
// mergeSort(arr, 0, arr.length-1);
// System.out.println("After Sorting");
// printArr(arr);

// }
// }

// ------------QUICK SORT (Pivot & Partition)---------------
// Question 98: Quick Sort
// class vj{
// public static void printArr(int arr[]){
// for(int i=0;i<arr.length;i++){
// System.out.print(arr[i]+ " ");
// }
// System.out.println();
// }
// public static void quickSort(int arr[], int si,int ei){
// if(si>=ei){
// return;
// }
// // last Element
// int pivotindx = Partition(arr,si,ei);
// quickSort(arr,si,pivotindx-1); //left
// quickSort(arr,pivotindx+1,ei); //right
// }
// public static int Partition(int arr[] , int si, int ei){
// int pivot = arr[ei];
// int i = si -1; //to make place for els(less than pivot)

// for(int j=si;j<ei;j++){
// if(arr[j] <= pivot){
// i++;

// //swap
// int temp = arr[j];
// arr[j] = arr[i];
// arr[i] = temp;
// }
// }
// i++;
// int temp = pivot;
// arr[ei] = arr[i];
// arr[i] = temp;
// return i;
// }
// public static void main(String[] args) {
// int arr[] = {6,4,7,8,3,5};
// System.out.println("Before Sorting");
// printArr(arr);

// System.out.println("After Sorting");
// quickSort(arr, 0, arr.length-1);
// printArr(arr);
// }
// }

// Note: Worst case occur when pivot is always the smallest or largest element.
// \

/*
 * Queston 99: Search in Rotated Sorted Array
 * Input: Sorted,rotated array with distinct(unique) numbers (in ascending
 * order)
 * It is rotated at a pivot point. find the index of given element.
 * 
 * 4,5,6,7,0,1,2 target: 0
 * 
 * Output: 4
 */

// class Divide_N_Conquer{
// public static int search(int [] arr, int tar, int si, int ei){
// // base case
// if(si>ei){
// return -1;
// }

// //kaam
// int mid = si + (ei-si)/2; // or (si+ei)/2

// //case Found
// if (arr[mid] == tar){
// return mid;
// }

// // mid on L1
// if(arr[si] <= arr[mid]){
// //case a : search in left
// if(arr[si] <= tar && tar <= arr[mid]){
// return search(arr, tar, si, mid-1);
// }

// else{
// return search(arr, tar, mid+1, ei);
// }

// }
// //mid on L2
// else{
// if(arr[mid] <=tar && tar<= arr[ei]){
// return search(arr, tar, mid+1, ei);
// }
// else{
// return search(arr, tar, si, mid-1);
// }

// }
// }

// public static void main(String[] args) {
// int arr[] = {4,5,6,7,0,1,2};
// int target = 0;
// System.out.println(search(arr, target, 0, arr.length-1));
// }
// }

/*
 * Question 100:-
 * Apply Merge sort to sort an array of Strings.( Assume that all the characters
 * in all the Strings are in lowercase). (EASY)
 * Sample Input 1: arr = { "sun", "earth", "mars", "mercury"}
 * Sample Output 1: arr = { "earth", "mars", "mercury","sun"}
 */
// class vj{
// //function to mergesort 2 arrays
// public static String[] mergeSort(String[] arr, int lo, int hi){ //lo(low) and
// hi(high)
// if(lo==hi){
// String[] A = { arr[lo] };
// return A;
// }
// int mid = lo + (hi-lo)/2;
// String[] arr1 = mergeSort(arr, lo, mid);
// String[] arr2 = mergeSort(arr, mid+1, hi);
// String[] arr3 = merge(arr1, arr2);
// return arr3;
// }
// public static String[] merge(String[] arr1, String[] arr2){
// int m = arr1.length;
// int n = arr2.length;
// String[] arr3 = new String[ m + n];
// int idx = 0;
// int i=0, j=0;
// while(i < m && j < n){
// if(isAlphabeticallySmaller(arr1[i], arr2[j])){
// arr3[idx] = arr1[i];
// i++;
// idx++;
// }
// else{
// arr3[idx] = arr2[j];
// j++;
// idx++;
// }
// }
// while (i<m){
// arr3[idx] = arr1[i];
// i++;
// idx++;
// }
// while (j<n) {
// arr3[idx] = arr2[j];
// j++;
// idx++;

// }
// return arr3;
// }

// // return true if str1 appears before str2 in alphabetical order
// public static boolean isAlphabeticallySmaller(String str1, String str2){
// if(str1.compareTo(str2)<0){
// return true;
// }
// return false;
// }
// public static void main(String[] args) {
// String[] arr = {"sun", "earth", "mars", "mercury"};
// String[] a = mergeSort(arr, 0, arr.length-1);
// for(int i=0;i<a.length;i++){
// System.out.print(a[i] + " ");
// }
// }

// }

/*
 * 
 * Question 102 :Given an array nums of size n, return the majority element.
 * (MEDIUM)
 * The majority element is the element that appears more than ⌊n/2⌋ times.You
 * may assume that the majority element always exists in the array.
 * Sample Input 1: nums = [3,2,3]
 * Sample Output 1: 3
 * Sample Input 2: nums = [2,2,1,1,1,2,2]
 * Sample Output 2: 2
 * Constraints(extra Conditions):
 * ●n == nums.length
 * ●1 <= n <= 5 * 104
 * ●-109 <= nums[i] <= 109
 */
// --solution--
// Approach 1- Brute Force ApproachIdea :
// Count the number of times each number occurs in the array & find the largest
// count.
// Time complexity - O(n^2)
// class vj{
// public static int majorityElement(int[] nums){
// int majorityCount = nums.length/2;
// for(int i=0;i<nums.length;i++){
// int count= 0;
// for(int j=0;j<nums.length;j++){
// if(nums[j] == nums[i]){
// count +=1;
// }
// }
// if(count > majorityCount){
// return nums[i];
// }
// }
// return -1;

// }
// public static void main(String[] args) {
// int nums[] = {2,2,3,4,5,6,7,7,8,9};
// System.out.println(majorityElement(nums));
// }
// }
// ------------------------------------------------------------------
// Approach 2- Divide & ConquerIdea:
// If we know the majority element in the left and right halves of an array,we
// can determine which is the global majority element in linear time
// Time complexity - O(n*logn)

// class vj{
// private static int countInRange(int[] nums, int num, int lo, int hi){
// int count = 0;
// for(int i = lo;i<hi;i++){
// if(nums[i] == num){
// count++;
// }
// }
// return count;
// }
// private static int majorityElementRec(int[] nums, int lo, int hi){
// // base case: the only element in an array of size 1 is the majority element
// if(lo == hi){
// return nums[lo];
// }

// //recurse on left and right halves of this slice
// int mid = (hi-lo)/2 + lo;

// int left = majorityElementRec(nums, lo, hi);
// int right = majorityElementRec(nums, lo, hi);

// //if the two halves agree on the majority element, return it.
// if(left == right){
// return left;
// }
// int leftCount = countInRange(nums, left, lo, hi);
// int rightCount = countInRange(nums, right, lo, hi);

// return leftCount > rightCount ? left : right;

// }
// public static int majorityElement(int[] nums){
// return majorityElementRec(nums, 0, nums.length-1);
// }
// public static void main(String[] args) {
// int nums[] = {2,2,3,4,5,6,7,7,8,9};
// System.out.println(majorityElement(nums));
// }
// }

/*
 * Question 103 :Given an array of integers. Find the Inversion Count in the
 * array. (HARD)
 * InversionCount: For an array,inversion count indicates how far (orclose) the
 * array is from being sorted.If the array is already sorted then the inversion
 * count is 0.
 * If an array is sorted in the reverse order then the inversion count is the
 * maximum.
 * Formally, two elements a[i] and a[j] form an inversion if a[i] > a[j] and i <
 * j.
 * Sample Input 1: N = 5, arr[ ] = {2, 4, 1, 3, 5}
 * Sample Output 1: 3, because it has 3 inversions -(2, 1), (4, 1), (4, 3).
 * Sample Input 2: N = 5, arr[ ] = {2, 3, 4, 5, 6}
 * Sample Output 2: 0, because the array is already sorted
 * Sample Input 3: N = 3, arr[] = {5, 5, 5}
 * Sample Output 3: 0,
 * because all the elements of the array are the same & already in a sorted
 * manner.
 * (Hint: A sorting algorithm will be used to solvethis question.)
 * Note-This question is important.Even if you are not able to come up with the
 * approach, please understand the solution
 * 
 */
// Solution:-
// Approach 1- Brute Force ApproachIdea:
// Traverse through the array,and for every index,find the number of smaller
// elements on its right side of the array.
// This can be done using a nested loop.Sum up the counts for all indexes in the
// array and print the sum.
// ●Traverse through the array from start to end
// ●For every element,find the count of elements smaller than the current number
// up to that index using another loop.
// ●Sum up the count of inversion for every index.
// ●Print the count of inversions.

// Time complexity - O(n^2)

// class vj{
// public static int getInvCount(int arr[]){
// int n = arr.length;
// int invCount = 0;
// for(int i=0;i<n-1;i++){
// for(int j=i+1;j<n;j++){
// if(arr[i]>arr[j]){
// invCount++;
// }
// }
// }
// return invCount;
// }
// public static void main(String[] args) {
// int arr[] = {1,20,6,4,5,6};
// System.out.println("Inversion count is "+getInvCount(arr));
// }
// }

// --------------- BackTracing ---------

// // Question:- 104 change Arr

// class vj{
// public static void changeArr(int arr[], int i, int val){
// //Base Case
// if(i == arr.length){
// printArr(arr);
// return;
// }
// //recursion
// arr[i] = val;
// changeArr(arr, i+1, val+1); //Fnx call step
// arr[i] = arr[i] -2; //backtracking step

// }
// public static void printArr(int arr[]){
// for(int i=0;i<arr.length;i++){
// System.out.print(arr[i] + " ");
// }

// System.out.println();
// }
// public static void main(String[] args) {
// int arr[] = new int[5];
// changeArr(arr, 0, 1);
// printArr(arr);
// }
// }

// Question 105 :- Find subsets
// Find & print all subsets of a given string
// "abc"
// a,b,c,ab,bc,ac,abc

// class vj{
// public static void findSubsets(String str , String ans, int i){
// //base case
// if(i == str.length()){
// if(ans.length() == 0){
// System.out.println("null");
// }
// else{
// System.out.println(ans);
// }
// return;
// }
// //Yes Choice
// findSubsets(str, ans + str.charAt(i), i+1);

// //No Choice
// findSubsets(str, ans, i+1);
// }

// public static void main(String[] args) {
// String str = "abc";
// findSubsets(str, "", 0);
// }
// }

// --------Find Permutation--------
// Question 105 :- find & print all permutation of a string
// "abc"
// abc, acb, bac, bca, cab, cba

// class vj{
// public static void findPermutation(String str , String ans){
// //base case
// if(str.length()==0){
// System.out.println(ans);
// return;
// }
// //recursion
// for(int i=0;i<str.length();i++){
// char curr = str.charAt(i);
// // abcde -> "ab" + "de" = "abde"
// String newStr = str.substring(0,i) + str.substring(i+1);
// findPermutation(newStr, ans+curr);
// }
// }
// public static void main(String[] args) {
// String str = "abc";
// findPermutation(str, "");
// }
// }

// N-Queen
// place N queens on an NxN chessboard such that no 2 queens can attack each
// other

// class vj{

// /*
// * Checks if a queen can be placed at the given row and col on the board.
// * @param board - The chessboard
// * @param row - The row where queen is to be placed
// * @param col - The column where queen is to be placed
// * @return true if the queen can be placed at the given row and col, false
// otherwise
// */
// public static boolean isSafe(char board[][], int row, int col){
// // Check this row on left side
// for (int i = 0; i < col; i++) {
// if (board[row][i] == 'Q')
// return false;
// }

// // Check upper left diagonal on left side
// for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
// if (board[i][j] == 'Q')
// return false;
// }

// // Check upper side
// for (int i = row - 1; i >= 0; i--) {
// if (board[i][col] == 'Q')
// return false;
// }

// // Check upper right diagonal on right side
// for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
// if (board[i][j] == 'Q')
// return false;
// }

// // Check left side
// for (int i = row; i < board.length; i++) {
// if (board[i][col] == 'Q')
// return false;
// }

// // Check lower left diagonal on left side
// for (int i = row + 1, j = col - 1; i < board.length && j >= 0; i++, j--) {
// if (board[i][j] == 'Q')
// return false;
// }

// // Check right side
// for (int i = row; i < board.length; i++) {
// if (board[i][col] == 'Q')
// return false;
// }

// // Check lower right diagonal on right side
// for (int i = row + 1, j = col + 1; i < board.length && j < board.length; i++,
// j++) {
// if (board[i][j] == 'Q')
// return false;
// }

// return true;
// }

// public static void nQueens(char board[][], int row){
// //base
// if(row == board.length){
// printBoard(board);
// return;
// }
// // column loop
// for(int j=0;j<board.length;j++){
// if(isSafe(board,row,j)){
// board[row][j] = 'Q';
// nQueens(board, row+1); //function calll
// board[row][j] = '.'; //backtracking step
// }
// }

// }

// public static void printBoard(char board[][]){
// System.out.println("-------------------------------------");
// for(int i=0;i<board.length;i++){
// for(int j=0;j<board.length;j++){
// System.out.print(board[i][j] + " ");
// }
// System.out.println();
// }
// }

// public static void main(String[] args) {
// int n = 4;
// char board[][] = new char[n][n];

// //initialize
// for(int i=0;i<n;i++){
// for(int j =0;j<n;j++){
// board[i][j] = '-';
// }
// }
// nQueens(board , 0);
// }
// }

// -----------Grid ways ---------------
// Questions 106:-
// Find Number of ways to reach from (0,0) to (N-1,M-1) in a N x M Grid.
// Allowed moves - right or dowm

// class vj{
// public static int gridways(int i,int j, int n,int m){
// //base case
// if(i==n-1 && j==m-1){ // condition for last cell
// return 1;
// }

// else if(i==n || j==n){ // boundary cross condn
// return 0;
// }

// int w1 = gridways(i+1, j, n, m);
// int w2 = gridways(i, j+1, n, m);
// return w1+w2;
// }
// public static void main(String[] args) {
// int n=3,m=3;
// System.out.println(gridways(0,0,n,m));
// }
// }

// -----------Sudoko-------------

// // Questions 107:-
// class SudokuSolver {

// public static boolean isSafe(int[][] sudoku, int row, int col, int digit) {
// // Check column
// for (int i = 0; i < 9; i++) {
// if (sudoku[i][col] == digit) {
// return false;
// }
// }

// // Check row
// for (int j = 0; j < 9; j++) {
// if (sudoku[row][j] == digit) {
// return false;
// }
// }

// // Check grid
// int startRow = (row / 3) * 3;
// int startCol = (col / 3) * 3;
// for (int i = startRow; i < startRow + 3; i++) {
// for (int j = startCol; j < startCol + 3; j++) {
// if (sudoku[i][j] == digit) {
// return false;
// }
// }
// }
// return true;
// }

// public static boolean solveSudoku(int[][] sudoku) {
// int row = -1;
// int col = -1;
// boolean isEmpty = true;

// // Find empty cell
// for (int i = 0; i < 9; i++) {
// for (int j = 0; j < 9; j++) {
// if (sudoku[i][j] == 0) {
// row = i;
// col = j;
// isEmpty = false;
// break;
// }
// }
// if (!isEmpty) {
// break;
// }
// }

// // If no empty cell, puzzle is solved
// if (isEmpty) {
// return true;
// }

// // Try digits 1-9
// for (int num = 1; num <= 9; num++) {
// if (isSafe(sudoku, row, col, num)) {
// sudoku[row][col] = num;

// if (solveSudoku(sudoku)) {
// return true;
// }

// sudoku[row][col] = 0; // Backtrack
// }
// }
// return false;
// }

// public static void printSudoku(int[][] sudoku) {
// for (int i = 0; i < 9; i++) {
// for (int j = 0; j < 9; j++) {
// System.out.print(sudoku[i][j] + " ");
// }
// System.out.println();
// }
// }

// public static void main(String[] args) {
// int[][] sudoku = {
// {3, 0, 6, 5, 0, 8, 4, 0, 0},
// {5, 2, 0, 0, 0, 0, 0, 0, 0},
// {0, 8, 7, 0, 0, 0, 0, 3, 1},
// {0, 0, 3, 0, 1, 0, 0, 8, 0},
// {9, 0, 0, 8, 6, 3, 0, 0, 5},
// {0, 5, 0, 0, 9, 0, 6, 0, 0},
// {1, 3, 0, 0, 0, 0, 2, 5, 0},
// {0, 0, 0, 0, 0, 0, 0, 7, 4},
// {0, 0, 5, 2, 0, 6, 3, 0, 0}
// };

// if (solveSudoku(sudoku)) {
// System.out.println("Solution exists:");
// printSudoku(sudoku);
// } else {
// System.out.println("No solution exists.");
// }
// }
// }

/* 
Question 108:-
You are given a starting position for a rat which is stuck in a maze at an
initial point (0, 0) (the maze can be thought of as a 2-dimensional plane).
The maze would be given in the form of a square matrix of order N^{*}N where
the cells with value 0 represent the maze's blocked locations
while value 1 is the open/available path that the rat can take to reach its
destination.
The rat's destination is at (N-1,N-1)
Your task is to find all the possible paths that the rat can take to reach
from source to destination in the maze.
The possible directions that it can take to move in the maze are
' U^{\prime}(up) i.e. (x,y-1) , 'D'(down) i.e. (x,y+1) , 'L' (left) i.e.
(x-1,y), 'R' (right) i.e. (x+1,y).

Sample Input:
int maze[][] = { { 1, 0, 0, 0 },
{ 1, 1, 0, 1 },
{ 0, 1, 0, 0 },
{ 1, 1, 1, 1 }
};

Sample Output:
1 0 0 0
1 1 0 0
0 1 0 0
0 1 1 1

*/
// Solution 1:

// Algorithm-

// 1. Create a solution matrix, initially filled with O's.

// 2. Create a recursive function, which takes the initial matrix, output matrix and position of rat (i, j).

// 3. if the position is out of the matrix or the position is not valid then return.

// 4. Mark the position output[i][j] as 1 and check if the current position is destination or not. If destination is reached print the output matrix and return.

// 5. Recursively call for position (i+1, j) and (i, j+1).

// 6. Unmark position (i, j), i.e output[i][j] = 0.

// class vj{
//   public static void printSolution(int sol[][]){
//     for(int i=0; i<sol.length; i++){
//       for(int j=0;j<sol.length;j++){
//         System.out.print(" " + sol[i][j] + " ");
//       }
//       System.out.println();
//     }
//   }
//   public static boolean isSafe(int maze[][] , int x, int y){
// // if (x,y outside maze ) return
// return (x >= 0 && x < maze.length && y>=0 && y< maze.length && maze[x][y] == 1);

//   }

//   public static boolean solveMaze(int maze[][]){
//     int N = maze.length;
//     int sol[][] = new int[N][N];
//     if(solveMazeUtil(maze,0,0,sol)==false){
//       System.out.println("Solution doesn't exists");
//       return false;
//     }
//     printSolution(sol);
//     return true;
//   }

//   public static boolean solveMazeUtil(int maze[][],int x, int y, int sol[][]){
//     if(x==maze.length-1 && y==maze.length-1 && maze[x][y]==1){
//       sol[x][y]=1;
//       return true;

//   }

//   //check if maze[x][y] is valid
//   if(isSafe(maze,x,y)==true){
//     if(sol[x][y]==1)
//     return false;
//     sol[x][y]=1;
//     if(solveMazeUtil(maze,x+1,y,sol)==true)
//     return true;
//     if(solveMazeUtil(maze,x,y+1,sol)==true)
//     return true;
//     sol[x][y]=0;
//     return false;
//   }

//   return false;
// }
// public static void main(String[] args) {

//   int maze[][] = { { 1, 0, 0, 0 },
//   { 1, 1, 0, 1 },
//   { 0, 1, 0, 0 },
//   { 1, 1, 1, 1 },
//   { 1, 0, 0, 0 }
//   };

//   solveMaze(maze);

// }
// }

/* 
Question 109:-
Given a string containing digits from 2-9 inclusive, print all possible
letter combinations that the number could represent.
You can print the answer in any order.

A mapping of digits to letters (just like on the telephone buttons) is given
below.
Note that 1 does not map to any lefters

Sample Input 1:
digits = "23"
Sample Output 1:
"ad", "ae", "af", "bd", "be", "bf","cd", "ce", "cf"

Sample Input 2:
digits = "2"
Sample Output 2:
"a", "b", "c"

Sample Input 3:
digits = ""
Sample Output 3: ””

*/
// solution:- 
// class vj{
//   final static char[][] L={
//     { },{ },{'a' ,'b', 'c'},
//     {'d' ,'e', 'f'},
//     {'g' ,'h', 'i'},
//     {'j' ,'k', 'l'},
//     {'m' ,'n', 'o'},
//     {'p' ,'q', 'r', 's'},
//     {'t' ,'u', 'v'},
//     {'w' ,'x', 'y', 'z'}
//   };

//   public static void letterCombinations(String D){
//     int len  = D.length();
//     if(len == 0){
//       System.out.println("");
//       return;
//     }
//     bfs(0,len,new StringBuilder(),D);
//   }
//   public static void bfs(int pos,int len,StringBuilder sb,String D){
//     if(pos == len){
//       System.out.println(sb.toString());
//     }
//     else{
//       char[] letters = L[Character.getNumericValue(D.charAt(pos))];
//       for(int i=0;i<letters.length;i++){
//         bfs(pos+1,len,new StringBuilder(sb).append(letters[i]),D);
//       }
//     }
//   }
//   public static void main(String[] args) {
//     letterCombinations("2");
//   }
//   }

/* 
Question 110:-
Knight's Tour

Given a N*N board with the Knight placed on the first block of an empty
board.
Moving according to the rules of chess, knights must visit each square
exactly once.
Print the order of each cell in which they are visited.

Sample Input 1:N=8

Sample Output 1:

0 59 38 33 30 17 8 63

37 34 31 60 9 62 29 16

58 1 36 39 32 27 18 7

35 48 41 26 61 10 15 28

42 57 2 49 40 23 6 19

47 50 45 54 25 20 11 14

56 43 52 3 22 13 24 5

51 46 55 44 53 4 21 12

*/

//-----------ArrayList--------
// Add Element           O(1)
// Get Element           O(1)
// Remove Element        O(n)
// Set Element at Index  O(n)
// contain Element       O(n)

// import java.util.ArrayList;

// class vj {
//   public static void main(String[] args) {
//     ArrayList<Integer> list = new ArrayList<>();
//     ArrayList<String> list2 = new ArrayList<>();
//     ArrayList<Boolean> list3 = new ArrayList<>();
//     // Add element

//     list.add(1);
//     list.add(2);
//     list.add(3);
//     list.add(11);
//     list.add(22);
//     list.add(33);
//     System.out.println(list);

    // ----get element

    // int element = list.get(2);
    // System.out.println(element);

    // // -----remove element
    // list.remove(2);
    // System.out.println(list);

    // //------set
    // list.set(2,30);
    // System.out.println(list);

    // // --- contain
    // System.out.println(list.contains(3));

    // //--modified Array
    // list.add(2,44);
    // System.out.println(list);

    // // --reverse print    -O(n)
    // for (int i = list.size() - 1; i >= 0; i--) {
    //   System.out.print(list.get(i) + " ");
    // }
    // System.out.println();

//     ////--- find max value
//     int max = Integer.MIN_VALUE;
//     for(int i=0;i<list.size();i++){
//       //---1---
//       // if(max<list.get(i)){
//       //   max = list.get(i);
//       // }

//       //---2---
//       max = Math.max(max, list.get(i));

//     }
//     System.out.println("max element = " + max);

//   }
// }


//// swap
// import java.util.ArrayList;

// class vj {
//   public static void swap(ArrayList<Integer> list, int idx1, int idx2){
//     int temp = list.get(idx1);
//     list.set(idx1,list.get(idx2));
//     list.set(idx2,temp);
//   }
//   public static void main(String[] args) {
//     ArrayList<Integer> list = new ArrayList<>();
//     // Add element

//     list.add(1);
//     list.add(2);
//     list.add(3);
//     list.add(11);
//     list.add(22);
//     list.add(33);
  
//     int idx1 = 1, idx2 = 3;
//     System.out.println(list);
//     swap(list, idx1, idx2);
//     System.out.println(list);

//   }
// }


//--Sorting--
// import java.util.ArrayList;
// import java.util.Collections;
// class vj{
//   public static void main(String[] args) {
//     ArrayList<Integer> list = new ArrayList<>();
//     list.add(1);
//     list.add(5);
//     list.add(3);
//     list.add(2);
//     list.add(4);

//     Collections.sort(list); //ascending
//     System.out.println(list);

//     //descending
//     Collections.sort(list,Collections.reverseOrder());
// System.out.println(list);
//   }
// }


//Implement a ArrayList
import java.util.*;
class vj{
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1); list1.add(2);
        mainList.add(list1);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(3); list2.add(4);
        mainList.add(list2);

        for(int i=0;i<mainList.size();i++){
            ArrayList<Integer> currList = mainList.get(i);
            for(int j=0; j<currList.size(); j++){
                System.out.print(currList.get(j) + " ");
            }
            System.out.println();
        }
        System.out.println(mainList);

    }
}
