package com.company.models;

public class SalesPerson implements Comparable<SalesPerson> {

    private int personId;
    private String firstName;
    private String lastName;



    public SalesPerson(String atribute){

        this.personId=Integer.parseInt(atribute.split(",")[0]);
        this.firstName=atribute.split(",")[1];
        this.lastName=atribute.split(",")[2];
    }

    public SalesPerson(int personId, String firstName, String lastName){

        this.personId=personId;
        this.firstName=firstName;
        this.lastName=lastName;
    }

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
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
        return "Sales person id: "+ this.personId +"\n"+
                "First name: " + this.firstName + "\n" +
                "Last name: " + this.lastName + "\n";
    }

    @Override
    public boolean equals(Object obj) {
        SalesPerson salesPerson=(SalesPerson) obj;
        return (this.firstName.equals(salesPerson.firstName) && this.lastName.equals(salesPerson.lastName));
    }

    @Override
    public int compareTo(SalesPerson salesPerson) {
        if(this.firstName.compareTo(salesPerson.firstName)>0){
            return 1;
        }else if(this.firstName.compareTo(salesPerson.firstName)<0){
            return -1;
        }
        return 0;
    }
}
