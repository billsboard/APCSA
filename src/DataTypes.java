public class DataTypes {
    public static void main(String[] args) {

        // Primitive data
        // Single memory space, single value
        int i = 0; // Stores an integer from -2^31 to 2^31-1
        double d = 0.5; // Stores a decimal
        boolean b = true; // Can be true or false
        long l = 1000000000000L; // Stores an integer from -2^63 to 2^63-1 (It is longer)


        // = assigns a value to a variable
        // == checks for equality

        int a = 1; // Set a to 1;
        a = 10; // a is now 10;
        a = a + 10; // Add 10 to a (which makes it 20)

        a++; // Return the value of a, and then increment a by one
        ++a; // First increment a by one, then return a

        a--; // Return the value of a, then decrement a by one
        --a; // Decrement a by one, then return a

        a += 10; // This is the same as doing a = a + 10
        a -= 10; // a = a - 10
        a *= 10; // a = a * 10
        a /= 10; // a = a / 10


        // Note, keep in mind that integers have a max and minimum value

        /*
        In java, memory is allocated for integers, and each integer is given 32 bits. Therefore, you cannot
        exceed those limits. The Integer class has these values built in
         */

        System.out.println(Integer.MIN_VALUE); // Lowest possible int

        System.out.println(Integer.MAX_VALUE); // Highest possible int

        // Note, exceeding either end of the range will cause the int to roll over

        System.out.println(Integer.MAX_VALUE + 1); // Positive overflow
        System.out.println(Integer.MIN_VALUE - 1); // Negative overflow



        System.out.println();

        // The "final" keyword prevents a variable from being reassigned
        final double gravity = -9.8;

        // gravity = 5; This would cause an error


        // Casting allows you to change between types
        int zoey = 5;
        double bill = 2.5;

        // Doubles may be assigned integer values, but the reverse is not true

        bill = zoey; // Bill is set to 5.0
        //zoey = bill; Invalid. Bill is of type double, which cannot be assigned to int

        // We can "cast" Bill to integer
        zoey = (int) bill; // Valid. the (int) forces Bill to return and integer


        // Note, casting truncates the value, not round
        bill = 3.9999;
        zoey = (int) bill;
        System.out.println(zoey); // Returns 3, not 4



        int arthur = 0;
        double ben  = 4.5;
        double michael = 2.3;

        // arthur = ben; Not allowed, this will give an error.
        // arthur = ben / michael; Still not allowed, since dividing by double returns a double
        System.out.println(ben / michael);

        arthur = (int) ben / (int) michael; // Cast both Ben and Michael to integers, then do integer division with truncate
        System.out.println(arthur);

        arthur = (int)(ben / michael); // This divides 4.5 by 2.3, then truncates the answer
        arthur = (int) ben / (int) michael; // This truncates 4.5 to 4 first, 2.3 to 2 and then does the integer division 4/2
    }
}
