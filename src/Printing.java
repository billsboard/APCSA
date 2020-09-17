public class Printing {
    /* This is a class. Classes are objects, and they house all your code */

    public static void main(String[] args) {
        /* The main() method is the method that runs when you run the program. It is static */

        System.out.println("Hello world!"); // Yay...

        /*
         * System has an out attribute, which has method println.
         * Classes can have nested class inside
         */

        System.out.print("This is a print statement."); // print() does not append a newline at the end
        System.out.println("This is a println statement."); // println() adds a newline after printing
        System.out.println("This should be on a new line");

        System.out.println(); // println with no arguments just prints a newline

        /* System.out.println("Justin is "cool"."); This is a syntax error, since the quotes conflict with the string
           terminator. We should escape the quotes with a backslash (\) */

        System.out.println("\" <-- Backslash allows you to print a quote");

        // Other escape characters: \", \', \n (newline), \\ (backslash), \t (tab)
        System.out.println("A lot of escape characters: \", \', \t, \\");
        System.out.println("The escaped n character \nmeans there will be a line break");

        System.out.println();
        System.out.println(3); // Numbers work too!
        System.out.println(true); // Booleans can also be printed

        System.out.println(3 + 5); // Math can also be done
        // Java supports + (addition), - (subtraction), / (divide), * (multiply)

        System.out.println(3 / 5); // Prints zero
        /* 3 and 5 are integers, so Java will return an integer. Therefore it ignores numbers after the decimal
         * point and just prints out the whole number portion
         */

        System.out.println(3.0 / 5.0); // By feeding in decimals, we can force the answer to be a decimal

        //The order of operations still matters
        System.out.println(3 + 5 * 2); // 13, not 16

        System.out.println();

        System.out.println("Hello " + "world"); // You can use + for words to concat strings together

        // Combining words with numbers
        System.out.println("Edison" + 123 + 456);
        System.out.println(123 + 456 + "Edison");
        /* Until Java sees a string, it treats everything like numbers. Hence it first did 123 + 456
         * then appended the string
         */

        // To solve this we can use quotes or brackets
        System.out.println(123 + (456 + "Edison"));
        System.out.println("Edison" + (123 + 456));
        System.out.println("123" + "456" + "Edison");

        // Or we can use String.valueOf(), which returns the string value.
        System.out.println(String.valueOf(123) + String.valueOf(456) + "Edison");

        // Note that since * and / are ahead in the order of operations, they will be calculated first before concating
        System.out.println("Edison" + 123 * 456);
    }

}
