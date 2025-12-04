// JointAccount creates threads that operate on the same shared Account instance.
// The Account class stores the balance and synchronized methods control safe withdrawals.

class AThread extends Thread {
    public void run(){
        Thread x = Thread.currentThread();
        int i;
        for(i = 0; i < 7; i++){
            System.out.println(x.getName() + " going to withdraw...... ");
            JointAccount.x.withdraw(10);
            System.out.println();
        }
    }
}
class JointAccount {
    static Account x = new Account();
    public static void main(String[] args){
        AThread t1 = new AThread();
        AThread t2 = new AThread();
        t1.setName("Ronaldo");
        t2.setName("Messi");
        t1.start();
        t2.start();  
    }
}