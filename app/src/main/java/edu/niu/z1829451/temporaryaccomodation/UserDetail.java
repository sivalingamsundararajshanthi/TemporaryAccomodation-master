package edu.niu.z1829451.temporaryaccomodation;

public class UserDetail {
    private String name;
    private String email;
    private int phoneNumber;
    private String address;
    private String desc;

    public UserDetail(String name, String email, String address, String desc) {
        this(name, email, 0, address, desc);
    }

    public UserDetail(String name, String email, int phoneNumber, String address, String desc) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.desc = desc;
    }
}
