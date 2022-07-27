package com.company.models;

public class Mechanic extends SalesPerson {

    public Mechanic(String atribute){

        super(atribute);
    }

    public Mechanic(int personId, String firstName, String lastName){

        super(personId,firstName,lastName);
    }


    @Override
    public String toString() {
        return super.toString();
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
