package com.company.controllers;

import com.company.models.Customer;
import com.company.models.Service;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class ControllService implements Controller {

    private ArrayList<Service> services;

    public ControllService(){
        this.services =new ArrayList<>();
        load();
    }

    @Override
    public void load(){
        try{
            File file=new File("C:\\mycode\\JavaBasics\\OOP\\Interfaces\\CarDealeship\\src\\com\\company\\resources\\services.txt");
            Scanner scanner=new Scanner(file);
            while (scanner.hasNextLine()){
                String text=scanner.nextLine();
                Service service=new Service(text);
                this.services.add(service);
            }

        }catch (Exception e){
            e.printStackTrace();
        }

    }

    @Override
    public void afisare() {
        for(Service service: services){
            System.out.println(service.toString());
        }
    }

    @Override
    public void add(Object obj) {
        Service service=(Service) obj;
        this.services.add(service);
    }

    @Override
    public int nextAvailableId() {
        if(services.size()>0){
            return services.get(services.size()-1).getServiceId()+1;
        }
        return 1;
    }

    public int pozById(int id){

        int poz=-1;

        for(int i = 0; i< services.size(); i++){
            if(services.get(i).getServiceId()==id)
                poz=i;
        }
        return poz;
    }

    @Override
    public void update(Object obj) {
        Service service = (Service) obj;
        int poz = pozById(service.getServiceId());
        if(poz>-1){
            this.services.get(poz).setServiceName(service.getServiceName());
            this.services.get(poz).setHourlyRate(service.getHourlyRate());
        }

    }

    @Override
    public void delete(int id) {
        int poz=pozById(id);
        if(poz>-1){
            this.services.remove(poz);
        }
    }
}
