// // Write a function called middle that takes an array and returns a new array that contains all but the first and last elements.
// import java.util.Arrays;
//  class exercise {
//     public static int[] middle(int[] arr){
// if(arr.length<3){
//     return new int[0];
// }else{
//     return Arrays.copyOfRange(arr,1,arr.length-1);
// }
//     }
//     public static void main(String[] args) {
//         int[] arr = {1,2,3,4,5};
//         int [] result =middle(arr);
//         System.out.println(Arrays.toString(result));
//     }
// }


// Given 2D array calculate the sum of diagonal elements.

// class Exercise {
//     public static int sumDiagonalElements(int[][] array) {
//         int sum = 0;
//         int numRows = array.length;
 
//         for (int i = 0; i < numRows; i++) {
//             sum += array[i][i];
//         }
 
//         return sum;
//     }
//     public static void main(String[] args) {
//         int[][] array = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
//         System.out.println(sumDiagonalElements(array));
//     }
// }


// Given an array, write a function to get first, second best scores from the array and return it in new array.Array may contain duplicates.

// import java.util.Arrays;
// import java.util.Collections;

// class Exercise {
//     public static int[] findTopTwoScores(int[] array){
//         int firstHighest = Integer.MIN_VALUE;
//         int secondHighest = Integer.MIN_VALUE;
//         for(int score : array){
//             if(score > firstHighest){
//                 secondHighest = firstHighest;
//                 firstHighest = score;
            
//             }else if(score > secondHighest){
//                 secondHighest = score;
//             }

//         }
//         return new int[]{firstHighest,secondHighest};
//     }

//     public static void main(String[] args) {
//         int [] array = {1,2,3,4,5,6,7,8,9,4};
//         int [] result = findTopTwoScores(array);
//         System.out.println(Arrays.toString(result));
//     }
// }

// Write Java function called findMissingNumberInArray that takes an integer array containing n-1 unique elements from a range of 1 to n, 
// with one missing number, and returns the missing number.

class Exercise{
    public static int findMissingNumberInArray(int[] array){
        int n = array.length + 1;
        int expectedSum = (n*(n+1))/2;
        int actualSum = 0;

        for(int number : array){
            actualSum += number;
        }
        return expectedSum - actualSum;
    }
    public static void main(String[] args) {
        int [] array = {1,2,3,4,5,6,7,8,9,4};
        int result = findMissingNumberInArray(array);
        System.out.println(result);
        
    }
}




















