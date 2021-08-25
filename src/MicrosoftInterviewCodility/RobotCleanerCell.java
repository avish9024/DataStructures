package MicrosoftInterviewCodility;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;

public class RobotCleanerCell {
    static class Node {
        int x;
        int y;

        public int getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }

        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Node node = (Node) o;
            return x == node.x && y == node.y;
        }

        @Override
        public int hashCode() {
            return Objects.hash(x, y);
        }
    }

    public static void main(String[] args) {
//        String R[] = {"---X--","----XX", "--X---"};
//        String R[] = {"----X--","X------", "-----X-", "-------"};
        String R[] = {"---X-",  "-X--X", "X---X", "--X--"};
        System.out.println(solution(R));

    }

    private static boolean doChangeDirection(int a[][], int x, int y) {
        int n = a.length;
        int m = a[0].length;
        if (x < 0 || x >= n || y < 0 || y >= m) {
            return true;
        } else {
            return a[x][y] == -1;
        }
    }

    public static int solution(String[] R) {
        Map<Node, Integer> map = new HashMap<>();
        Map<Node, Integer> blockMap = new HashMap<>();

        int maxCell = 0;
        int a[][] = new int[R.length][R[0].length()];

        for (int i = 0; i < R.length; ++i) {
            int m = R[i].length();
            for (int j = 0; j < m; ++j) {

                if (R[i].charAt(j) == '-') {
                    ++maxCell;
                    a[i][j] = 0;
                } else {
                    a[i][j] = -1;
                }
            }
        }

        int x = 0;
        int y = 0;
        int rstate = 1;

        System.out.println("maxCells = " + maxCell);

        int m = a[0].length - 1;
        int n = a.length;

        while (true) {
            Node newNode = new Node(x,y);
            if (map.size() == maxCell
                    || (map.containsKey(newNode) && map.get(newNode) > 2)
                    || (blockMap.containsKey(newNode) && blockMap.get(newNode) > 2)) {
                break;
            }

            if (doChangeDirection(a, x, y))
            {
                int val = blockMap.containsKey(newNode) ? blockMap.get(newNode) + 1 : 1;
                blockMap.put(newNode, val);
                switch (rstate)
                {
                    case 1:
                        rstate = 2;
                        --y;
                        x++;
                        x = x >= n? n - 1: x;
                        break;
                    case 2:
                        rstate = 3;
                        --x;
                        --y;
                        y = y < 0 ? 0: y;
                        break;
                    case 3:
                        rstate = 4;
                        ++y;
                        --x;
                        x = x < 0 ? 0 : x;
                        break;
                    case 4:
                        rstate = 1;
                        ++x;
                        ++y;
                        y = y >= m ? m - 1: y;
                        break;
                }
                //log(key + ": " + map.get(key));
            }
            else
            {
                int val = map.containsKey(newNode) ? map.get(newNode) + 1 : 1;
                map.put(newNode, val);
                switch (rstate)
                {
                    case 1:
                        ++y;
                        break;
                    case 2:
                        ++x;
                        break;
                    case 3:
                        --y;
                        break;
                    case 4:
                        --x;
                        break;
                }
                System.out.println(newNode + ": " + map.get(newNode));
            }

        }
        return map.keySet().size();
    }
}
