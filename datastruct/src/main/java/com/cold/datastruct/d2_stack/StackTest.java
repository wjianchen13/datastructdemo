package com.cold.datastruct.d2_stack;

import java.util.Stack;

public class StackTest {

    public static void main(String[] args) {
//        testStack();

        System.out.println("===============> ()[]{}: " + isValid("()[]{}"));
        System.out.println("===============> ([)]: " + isValid("([)]"));
    }

    /**
     * stack 基本操作
     */
    private static void testStack() {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(1);
        stack.push(4);
        stack.push(5);
        System.out.println("===============> stack: " + stack);
        stack.pop();
        System.out.println("===============> stack: " + stack);
        System.out.println("===============> top: " + stack.peek());
        System.out.println("===============> stack isEmpty: " + stack.isEmpty());
        System.out.println("===============> stack search 1: " + stack.search(1));
    }

    /**
     * 给定一个字符串，只包含(, [, {, ), ], }，判定字符串中的括号匹配是否合法。
     * 如"( )”，“( ) [ ] { }"是合法的
     * 如“( ]”，"( [ ) ]” 是非法的
     */
    public static boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();
        for(int i = 0 ; i < s.length() ; i ++){
            char c = s.charAt(i);
            if(c == '(' || c == '[' || c == '{')
                stack.push(c);
            else{
                if(stack.isEmpty())
                    return false;

                char topChar = stack.pop();
                if(c == ')' && topChar != '(')
                    return false;
                if(c == ']' && topChar != '[')
                    return false;
                if(c == '}' && topChar != '{')
                    return false;
            }
        }
        return stack.isEmpty();
    }
}
