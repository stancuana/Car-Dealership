package com.company.models;

public class Customer extends SalesPerson {

    private String phoneNumber;
    private String address;
    private String city;
    private String state;
    private String country;
    private String postalCode;


    public Customer(String atribute){

        super(atribute);
        this.phoneNumber=atribute.split(",")[0];
        this.address=atribute.split(",")[1];
        this.city=atribute.split(",")[2];
        this.state=atribute.split(",")[3];
        this.country=atribute.split(",")[4];
        this.postalCode=atribute.split(",")[5];
    }

    public Customer(int personId, String firstName, String lastName,String phoneNumber, String address, String city, String state, String country, String postalCode){
        super(personId,firstName,lastName);
        this.phoneNumber=phoneNumber;
        this.address=address;
        this.city=city;
        this.state=state;
        this.country=country;
        this.postalCode=postalCode;
    }


    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }


    @Override
    public String toString() {
        return super.toString()+
                "Phone number: "+this.phoneNumber+"\n"+
                "Address: "+this.address+"\n"+
                "City: "+this.city+"\n"+
                "State: "+this.state+"\n"+
                "Country: "+this.country+"\n"+
                "Postal code: "+this.postalCode+"\n";
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int compareTo(SalesPerson salesPerson) {
        return super.compareTo(salesPerson);
    }
}
