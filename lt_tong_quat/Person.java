public class Person implements Comparable<Person> {
    private String name;
    private int age;
    private String address;

    /**
     * khoi tao.
     *
     * @param name    name
     * @param age     age
     * @param address address
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


    @Override
    public int compareTo(Person person) {
        if (this.name.compareTo(person.name) == 0) {
            return this.age - person.age;
        }
        return this.name.compareTo(person.name);
    }
}
