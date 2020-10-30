public class Strings {
    public static void main(String[] args) {

        String a = "a";
        String b = "x";

        // Use .equals() to compare Strings
        System.out.println(a.equals(b));


        // String.toUpperCase() - To upper case
        // String.toLowerCase() - To lower case
        // String.substring() - Substring
        // String.

        System.out.println(a.compareTo(b));

        String s = "Jaden";
        for (int i = 0; i < s.length(); i++) {
            System.out.println(s.substring(i, i+1));
        }

        // Find occurrences of letter in string
        String s1 = "Derek";
        String key = "e";
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            count = s1.substring(i, i+1).equals(key) ? count + 1 : count;
        }
        System.out.println(count);




    }
}
