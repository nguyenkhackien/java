public class Person implements Comparable<Person> {
    private String name;
    private int age;
    private String address;

    /**
     * khoi tao.
     *
     * @param name    ten
     * @param age     tuoi
     * @param address diachi
     */
    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * So sanh.
     *
     * @param o person
     * @return sort
     */
    @Override
    public int compareTo(Person o) {
        if (this.name.compareTo(o.name) == 0) {
            return this.age - o.age;
        }
        return this.name.compareTo(o.name);
    }
}
