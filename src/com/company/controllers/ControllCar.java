package com.company.controllers;

import com.company.models.Car;
import com.company.models.Service;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class ControllCar implements Controller{

    private ArrayList<Car> cars;

    public ControllCar(){
        this.cars =new ArrayList<>();
        load();
    }

    @Override
    public void load(){
        try{
            File file=new File("C:\\mycode\\JavaBasics\\OOP\\Interfaces\\CarDealeship\\src\\com\\company\\resources\\cars.txt");
            Scanner scanner=new Scanner(file);
            while (scanner.hasNextLine()){
                String text=scanner.nextLine();
                Car car=new Car(text);
                this.cars.add(car);
            }

        }catch (Exception e){
            e.printStackTrace();
        }

    }

    @Override
    public void afisare() {
        for(Car car: cars){
            System.out.println(car.toString());
        }
    }

    @Override
    public void add(Object obj) {
        Car car=(Car) obj;
        this.cars.add(car);
    }

    @Override
    public int nextAvailableId() {
        if(cars.size()>0){
            return cars.get(cars.size()-1).getCarId()+1;
        }
        return 1;
    }

    public int pozById(int id){

        int poz=-1;

        for(int i = 0; i< cars.size(); i++){
            if(cars.get(i).getCarId()==id)
                poz=i;
        }
        return poz;
    }

    @Override
    public void update(Object obj) {
        Car car = (Car) obj;
        int poz = pozById(car.getCarId());
        if(poz>-1){
            this.cars.get(poz).setModel(car.getModel());
            this.cars.get(poz).setMake(car.getMake());
            this.cars.get(poz).setColor(car.getColor());
            this.cars.get(poz).setSerialNumber(car.getSerialNumber());
            this.cars.get(poz).setCarForSaleYN(car.getCarForSaleYN());
            this.cars.get(poz).setYear(car.getYear());
        }

    }

    @Override
    public void delete(int id) {
        int poz=pozById(id);
        if(poz>-1){
            this.cars.remove(poz);
        }
    }
}
