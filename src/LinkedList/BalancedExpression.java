package LinkedList;

import java.util.Scanner;

public class BalancedExpression {

    private static boolean isBalanced(String expression) {
        char nextChar, openDelimiter;
        Stack<Character> stack = new Stack<>();

        boolean isBalanced=true;
        while(isBalanced && expression.length()>0){
            nextChar = expression.charAt(0);
            switch (nextChar) {
                case '(':
                case '[':
                case '{':{
                    stack.push(nextChar);
                    break;
                }
                case ')':
                case ']':
                case '}':{
                    if(stack.isEmpty()) isBalanced = false;
                    else{
                        openDelimiter = stack.pop();
                        if(openDelimiter == '(' && nextChar != ')' ||
                                openDelimiter == '[' && nextChar != ']'||
                                openDelimiter == '{' && nextChar != '}'
                            ) isBalanced = false;
                    }
                }
            }
            if(expression.length() > 1) expression = expression.substring(1);
            else expression = "";
        }
        if (!stack.isEmpty()) isBalanced = false;
        return isBalanced;
    }

    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        System.out.println("enter your expression");
        String inputString = input.nextLine();
        System.out.println(inputString+ " balanced? ......"+isBalanced(inputString));
    }
}
