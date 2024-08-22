package DSAStackQuene;

import java.util.Stack;

public class EX5 {
    public static int findMaxElement(int[] array){
        Stack<Integer> stack = new Stack<Integer>();
        for (int element : array) {
            if(stack.isEmpty()||element>stack.peek()){
                stack.push(element);
            }
            else {
                stack.pop();
                stack.push(element);
            }
        }
        return stack.peek();

    }
    public static void main(String[] args) {
        int[] array = {3, 5, 7, 2, 8, 10, 1, 4};

        int maxElement = findMaxElement(array);

        System.out.println("Phần tử lớn nhất trong mảng là: " + maxElement);
    }

}
