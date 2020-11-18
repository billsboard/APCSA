package assignments.compscistudents;

public class Runner {
    public static void main(String[] args) {
        APCompSciClass aaronL = new APCompSciClass("Aaron", false, 99);
        System.out.println(aaronL);
        aaronL.badStudent();
        System.out.println("Aaron's mark: " + aaronL.getMark());
        aaronL.setMark(90);
        System.out.println("Aaron's mark: " + aaronL.getMark());

        APCompSciClass rose = new APCompSciClass("Rose", true, 45);
        System.out.println("Rose's mark: " + rose.getMark());
        rose.passStudent();
        System.out.println("Rose's mark: " + rose.getMark());

        APCompSciClass ben = new APCompSciClass("Ben", false, 95);
        System.out.println("Ben plays games: " + ben.isPlaysGamesInClass());
        ben.setPlaysGamesInClass(true);
        ben.forgiveStudent();
        ben.setMark(99);
        ben.forgiveStudent();

        APCompSciClass aaronB = new APCompSciClass();
        System.out.println(aaronB);
        aaronB.setFirstName("Aaron");
        System.out.println(aaronB.getFirstName());
        aaronB.randomFail(32);

        APCompSciClass cole = new APCompSciClass("Cole", false, 100);
        cole.randomFail(31);
    }
}
