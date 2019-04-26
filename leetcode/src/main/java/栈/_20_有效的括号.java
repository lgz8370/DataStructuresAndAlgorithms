package 栈;

import java.util.HashMap;
import java.util.Stack;

/**
 * @author LuGuoZheng
 * @date 2019/4/23 15:11
 * @Version 3.0
 * @description https://leetcode-cn.com/problems/valid-parentheses/
 */
public class _20_有效的括号 {

    public static boolean isValid(String s) {
        char[] chars = s.toCharArray();
        HashMap<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put(']', '[');
        map.put('}', '{');
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if (map.containsKey(c)) {
                Character character =  stack.isEmpty() ? '#' : stack.pop();
                if (map.get(c) != character){
                    return false;
                }
            }else {
                stack.push(c);
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isValid("({)}[]"));
    }
}