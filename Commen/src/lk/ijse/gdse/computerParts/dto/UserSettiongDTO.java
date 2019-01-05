package lk.ijse.gdse.computerParts.dto;

public class UserSettiongDTO implements SuperDTO {
    String name;
    String password;
    String solt;

    public UserSettiongDTO() {
    }

    public UserSettiongDTO(String name, String password, String solt) {
        this.name = name;
        this.password = password;
        this.solt = solt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSolt() {
        return solt;
    }

    public void setSolt(String solt) {
        this.solt = solt;
    }

    @Override
    public String toString() {
        return "UserSettiongDTO{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", solt='" + solt + '\'' +
                '}';
    }
}
