package abstractclassExamples;

public abstract class Company {

    private String name;
    private int code;
    private Address address;


    public Company(String name, int code, Address address) {
        this.name = name;
        this.code = code;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }


    //assignment
    //write a method to print all the datamembers values. using single inheritance


}
