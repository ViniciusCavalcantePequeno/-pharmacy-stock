package DAO;

public class Password {

    private String password;

    public Password validatePassword(String password) {
        if (password.length() > 5 && password.length() < 50){
            password = this.password;
        }
        if (password.length() < 5 && password.length() > 50) {
            throw new 
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}