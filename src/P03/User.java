package P03;

public class User {

    private int id=1;
    private String userName;
    private String password;
    private boolean active=true;
    private boolean signedIn=false;

    public User(){}

    public User(int id, String userName, String password, boolean active, boolean signedIn) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.active = active;
        this.signedIn = signedIn;
    }

    public int getId() {
        return id;
    }


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (password.length()<=6){
            System.out.println("Sifreniz 6 karakterden kucuk olamaz");
        }

    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public boolean isSignedIn() {
        return signedIn;
    }


}