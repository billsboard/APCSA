package assignments;

public class NestedFor {
    public static void main(String[] args) {
        //Question 1
        System.out.println("Question 1");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print(i + "" + j + " ");
            }
            System.out.println();
        }
        System.out.println();

        //Question 2
        System.out.println("Question 2");
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print(i * j + " ");
            }
            System.out.println();
        }
        System.out.println();

        //Question 3
        System.out.println("Question 3");
        System.out.println("Part A");
        for (int i = 7; i >= 1; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("Part B");
        for (int i = 1; i <= 7; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("Part C");
        for (int i = 7; i >= 1; i--) {
            for (int j = 7 - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int j = i; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("Part D");
        for (int i = 1; i <= 7; i+=2) {
            for (int j = 0; j < (7 - i) / 2; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 5; i >= 1; i -= 2) {
            for (int j = 0; j < (7 - i) / 2; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }
}
