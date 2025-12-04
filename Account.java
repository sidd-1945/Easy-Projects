// JointAccount creates threads that operate on the same shared Account instance.
// The Account class stores the balance and synchronized methods control safe withdrawals.

class Account {
    private int balance = 100;

    public synchronized void withdraw(int amount) {
        if (balance >= amount) {
            try {
                Thread.sleep(500); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            balance -= amount;
            System.out.println(Thread.currentThread().getName() +
                    " withdrew " + amount + ", Remaining balance: " + balance);
        } else {
            System.out.println(Thread.currentThread().getName() +
                    " tried to withdraw " + amount + " but insufficient balance!");
        }
    }
    int getBalance(){
        synchronized(this){
            return balance;
        }
    }
}