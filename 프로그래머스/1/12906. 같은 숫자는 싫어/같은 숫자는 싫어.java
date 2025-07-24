import java.util.*;

public class Solution {
    public ArrayList<Integer> solution(int []arr) {

        ArrayList<Integer> answer = new ArrayList<>();
        int index = 0;

        answer.add(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if (answer.get(index) != arr[i]) {
                answer.add(arr[i]);
                if (index < answer.size() - 1) {
                    index++;
                }
            }
        }

        return answer;
    }
}