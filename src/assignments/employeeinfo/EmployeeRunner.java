package assignments.employeeinfo;

public class EmployeeRunner {
    public static void main(String[] args) {

        // Test default values
        EmployeeInfo temp = new EmployeeInfo();
        System.out.println(temp.getWageRate());
        System.out.println(temp.yearsWorking);
        System.out.println(temp.isSeniorEmployee());
        System.out.println(temp.name);
        System.out.println(temp);

        // Test simple one
        EmployeeInfo ben = new EmployeeInfo("Ben", 12);
        System.out.println(ben.name);
        System.out.println(ben); // ToString override works
        System.out.println(ben.getWageRate());
        System.out.println(ben.giveRaise(12.2));
        System.out.println(ben.getWageRate());

        // Test another case
        EmployeeInfo rose = new EmployeeInfo("Rose", 1);
        System.out.println(rose.getWageRate());
        rose.setWageRate(10);
        System.out.println(rose.getWageRate());
        System.out.println(rose);

        // Test last case
        EmployeeInfo renee = new EmployeeInfo("Renee", Byte.MAX_VALUE);
        System.out.println(renee.yearsWorking);
        System.out.println(renee.isSeniorEmployee());
        System.out.println(renee.getWageRate());
        System.out.println(renee.giveRaise(10, 5)); // Override works
        System.out.println(renee.getWageRate());
        renee.yearsWorking = 10.01;
        System.out.println(renee.isSeniorEmployee());
        System.out.println(renee.giveRaise(10, 10.01));
        System.out.println(renee.getWageRate());
    }
}
