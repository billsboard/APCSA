public class NestedFor {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(i + " and " + j);
            }
        }

        System.out.println();
        // Exercise: Times table
        for (int i = 1; i <= 12; i++) {
            for (int j = 1; j <= 12; j++) {
                System.out.print(i * j + " ");
            }
            System.out.println();
        }

        System.out.println();
        // Exercise: Print a pattern
        for (int i = 5; i > 0; i--) {
            for (int j = 0; j < i; j++) {
               System.out.print("x");
            }
            System.out.println();
        }

    }
}
