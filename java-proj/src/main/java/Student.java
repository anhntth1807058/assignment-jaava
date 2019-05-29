public class Student {
    private String enrollid;
    private String fullname;
    private int age;

    public Student(String id, String firstname, String lastname, String age) {
    }

    public Student(String id, String enrollid, int age) {
        this.enrollid = enrollid;
        this.fullname = fullname;
        this.age = age;
    }

    public String getEnrollid() {
        return enrollid;
    }

    public void setEnrollid(String enrollid) {
        this.enrollid = enrollid;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
