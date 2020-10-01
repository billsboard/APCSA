public class IfStatements {
    public static void main(String[] args) {
        int aaronIQ = -1;
        if(aaronIQ < 0)
            System.out.println("One line if");


        if(aaronIQ < 0){
            System.out.println("Multi-statement if");
            System.out.println("You need {} curly brackets.");
        }


        int katelynnCodingSpeed = -100000;
        if(katelynnCodingSpeed > 10)
            System.out.println("This will never print since Katelynn is bad at coding");
            System.out.println("No curly brackets, so this will print. If only applies to one line");


        // If- else if - else statements
        int kevinLiIQ = 150;
        if(kevinLiIQ < 100){
            System.out.println("Kevin Li rolled away");
        }
        else if(kevinLiIQ < 140){
            System.out.println("Kevin Li is decently smart");
        }
        else{
            System.out.println("Kevin Li is model student");
        }



        // Ifs can be nested
        int benIQ = 80;
        if(benIQ > 50){
            System.out.println("Ben isn't that dumb");
            if(benIQ < 100){
                System.out.println("Ben isn't that smart either");
            }
        }
    }
}
