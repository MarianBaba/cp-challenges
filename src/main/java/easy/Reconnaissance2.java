package easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Reconnaissance2 {
    public static void main(String... args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        List<Node> soldiers = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            soldiers.add(new Node(scan.nextInt(), i + 1));
        }

        for (int i = 0; i < n; i++) {
            Node s = soldiers.get(i);
            if (i == 0) {
                s.setNext(soldiers.get(i + 1));
            } else if (i == (n - 1)) {
                s.setNext(soldiers.get(0));
            } else {
                s.setNext(soldiers.get(i + 1));
            }
        }

        int min = Integer.MAX_VALUE;
        Node candidate = soldiers.get(0);
        for (int i = 0; i < n; i++) {
            if (Math.abs(soldiers.get(i).height - soldiers.get(i).next.height) < min) {
                min = Math.abs(soldiers.get(i).height - soldiers.get(i).next.height);
                candidate = soldiers.get(i);
            }
        }

        System.out.println(candidate.index + " " + candidate.next.index);

        /* int[] soldiers = new int[n];

        for (int i = 0; i < n; i++) {
            soldiers[i] = scan.nextInt();
        }

        int x = 1, j = 2;
        int min = Math.abs(soldiers[0] - soldiers[1]);

        for (int i = 0; i < n; i++) {
            if (i == 0) {
                int abs = Math.abs(soldiers[0] - soldiers[n - 1]);
                if (abs < min) {
                    min = abs;
                    x = 1;
                    j = n;
                }
            } else if (i == n - 1) {
                int abs = Math.abs(soldiers[n - 1] - soldiers[0]);
                if (abs < min) {
                    min = abs;
                    x = n;
                    j = 1;
                }

                int abs2 = Math.abs(soldiers[n - 1] - soldiers[n - 2]);
                if (abs2 < min) {
                    min = abs2;
                    x = n;
                    j = n - 1;
                }
            } else {
                int abs = Math.abs(soldiers[i] - soldiers[i + 1]);
                if (abs < min) {
                    min = abs;
                    x = i + 1;
                    j = i + 2;
                }

                int abs2 = Math.abs(soldiers[i] - soldiers[i - 1]);
                if (abs2 < min) {
                    min = abs2;
                    x = i + 1;
                    j = i;
                }
            }
        }
        System.out.println(x + " " + j);
         */
    }
}

class Node {
    Node next;
    Node previous;
    int height;
    int index;

    public Node(int height, int index) {
        this.height = height;
        this.index = index;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}