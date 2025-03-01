package ch11.sec06;

public class Account {
    private long balance;
    public Account() { }
    public long getBalance() {
        return balance;
    }
    public void deposit(int money) {
        balance += money;
    }
    public void withdraw(int money) throws InsufficientException {
        if(balance < money) {
//            해당 생성자 내에서 Exception의 생성자로 메시지를 전달함
            throw new InsufficientException("잔고 부족: "+(money-balance)+" 모자람");
        }
        balance -= money;
    }
}
