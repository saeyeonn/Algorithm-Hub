import java.io.*;
import java.util.*;

public class Main {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int count = Integer.parseInt(br.readLine());
        HashMap<String, Integer> extensionCount = new HashMap<>();

        for (int i = 0; i < count; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken(".");
            String extension = st.nextToken(".");

            extensionCount.put(extension, extensionCount.getOrDefault(extension, 0) + 1);
        }

        List<String> sortedKeys = new ArrayList<>(extensionCount.keySet());
        Collections.sort(sortedKeys);

        for (String key : sortedKeys) {
            System.out.println(key + " " + extensionCount.get(key));
        }
    }
}
