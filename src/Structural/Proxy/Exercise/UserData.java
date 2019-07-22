package Structural.Proxy.Exercise;

public class UserData {
    private String name;
    private String lastName;
    private int age;
    private String address;
    
    public UserData(String name, String lastName, int age, String address) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.address = address;
    }
    
    public String getName() {
        return name;
    }
    
    public String getLastName() {
        return lastName;
    }
    
    public int getAge() {
        return age;
    }
    
    public String getAddress() {
        return address;
    }
    
    @Override
    public String toString() {
        return "UserData { " +
                "name='" + name + '\''
                + ", lastName='" + lastName + '\''
                + ", age=" + age
                + ", address='" + address + '\''
                + "}\n";
    }
}
