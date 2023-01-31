package easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SupercentralPoint {

    public static void main(String... args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int superCentralCounter = 0;

        List<Point> points = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            points.add(new Point(scanner.nextInt(), scanner.nextInt()));
        }

        for (int i = 0; i < points.size(); i++) {
            boolean hasRightNeighbor = false;
            boolean hasLeftNeighbor = false;
            boolean hasUppertNeighbor = false;
            boolean hasLowerNeighbor = false;

            Point currentPoint = points.get(i);

            for (int j = 0; j < points.size(); j++) {
                if (j == i) {
                    continue;
                }
                Point p = points.get(j);
                if (p.x > currentPoint.x && p.y == currentPoint.y) {
                    hasRightNeighbor = true;
                }
                if (p.x < currentPoint.x && p.y == currentPoint.y) {
                    hasLeftNeighbor = true;
                }
                if (p.x == currentPoint.x && p.y < currentPoint.y) {
                    hasLowerNeighbor = true;
                }
                if (p.x == currentPoint.x && p.y > currentPoint.y) {
                    hasUppertNeighbor = true;
                }
            }
            if (hasLeftNeighbor && hasRightNeighbor && hasLowerNeighbor && hasUppertNeighbor) {
                superCentralCounter++;
            }
        }

        System.out.println(superCentralCounter);

    }
}

class Point {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "[" + this.x + "," + this.y + "]";
    }
}
