package assignments.casinoplayer;

public class CasinoPlayer {

    String name;
    int bal = 0;

    CasinoPlayer(){
    }

    CasinoPlayer(String name){
        this.name = name;
    }

    CasinoPlayer(String name, int bal) {
        this.name = name;
        this.bal = bal;
    }

    CasinoPlayer(int bal) {
        this.bal = bal;
    }

    public int getBal() {
        return bal;
    }

    public void setBal(int bal) {
        this.bal = bal;
    }

    void deposit(int x){
        bal += Math.max(x, 0);
    }

    void withdraw(int x){
        if(checkBal(x)) bal -= x;
    }

    private boolean checkBal(int x){
        return bal - x < 0 && x > 0;
    }

    /* The checkBet functions were specified to be private, but a bet function was never told to be created */
    private boolean checkBet(int b){
        return checkBal(b);
    }

    private boolean checkBet(int b, int max){
        return checkBet(b) && b <= max;
    }

    static int randNum(int low, int high){
        return (int) (Math.random() * (high - low)) + low;
    }
}
