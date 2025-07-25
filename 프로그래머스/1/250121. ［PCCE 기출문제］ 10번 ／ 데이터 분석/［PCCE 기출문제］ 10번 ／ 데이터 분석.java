import java.util.*;
class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        List<String> columnList = new ArrayList<>(Arrays.asList("code", "date", "maximum", "remain"));
        int extIndex = columnList.indexOf(ext);
        int sortIndex = columnList.indexOf(sort_by);

        return Arrays.stream(data)
                .filter(content -> content[extIndex] < val_ext)
                .sorted(Comparator.comparingInt(c -> c[sortIndex]))
                .toArray(int[][]::new);
    }
}