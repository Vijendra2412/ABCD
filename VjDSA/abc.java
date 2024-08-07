import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.Collections;
import java.util.*;

// class vh{
//     public static void main(String[] args) {
        //--sum of all elment--
        // int [] x ={1,2,3,4,5};
        // int sum =0;
        // // for(int i = 0;i<x.length;i++){
        // //     sum += x[i];
        // // }
        // for(int num:x){
        //     sum+=num;
        // }
        // System.out.println(sum);

        //find max and min
        // 1.
    //     int max = x[0];
    //     int min = x[0];
    //    for(int i=0;i<x.length;i++){
    //     if(x[i]>max){
    //         max = x[i];
    //     }
    //     if(x[i]<min){
    //         min = x[i];
    //     }
    //    }
    //    System.out.println(max);
    //    System.out.println(min);

    //2.
    // int arr[]={1,2,3,4,5,6,7,8,9,10,11};
    // int max=arr[0];
    // int min=arr[0];
    // for(int i=0;i<arr.length;i++)
    // {
    //     if(arr[i]>max)
    //     {
    //         max=arr[i];

    //     }
    //     if(arr[i]<min)
    //     {
    //         min=arr[i];
    //     }
    // }
    // System.out.println(max);
    // System.out.println(min);

    //---reverse array--
    // int left = 0;
    // int right = x.length-1;
    // while (left<right) {
    //     int temp = x[left];
    //     x[left] = x[right];
    //     x[right] = temp;
    //     left++;
    //     right--;
        
    // }
    // System.out.println(Arrays.toString(x));

//find duplicate element
// 1.

// int a[] = {1,1,3,4,3};
// for(int i=0;i<x.length;i++){
//     for(int j=i+1;j<x.length;j++){
//         if(x[i]==x[j]){
//             System.out.println("its duplicate array");
//         }
//         else{
//             System.out.println("duplicate");
//         }
//     }
// // }

// 2.

// int arr[]={0,0,2,3,3,4,8,9};
// int j=1;
// for(int i=0;i<arr.length-1;i++)
// {
//     if(arr[i]!=arr[i+1])
//     {
//         arr[j]=arr[i+1];
//         j++;
//     }
//     System.out.print("Count:" + j);
// }
// for(int i=0;i<j;i++)
// {
//     System.out.println(arr[i] + " ");
// }

//----find unique element----
// Set<Integer> uniqueElement  = new HashSet<>();
// Set<Integer> duplicateElement  = new HashSet<>();

// for(int num:a){
//     if(!uniqueElement.add(num)){
//         duplicateElement.add(num);
// }
// }
// System.out.println(duplicateElement);

//-- remove duplicate elemnt--
// Set<Integer> uniqueElement = new HashSet<>();
// for(int num:a){
//     uniqueElement.add(num);
// }
// int[] uniqueArray = new int[uniqueElement.size()];
// int index = 0;
// for(int num:uniqueElement){
//     uniqueArray[index++]=num;
// }
// System.out.println(Arrays.toString(uniqueArray));

// a[0] = a[2];
// System.out.println(Arrays.toString(a));


//sort an array
// int x[] = {2,4,3,1,5};

// for(int i=0;i<x.length;i++){
//     // System.out.println();
//     for(int j=i+1;j<x.length;j++){
//         if(x[i]>x[j]){
//             int temp = x[i];
//             x[i] = x[j];
//             x[j] = temp;
//         } 
//         System.out.print(x[i]);

//     }

// Arrays.sort(x);
// System.out.println(Arrays.toString(x));


// suffle an array 
// ArrayList<Integer> arrayList = new ArrayList<>();
// arrayList.add(1);
// arrayList.add(2);
// arrayList.add(3);
// arrayList.add(4);
// Collections.shuffle(arrayList);
// System.out.println(arrayList);


// merge two array

// int arr1[] = {1,2,3,4,5};
// int arr2[] ={6,7,8,9};
// int mergearray[] = new int[arr1.length + arr2.length];

// System.arraycopy(arr1, 0, mergearray, 0, arr1.length);
// System.arraycopy(arr2, 0, mergearray, arr1.length, arr2.length);
// System.out.println(Arrays.toString(mergearray));


// copy element of one array to other array

// 1.arraycopy
// int [] sourceArr = {1,2,3,4,5};
// int [] destArr = new int[sourceArr.length];
// System.arraycopy(sourceArr, 0, destArr, 0, sourceArr.length);
// System.out.println("sourceArr: " + Arrays.toString(sourceArr));
// System.out.println("destArr: " + Arrays.toString(destArr));

//2. copyOf
// int [] sourceArr = {1,2,3,4,5};
// int [] destArr = Arrays.copyOf(sourceArr, sourceArr.length);
// System.out.println("sourceArr: " + Arrays.toString(sourceArr));
// System.out.println("destArr: " + Arrays.toString(destArr));

//3.clone()

// int [] sourceArr = {1,2,3,4,5};
// int [] destArr = sourceArr.clone();
// System.out.println("sourceArr: " + Arrays.toString(sourceArr));
// System.out.println("destArr: " + Arrays.toString(destArr));


// 4. for loop
//  int [] sourceArr = {1,2,3,4,5};
//  int [] destArr = new int[sourceArr.length];

//  for(int i=0;i<sourceArr.length;i++){
//      destArr[i] = sourceArr[i];
//  }
//  System.out.println("sourceArr: " + Arrays.toString(sourceArr));
// System.out.println("destArr: " + Arrays.toString(destArr));


// // using List
// Integer[] arr  = {1,2,3,4,5,6};
// List<Integer> list = new ArrayList<>(Arrays.asList(arr));

// Integer[] removeelemnt = {2,3,5};

// list.removeAll(Arrays.asList(removeelemnt));

// Integer[] resultarr = list.toArray(new Integer[0]);
// System.out.println(Arrays.toString(resultarr));


//---usingLoop--
// int[] arr = {1,2,3,4,5,6,7};
// int[] removeEle = {1,5,7};

// int [] tempArr = new int[arr.length];
// int count = 0;

// for(int element:arr){
//     boolean toBeRemoved  = false;
//     for(int remove:removeEle){
//         if(element == remove){
//             toBeRemoved = true;
//             break; 
//     }
// }
// if(!toBeRemoved){
//     tempArr[count++] = element;
// }
// }
// int[] result = Arrays.copyOf(tempArr, count);
// System.out.println(Arrays.toString(result)); 


// //--number rightaangle pattern
// int row  =5;
// for(int i=1;i<=row;i++){
//     for(int j=1;j<=i;j++){
//         System.out.print(j);
//     }
//     System.out.println();
// }


//--inverted number pattern
// int row =5;
// for(int i=row;i>=0;i--){
//     for(int j=1;j<=i;j++){
//         System.out.print(j);
//     }
//     System.out.println();
// }


// //prymaidNumberPattern
// int row=5;
// for(int i=1;i <=row;i++){
//     for(int j=i;j<row;j++){
//         System.out.print(" ");
//     }
//     for(int j=1;j<=i;j++){
//         System.out.print(j);
//     }
//     for(int j=i-1;j>=1;j--){
//         System.out.print(j);
//     }
//     System.out.println();
// }


// //-- hollownumberPyramid
// int rows =5;
// for(int i=1;i<=rows;i++){
//     for(int j=i;j<rows;j++){
//         System.out.print(" ");
//     }
//     for(int j=1;j<=(2*i-1);j++){
//         if(j==1||j==(2*i-1)||i==rows){
//             System.out.print(j);
//         }else{
//             System.out.print(" ");
//         }

//     }
//     System.out.println();
// }


// //-- hollowStarPyramid
// int rows =5;
// for(int i=1;i<=rows;i++){
//     for(int j=i;j<rows;j++){
//         System.out.print(" ");
//     }
//     for(int j=1;j<=(2*i-1);j++){
//         if(j==1||j==(2*i-1)||i==rows){
//             System.out.print("* ");
//         }else{
//             System.out.print(" ");
//         }

//     }
//     System.out.println();
// }

// //-- hollowNumberPyramid
// int rows = 5;
// for(int i=1;i<=rows;i++){
//     for(int j=i;j<rows;j++){
//                 System.out.print(" ");
//             }
//     for(int j=1;j<=i;j++){
//         if(j==1||j==i||i==rows){
//             System.out.print(j + " ");
//         }
//         else{
//             System.out.print("  ");
//         }
//     }
//     System.out.println();
// }
//         }
//         }



// class vijay{
//     public static void main(String[] args) {
//         double[] value = {100,150,200,250,300};
//         int periods = value.length-1;
//         double agr =calculateAGR(value, periods);
//         System.out.printf("the average growth rate (agr) is : %.2f%%%n",agr * 100);
//     }

//     public static double calculateAGR(double[] value, int periods) {
//         if(value.length<2){
//             throw new IllegalArgumentException("value array must have atleast 2 elements");
//         }
//         double startValue = value[0];
//         double endValue = value[value.length-1];
//         double agr = Math.pow(endValue/startValue,1.0/periods)-1;
//         return agr;
// }
// }

//----NivenNUmber----
// class vj{

//     public static boolean isNivenNUmber(int number){
//         int sum = sumOfDigits(number);
//         return number%sum == 0;
//     }

//     public static int sumOfDigits(int number){
//         int sum = 0;
//         while(number!=0){
//             sum += number%10;
//             number /= 10;
//         }
//         return sum;
//     }
// public static void main(String[] args) {
//     int number = 18;
//     if(isNivenNUmber(number)){
//         System.out.println(number + " is NivenNUmber");
//     }
//     else{
//         System.out.println(number + " is not NivenNUmber");
//     }

// }
// }
    

    // //----SuperSix---
    // class vj{
    //     public static boolean isSuperSix(int number){
    //         int sumOfDigit = sumDigit(number);
    //         int sumOfDigitToSixthPower = (int) Math.pow(sumOfDigit,6);
    //         return number % sumOfDigitToSixthPower ==0;
    //     }
    
    //     private static int sumDigit(int number){
    //         int sum = 0;
    //         while (number != 0) {
    //             sum+=number%10;
    //             number/=10;   
    //         }
    //         return sum;
    //     }
    
    //     public static void main(String[] args) {
    //         int number = 14641;
    //         if(isSuperSix(number)){
    //             System.out.println(number + " is SuperSix");
    //         }
    //         else{
    //             System.out.println(number + " is not SuperSix");
    //         }
    //     }
    // }



// ----DisariumNumber  ----

// class DisariumNumber  
// {  
//     //calculateLength() will count the digits present in a number  
//     public static int calculateLength(int n){  
//         int length = 0;  
//         while(n != 0){  
//             length = length + 1;  
//             n = n/10;  
//         }  
//         return length;  
//     }  
      
//     public static void main(String[] args) {  
//         int num = 175, sum = 0, rem = 0, n;  
//         int len = calculateLength(num);  
          
//         //Makes a copy of the original number num  
//         n = num;  
          
//         //Calculates the sum of digits powered with their respective position  
//         while(num > 0){  
//             rem = num%10;  
//             sum = sum + (int)Math.pow(rem,len);  
//             num = num/10;  
//             len--;  
//         }  
          
//         //Checks whether the sum is equal to the number itself  
//         if(sum == n)  
//             System.out.println(n + " is a disarium number");  
//         else  
//             System.out.println(n + " is not a disarium number");  
//     }  
// }  

  
/*
  //----DuckNumber----
//create DuckNumberExample class to check whether the given number is a Duck number or not  
 class DuckNumberExample {  
  
   // create checkNumber() method that returns true when it founds number Buzz   
   public static boolean checkNumber(int number) {  
  
      // use loop to repeat steps  
      while(number != 0) {  
  
         // check whether the last digit of the number is zero or not  
         if(number%10 == 0)  
            return true;    //return true if the number is Duck  
  
         // divide the number by 10 to remove the last digit  
         number = number / 10;  
      }  
  
      return false; //return false if the number is not Duck  
   }  
       // main() method start  
    public static void main(String args[])   
    {     
        int n1, n2;  
          
        //create scanner class object to get input from user  
        Scanner sc=new Scanner(System.in);  
          
        //show custom message  
        System.out.println("Enter first number");  
          
        //store user entered value into variable n1  
        n1 = sc.nextInt();  
          
        //show custom message  
        System.out.println("Enter second number");  
          
        //store user entered value into variable n2  
        n2 = sc.nextInt();  
          
        if (checkNumber(n1))   
            System.out.println(n1 + " is a Duck number");   
        else  
            System.out.println(n1 + " is not a Duck number");   
        if (checkNumber(n2))   
            System.out.println(n2 + " is a Duck number");   
        else  
            System.out.println(n2 + " is not a Duck number");   
    }  
}  

public class abc
{
    public static void main(String[] args)
    {
        int n=9008;
        int r=0;
        int count=0;
        while(n>0)
        {
            r=n%10;
            n=n/10;
            if(r==0)
            {
                count++;
            }
        }
        if(count>=1)
        {
            System.out.println("duck no");
        }
        else
        {
            System.out.println("not a duck no");
        }
    }
}




// FindAllDuckNumber
 
//create FindAllDuckNumber class to get all the Duck number in a given range  
class FindAllDuckNumber  
{  
    //main() method start  
    public static void main(String args[])  
    {  
        int range;  
          
        //create scanner class object  
        Scanner sc=new Scanner(System.in);  
          
        //show custom message  
        System.out.println("Enter the value of range");  
          
        //store user entered value into variable range  
        range = sc.nextInt();  
  
        for(int i = 1; i <= range; i++)  
            if(checkNumber(i)){  
                System.out.println(i + " is a Duck number");  
            }  
    }  
  
    // create checkNumber() method that returns true when it founds number Buzz   
    public static boolean checkNumber(int number) {  
  
        // use loop to repeat steps  
        while(number != 0) {  
  
            // check whether the last digit of the number is zero or not  
            if(number%10 == 0)  
                return true;    //return true if the number is Duck  
  
            // divide the number by 10 to remove the last digit  
            number = number / 10;  
        }  
  
        return false;   //return false if the number is not Duck  
   }  
}  
 */



