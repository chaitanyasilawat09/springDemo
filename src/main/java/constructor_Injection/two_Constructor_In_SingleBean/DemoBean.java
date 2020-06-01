package constructor_Injection.two_Constructor_In_SingleBean;

public class DemoBean {

    private String message;
    private String uName,pwd;

    public DemoBean(String message) {
        this.message = message;
    }

    public DemoBean(String uName, String pwd) {
        this.uName = uName;
        this.pwd = pwd;
    }

    // define setter & getter to get particular value from object
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    @Override
    public String toString() {
        return "DemoBean{" +
                "message='" + message + '\'' +
                ", uName='" + uName + '\'' +
                ", pwd='" + pwd + '\'' +
                '}';
    }
}
