package easy;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class JzzhuAndChildren {
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        Queue<Child> children = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            children.add(new Child(i, scanner.nextInt()));
        }

        while (children.size() != 1) {
            for (int i = 0; i < children.size(); i++) {
                Child c = children.element();
                c.value -= m;
                if (c.value > 0) {
                    children.remove();
                    children.add(c);
                } else {
                    children.remove();
                }
            }
        }

        System.out.println(children.element());
    }
}

class Child {
    int index;
    int value;
    public Child(int index, int value) {
        this.index = index;
        this.value = value;
    }

    @Override
    public String toString() {
        return this.index + "";
    }
}
