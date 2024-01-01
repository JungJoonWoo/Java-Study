package OOP1;

public class Account {
    int balance;

    void deposit(int amount) {
        this.balance += amount;
    }

    void withdraw(int amount) {
        if (this.balance < amount) {
            System.out.println("잔액이 부족합니다. 잔액  " + this.balance);
            return;
        }
        balance -= amount;
    }

    void showBalance(int amount) {
        System.out.println("잔액: " + this.balance);
    }
}