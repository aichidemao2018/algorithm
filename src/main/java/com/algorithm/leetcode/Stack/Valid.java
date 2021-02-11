package com.algorithm.leetcode.Stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * 括号检测
 */
public class Valid {
    public static void main(String[] args) {
        Boolean solution = solution("()");
        System.out.println(solution);
    }

    public static Boolean solution(String s) {
        int length = s.length();
        if (length % 2 != 0) {
            return false;
        }
        Map<Character, Character> pairs = new HashMap<Character, Character>() {{
            put(')', '(');
            put(']', '[');
            put('}', '{');
        }};
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < length; i++) {
            char c = s.charAt(i);
            if (pairs.containsKey(c)) {

                if (stack.isEmpty() || stack.pop() != pairs.get(c)) {
                    return false;
                }
            } else {
                stack.push(c);
            }
        }

        return stack.isEmpty();
    }
}
