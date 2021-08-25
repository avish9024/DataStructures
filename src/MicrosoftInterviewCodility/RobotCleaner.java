package MicrosoftInterviewCodility;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;

public class RobotCleaner {
    private static final int BLOCK = -1;

    private enum RotationState {
        RIGHT, DOWN, LEFT, UP
    }

    private boolean doChangeDirection(int a[][], int x, int y) {
        int n = a.length;
        int m = a[0].length;
        if (x < 0 || x >= n || y < 0 || y >= m) {
            return true;
        } else {
            return a[x][y] == BLOCK;
        }
    }

    private String getKey(int x, int y) {
        return x + "," + y;
    }


    /*
     * right x, y++ left x, y-- up x--, y down x++, y ROTATION= right > down > left
     * > up
     */
    public int solution(String R[]) {
        Map<String, Integer> map = new HashMap<>();
        Map<String, Integer> blockMap = new HashMap<>();

        int maxCell = 0;
        int a[][] = new int[R.length][R[0].length()];

        for (int i = 0; i < R.length; ++i) {
            int m = R[i].length();
            for (int j = 0; j < m; ++j) {

                if (R[i].charAt(j) == '-') {
                    ++maxCell;
                    a[i][j] = 0;
                } else {
                    a[i][j] = BLOCK;
                }
            }
        }

        int x = 0;
        int y = 0;
        RotationState rstate = RotationState.RIGHT;

        log("maxCells = " + maxCell);

        int m = a[0].length - 1;
        int n = a.length;

        while (true) {
            String key = getKey(x, y);

            if (map.size() == maxCell
                    || (map.containsKey(key) && map.get(key) > 2)
                    || (blockMap.containsKey(key) && blockMap.get(key) > 2)) {
                break;
            }

            if (doChangeDirection(a, x, y))
            {
                int val = blockMap.containsKey(key) ? blockMap.get(key) + 1 : 1;
                blockMap.put(key, val);
                switch (rstate)
                {
                    case RIGHT:
                        rstate = RotationState.DOWN;
                        --y;
                        x++;
                        x = x >= n? n - 1: x;
                        break;
                    case DOWN:
                        rstate = RotationState.LEFT;
                        --x;
                        --y;
                        y = y < 0 ? 0: y;
                        break;
                    case LEFT:
                        rstate = RotationState.UP;
                        ++y;
                        --x;
                        x = x < 0 ? 0 : x;
                        break;
                    case UP:
                        rstate = RotationState.RIGHT;
                        ++x;
                        ++y;
                        y = y >= m ? m - 1: y;
                        break;
                }
                //log(key + ": " + map.get(key));
            }
            else
            {
                int val = map.containsKey(key) ? map.get(key) + 1 : 1;
                map.put(key, val);
                switch (rstate)
                {
                    case RIGHT:
                        ++y;
                        break;
                    case DOWN:
                        ++x;
                        break;
                    case LEFT:
                        --y;
                        break;
                    case UP:
                        --x;
                        break;
                }
                log(key + ": " + map.get(key));
            }

        }
        return map.keySet().size();
    }

    private static void log(String s)
    {
        System.out.println(s);
    }
    public static void main(String[] args) {
        //String R[] = {"---X--","----XX", "--X---"};
        String R[] = {"----X--","X------", "-----X-", "-------"};
//        String R[] = {"---X-",  "-X--X", "X---X", "--X--"};

        RobotCleaner mr = new RobotCleaner();
        System.out.println(mr.solution(R));
    }
}
