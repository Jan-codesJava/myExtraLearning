package booking.entity;

public class Client {

    private String name;
    private String surName;
    private String phoneNumber;
    private String email;
    private Bill bill;

    public Client(String name, String surName, String phoneNumber,
                  String email, Bill bill){
        this.name = name;
        this.surName = surName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.bill = bill;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
