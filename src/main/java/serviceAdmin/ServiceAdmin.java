package serviceAdmin;

public class ServiceAdmin {
    private String username;
    private String psw;

    public ServiceAdmin(String username, String psw) {
        this.username = username;
        this.psw = psw;
    }

    public String getUsername() {
        return username;
    }

    public String getPsw() {
        return psw;
    }
}
