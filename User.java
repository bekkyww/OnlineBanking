public class User {
    private final String name;
    private final int age;
    private double balance;

    public User(String name, int age, double balance) {
        this.name = name;
        this.age = age;
        this.balance = balance;
    }

    public String getName() { return name; }

    public int getAge() { return age; }

    public double getBalance() { return balance; }

    public void setBalance(double balance) { this.balance = balance; }
}