package DSAStackQuene;

import java.util.Scanner;
import java.util.Stack;

public class EX1 {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Mời bạn nhập số lượng từ");
        int numberWords=Integer.parseInt(sc.nextLine());
        for (int i = 0; i < numberWords; i++) {
            System.out.println("Mời bạn nhập từ thứ"+(i+1));
            String word = sc.nextLine();
            stack.push(word);
        }
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}
