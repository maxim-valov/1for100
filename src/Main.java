public class Main {
    public static void main(String[] args) {
        int account = 100;
        int transfer = 1000;
        int bid = 1;
        int bonus;
        if (transfer >= 1000) {
            bonus = transfer / 100 * bid;
        } else {
            bonus = 0;
        }
        int balance = account + transfer + bonus;
        System.out.println("Balance: " + balance);
        System.out.println("Bonus: " + bonus);
    }
}
