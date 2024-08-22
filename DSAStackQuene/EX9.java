package DSAStackQuene;

import java.util.Stack;

public class EX9 {
    public static void main(String[] args) {
        int decimalNumber = 111; // Số thập phân cần chuyển đổi
        Stack<Integer> stack = new Stack<>();

        // Bước 1: Chia liên tục số thập phân cho 2 và đưa phần dư vào Stack
        while (decimalNumber > 0) {
            int remainder = decimalNumber % 2;
            stack.push(remainder);
            decimalNumber = decimalNumber / 2;
        }

        // Bước 2: Đọc các phần dư từ Stack và nối lại để tạo thành chuỗi nhị phân
        StringBuilder binaryNumber = new StringBuilder();
        while (!stack.isEmpty()) {
            binaryNumber.append(stack.pop());
        }

        // Kết quả chuyển đổi
        System.out.println("Số nhị phân: " + binaryNumber.toString());
    }
}
