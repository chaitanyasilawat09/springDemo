package annotation.required_annotation;

public class Information {

    private int eno;
    private String address;
    private String qualification;

    public void setEno(int eno) {
        this.eno = eno;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    @Override
    public String toString() {
        return "Information{" +
                "eno=" + eno +
                ", address='" + address + '\'' +
                ", qualification='" + qualification + '\'' +
                '}';
    }
}
