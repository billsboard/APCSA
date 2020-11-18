package assignments.compscistudents;

public class APCompSciClass {
    String firstName;
    boolean playsGamesInClass;
    double mark;

    APCompSciClass(){
        System.out.println("No name entered");
    }

    APCompSciClass(String firstName, boolean playsGamesInClass, double mark){
        this.firstName = firstName;
        this.playsGamesInClass = playsGamesInClass;
        this.mark = mark;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public boolean isPlaysGamesInClass() {
        return playsGamesInClass;
    }

    public void setPlaysGamesInClass(boolean playsGamesInClass) {
        this.playsGamesInClass = playsGamesInClass;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    void badStudent(){
        System.out.println(playsGamesInClass ? "This is a bad student" : "This is a student");
    }

    boolean forgiveStudent(){
        if(mark >= 99 && playsGamesInClass){
            System.out.println("Let student play");
            return true;
        }
        else{
            System.out.println("Yell at student");
            return false;
        }
    }

    String randomFail(int studentNumber){
        return (studentNumber & 1) == 0 ? "No Fail" : "Fail";
    }

    void passStudent(){
        this.setMark(Math.max(mark, 50));
    }

    @Override
    public String toString(){
        return this.firstName;
    }
}
