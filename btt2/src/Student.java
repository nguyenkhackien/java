public class Student {
    // khoi tao thuoc tinh
    private String name;
    private String id;
    private String group;
    private String email;

    // tao thong tin va lay thong tin thuoc tinh
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getEmail() {
        return email;
    }
    public String getinfo() {
        return this.name + " - " + this.id + " - " + this.group + " - " + this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // tao cac phuong thuc khoi tao
    public Student() {
        this.name = "Student";
        this.id = "000";
        this.group = "K62CB";
        this.email = "uet@vnu.edu.vn";
    }

    public Student(String name, String id, String email) {
        this.name = name;
        this.id = id;
        this.email = email;
        this.group = "K62CB";
    }

    public Student(String name, String id, String group, String email) {
        this.name = name;
        this.id = id;
        this.email = email;
        this.group = group;
    }

    public Student(Student S) {
        this.name = S.getName();
        this.id = S.getId();
        this.group = S.getGroup();
        this.email = S.getEmail();
    }

}
