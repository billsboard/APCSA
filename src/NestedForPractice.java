public class NestedForPractice {
    public static void main(String[] args) {
        /* Exercise 1 - Print out:
        1 1 1 1 1
        2 2 2 2
        3 3 3
        4 4
        5 */
        for (int i = 5; i >= 1; i--) {
            for (int j = 0; j < i ; j++) {
                System.out.print(6 - i + " ");
            }
            System.out.println();
        }
        System.out.println();

        /* Exercise 2 - Print out:
        * 5! = 5 x 4 x 3 x 2 x 1
        * 4! = 4 x 3 x 2 x 1
        * etc...
        * */
        for (int i = 5; i > 0; i--) {
            System.out.print(i + "! = " + i);
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(" x " + j);
            }
            System.out.println();
        }
        System.out.println();

        /* Exercise 3 - Print out:
        xaaaa
        xxaaa
        xxxaa
        xxxxa
        xxxxx */
        for (int i = 1; i <= 5; i++) {
            StringBuilder sb = new StringBuilder("aaaaa");
            for (int j = 0; j < i; j++) {
                sb.setCharAt(j, 'x');
            }
            System.out.println(sb.toString());
        }
        System.out.println();

    }
}
