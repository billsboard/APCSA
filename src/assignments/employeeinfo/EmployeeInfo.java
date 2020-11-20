package assignments.employeeinfo;


public class EmployeeInfo {

    String name;
    double wageRate = 15.0, yearsWorking = 0.0;
    int number;

    EmployeeInfo(){
        System.out.println("Casual Employee: No name or number needed");
    }

    EmployeeInfo(String name, int number){
        this.name = name;
        this.number = number;
    }

    public void setWageRate(double wageRate) {
        this.wageRate = wageRate;
    }

    public double getWageRate() {
        return wageRate;
    }

    public boolean isSeniorEmployee(){
        return yearsWorking > 10;
    }

    public double giveRaise(double raise){
        return wageRate += raise;
    }

    public double giveRaise(double raise, double yearsWorking){
        if(yearsWorking > 25){
            return wageRate += raise * 1.5;
        }
        return giveRaise(raise);
    }

    @Override
    public String toString() {
        return name == null ? "No name" : name;
    }
}
