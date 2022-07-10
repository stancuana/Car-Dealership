package com.company;

public class SalesPerson {

    private int salesPersonId;
    private String firstName;
    private String lastName;



    public SalesPerson(String atribute){

        this.salesPersonId=Integer.parseInt(atribute.split(",")[0]);
        this.firstName=atribute.split(",")[1];
        this.lastName=atribute.split(",")[2];
    }

    private SalesPerson(int salesPersonId, String firstName, String lastName){

        this.salesPersonId=salesPersonId;
        this.firstName=firstName;
        this.lastName=lastName;
    }

    public int getSalesPerson() {
        return salesPersonId;
    }

    public void setSalesPerson(int salesPerson) {
        this.salesPersonId = salesPerson;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }



    @Override
    public String toString() {
        return "Sales person id: "+ this.salesPersonId +"\n"+
                "First name: " + this.firstName + "\n" +
                "Last name: " + this.lastName + "\n";
    }

    
}
