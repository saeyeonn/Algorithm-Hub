import java.util.*;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photos) {
        int[] answer = new int[photos.length];
        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < name.length; i++) {
            map.put(name[i], yearning[i]);
        }

        int index = 0;
        for (String[] photo : photos) {
            int score = 0;
            for (String who : photo) {
                if (map.containsKey(who)) {
                    score += map.get(who);
                }
            }
            answer[index++] = score;
        }

        return answer;
    }
}