package com.company.models;

public class Car implements Comparable<Car>{

    public int carId;
    public String serialNumber;
    public String make;
    public String model;
    public String color;
    public int year;
    public String carForSaleYN;


    public Car(String atribute){

        this.carId=Integer.parseInt(atribute.split(",")[0]);
        this.serialNumber=atribute.split(",")[1];
        this.make=atribute.split(",")[2];
        this.model=atribute.split(",")[3];
        this.color=atribute.split(",")[4];
        this.year=Integer.parseInt(atribute.split(",")[5]);
        this.carForSaleYN=atribute.split(",")[6];
    }

    public Car(int carId, String serialNumber, String make, String model, String color, int year, String carForSaleYN){

        this.carId=carId;
        this.serialNumber=serialNumber;
        this.make=make;
        this.model=model;
        this.color=color;
        this.year=year;
        this.carForSaleYN=carForSaleYN;
    }



    public int getCarId() {
        return carId;
    }

    public void setCarId(int carId) {
        this.carId = carId;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getCarForSaleYN() {
        return carForSaleYN;
    }

    public void setCarForSaleYN(String carForSaleYN) {
        this.carForSaleYN = carForSaleYN;
    }


    @Override
    public String toString() {
        return "Car id: "+this.carId+"\n"+
                "Serial number: "+this.serialNumber+"\n"+
                "Make: "+this.make+"\n"+
                "Model: "+this.model+"\n"+
                "Color: "+this.color+"\n"+
                "Year: "+this.year+"\n"+
                "Car for sale Y/N: "+this.carForSaleYN+"\n";
    }

    @Override
    public boolean equals(Object obj) {
        Car car=(Car) obj;
        return (this.carId==carId && this.model.equals(model));
    }

    @Override
    public int compareTo(Car car) {
        if(this.carId>carId){

            return 1;
        }else if(this.carId<carId){
            return -1;
        }
        return 0;
    }

}
