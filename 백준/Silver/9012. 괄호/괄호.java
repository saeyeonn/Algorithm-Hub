import java.io.*;
import java.util.*;

public class Main {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static final StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {

        int count = Integer.parseInt(br.readLine());

        for (int i = 0; i < count; i++) {
            char[] array = br.readLine().toCharArray();
            boolean flag = isFlag(array);
            if (flag) {
                sb.append("YES\n");
            } else {
                sb.append("NO\n");
            }
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    private static boolean isFlag(char[] array) {
        Stack<Character> stack = new Stack<>();
        boolean flag = true;

        for (char bracket : array) {
            if (bracket == '(') {
                stack.add(bracket);
            }
            if (bracket == ')'){
                if (stack.isEmpty()) {
                    flag = false;
                    break;
                } else {
                    stack.pop();
                }
            }
        }
        if (!stack.isEmpty()) {
            flag = false;
        }
        return flag;
    }
}