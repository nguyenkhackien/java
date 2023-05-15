public abstract class Vehicle {
    protected String brand;
    protected String model;
    protected String registrationNumber;
    protected Person owner;

    /**
     * phuong thuc khoi tao.
     *
     * @param brand              brand
     * @param model              model
     * @param registrationNumber registration number
     * @param owner              owner
     */
    public Vehicle(String brand, String model, String registrationNumber, Person owner) {
        this.brand = brand;
        this.model = model;
        this.registrationNumber = registrationNumber;
        this.owner = owner;
    }

    public String getInfo() {
        return null;
    }

    public void transferOwnership(Person newOwner) {
        this.owner = newOwner;
    }

    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getRegistrationNumber() {
        return this.registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public Person getOwner() {
        return this.owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }
}
