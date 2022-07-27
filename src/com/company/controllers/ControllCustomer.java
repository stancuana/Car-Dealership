package com.company.controllers;

import com.company.models.Customer;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class ControllCustomer implements Controller{

    private ArrayList<Customer> customers;

    public ControllCustomer(){

        this.customers =new ArrayList<>();
        load();
    }

    @Override
    public void load(){

        try{

            File file=new File("C:\\mycode\\JavaBasics\\OOP\\Interfaces\\CarDealeship\\src\\com\\company\\resources\\customers.txt");
            Scanner scanner=new Scanner(file);

            while (scanner.hasNextLine()){

                String text=scanner.nextLine();
                Customer agenda=new Customer(text);

                this.customers.add(agenda);
            }

        }catch (Exception e){
            e.printStackTrace();
        }

    }

    @Override
    public void afisare() {
        for(Customer customer: customers){
            System.out.println(customer.toString());
        }
    }

    @Override
    public void add(Object obj) {
        Customer customer=(Customer) obj;
        this.customers.add(customer);
    }

    @Override
    public int nextAvailableId() {
        if(customers.size()>0){
            return customers.get(customers.size()-1).getPersonId()+1;
        }
        return 1;
    }

    public int pozById(int id){

        int poz=-1;

        for(int i = 0; i< customers.size(); i++){
            if(customers.get(i).getPersonId()==id)
                poz=i;
        }
        return poz;
    }

    @Override
    public void update(Object obj) {

        Customer customer = (Customer) obj;

        int poz = pozById(customer.getPersonId());
        if(poz>-1){
            this.customers.get(poz).setFirstName(customer.getFirstName());
            this.customers.get(poz).setLastName(customer.getLastName());
            this.customers.get(poz).setAddress(customer.getAddress());
            this.customers.get(poz).setCity(customer.getCity());
            this.customers.get(poz).setState(customer.getState());
            this.customers.get(poz).setPostalCode(customer.getPostalCode());
            this.customers.get(poz).setPhoneNumber(customer.getPhoneNumber());
            this.customers.get(poz).setCountry(customer.getCountry());

        }

    }

    @Override
    public void delete(int id) {
        int poz=pozById(id);
        if(poz>-1){
            this.customers.remove(poz);
        }
    }

}
