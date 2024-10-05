import java.io.*;
import java.util.*;

public class Main {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static final StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {

        StringTokenizer st = new StringTokenizer(br.readLine());

        int count = Integer.parseInt(st.nextToken());
        int index = Integer.parseInt(st.nextToken()) - 1;
        int term = index;
        ArrayList<Integer> people = new ArrayList<>();

        for (int i = 1; i <= count; i++) {
            people.add(i);
        }

        sb.append("<");
        for (int i = 0; i < count - 1; i++) {
            while (index >= people.size()) {
                index -= people.size();
            }
            sb.append(people.remove(index).toString()).append(", ");
            index += term;
        }
        sb.append(people.remove(0)).append(">");
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

}
