import java.util.*;
class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        ArrayList<int[]> dataList = new ArrayList<>();
        int extIndex = switch (ext) {
            case "date" -> 1;
            case "maximum" -> 2;
            case "remain" -> 3;
            default -> 0;
        };

        int sortIndex = switch (sort_by) {
            case "date" -> 1;
            case "maximum" -> 2;
            case "remain" -> 3;
            default -> 0;
        };

        for (int[] datum : data) {
            if (datum[extIndex] < val_ext) {
                dataList.add(datum);
            }
        }

        int[][] answer = new int[dataList.size()][4];
        int i = 0;
        for (int[] datum : dataList) {
            answer[i++] = datum;
        }

        System.out.println(extIndex);

        for (i = 0; i < answer.length - 1; i++) {
            System.out.println(answer[i][extIndex]);

            for (int j = i + 1; j < answer.length; j++) {
                if (answer[i][sortIndex] > answer[j][sortIndex]) {
                    int[] temp = answer[i];
                    answer[i] = answer[j];
                    answer[j] = temp;
                }
            }
        }

        return answer;
    }
}