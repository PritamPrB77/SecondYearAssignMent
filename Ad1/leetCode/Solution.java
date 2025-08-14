package leetCode;

import java.util.Stack;

public class Solution {

    public static String simplifyPath(String path) {

        final String[] DIRS = path.split("/");
        Stack<String> stack = new Stack<>();

        for (final String dir : DIRS) {
            if (dir.isEmpty() || dir.equals("."))
                continue;
            if (dir.equals("..")) {
                if (!stack.isEmpty())
                    stack.pop();
            } else {
                stack.push(dir);
            }
        }

        return "/" + String.join("/", stack);
    }




    public static void main(String[] args) {
        simplifyPath("/.../a/../b/c/../d/./");

    }
}

