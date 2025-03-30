// Abstract User class
abstract class User {
    protected String NRIC;
    protected String password;
    protected int age;
    protected String maritalStatus;

    public User(String NRIC, String password, int age, String maritalStatus) {
        this.NRIC = NRIC;
        this.password = password;
        this.age = age;
        this.maritalStatus = maritalStatus;
    }

    public String getNRIC() {
        return NRIC;
    }

    public void changePassword(String newPassword) {
        this.password = newPassword;
        System.out.println("Password updated successfully.");
    }
}