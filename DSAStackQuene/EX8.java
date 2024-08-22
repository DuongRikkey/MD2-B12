package DSAStackQuene;

import java.util.Stack;

public class EX8 {
   public static boolean isPrime(int n) {
       if(n<=1){
           return false;
       }
       for(int i=2;i<=Math.sqrt(n);i++){
           if(n%i==0){
               return false;
           }
       }
       return true;
   }
   public static boolean isPrimeSequence(String input) {
       Stack<Character> stack = new Stack<>();
       for(char ch:input.toCharArray()){
           if(Character.isDigit(ch)){
               stack.push(ch);
           }

       }
       while(!stack.isEmpty()){
           int digit = Character.getNumericValue(stack.pop());
           if(!isPrime(digit)){
               return false;
           }
       }
       return true;
   }
    public static void main(String[] args) {
        String input = "2357"; // Chuỗi đầu vào cần kiểm tra

        if (isPrimeSequence(input)) {
            System.out.println("Chuỗi này là dãy số nguyên tố.");
        } else {
            System.out.println("Chuỗi này không phải là dãy số nguyên tố.");
        }
    }


}
