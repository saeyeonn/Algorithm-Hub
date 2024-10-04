import java.io.*;
import java.util.*;

public class Main {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static final StringBuilder sb = new StringBuilder();
    private static final Stack<Integer> stack = new Stack<>() {};

    public static void main(String[] args) throws IOException {

        int value, count = Integer.parseInt(br.readLine());

        for (int i = 0; i < count; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            switch (st.nextToken()) {
                case "push":
                    value = Integer.parseInt(st.nextToken());
                    stack.add(value);
                    break;
                case "pop":
                    if (stack.isEmpty()) {
                        sb.append(-1).append('\n');
                    } else {
                        sb.append(stack.pop()).append('\n');
                    }
                    break;
                case "size":
                    sb.append(stack.size()).append('\n');
                    break;
                case "empty":
                    if (stack.isEmpty()) {
                        sb.append(1).append('\n');
                    } else {
                        sb.append(0).append('\n');
                    }
                    break;
                case "top":
                    if (stack.isEmpty()) {
                        sb.append(-1).append('\n');
                    } else {
                        sb.append(stack.lastElement()).append('\n');
                    }
                    break;
            }
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
