//1.
// class reverseString{

//   public static String reverse(String input){
//     if(input == null || input.isEmpty()){
//     return input;
//     }

//   char[] charArray  = input.toCharArray();
//   int left = 0;
//   int right  = charArray.length-1;
//   while(left<right){
//     char temp = charArray[left];
//     charArray[left]=charArray[right];
//     charArray[right] = temp;
//     left++;
//     right--;
//   }
// return new String(charArray);
// }
// public static void main(String[] args) {
//   String originalString = "hello vj";
//   String reversedString = reverse(originalString);
//   System.out.println(" original  " + originalString);
//   System.out.println(" reversed  " + reversedString);
// }
// }

//2.
//  class StringManioulation{
// public static String replaceMwithN(String input) {
//   return input.replace('m', 'n');
// }
// public static void main(String[] args) {
//   System.out.println(replaceMwithN("mjemdra"));
// }

// }

//3
// class Swap{
//   public static String swapFirstAndLast(String input){
//     if(input == null || input.length() <2){
//       return input;
//     }

//     char[] charArray = input.toCharArray();
//     char temp = charArray[0];
//     charArray[0] = charArray[charArray.length-1];
//     charArray[charArray.length-1] = temp;
//     return new String(charArray);

//   }
//   public static void main(String[] args) {
//     System.out.println(swapFirstAndLast("vijendra"));
//   }
// }

//4
// class changeCase {
//   public static String alternateWord(String input){
//     if(input ==null || input.isEmpty()){
//       return input;
//     }
//     String[] words = input.split(" ");
//     for(int i=0;i<words.length;i++){
//       if(i%2 ==1){
//         words[i] = words[i].toUpperCase();
//       }
//       else{
//         words[i] = words[i].toLowerCase();
//       }
//     }
//     return String.join(" ", words);
//   }
//   public static void main(String[] args) {
//     System.out.println(alternateWord("VIJENDRA"));
//   }
// }

// class matchingWord{
// public static boolean doesWordExist(String input, String wordToFind){
//   if(input == null ||input.isEmpty() || wordToFind ==null || wordToFind.isEmpty()){
//     return false;
//   }
//   String[] words = input.split(" ");
//   for(String x : words){
// if(x.equals(wordToFind)){
//   return true;
// }
//   }
//   return false;
// }
// public static void main(String[] args) {
// System.out.println(doesWordExist("its vj class", "vj"));
// }
// }