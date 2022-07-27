package com.company.models;

public class PartsUsed implements Comparable<PartsUsed> {

    public int partsUsedId;
    public int partId;
    public int serviceTicketsId;
    public int numberUsed;
    public int price;


    public PartsUsed(String atribute) {

        this.partsUsedId=Integer.parseInt(atribute.split(",")[0]);
        this.partId=Integer.parseInt(atribute.split(",")[1]);
        this.serviceTicketsId=Integer.parseInt(atribute.split(",")[2]);
        this.numberUsed=Integer.parseInt(atribute.split(",")[3]);
        this.price=Integer.parseInt(atribute.split(",")[4]);
    }

    public PartsUsed(int partsUsedId, int partId, int serviceTicketsId, int numberUsed, int price) {

        this.partsUsedId=partsUsedId;
        this.partId=partId;
        this.serviceTicketsId=serviceTicketsId;
        this.numberUsed=numberUsed;
        this.price=price;
    }


    public int getPartsUsedId() {
        return partsUsedId;
    }

    public void setPartsUsedId(int partsUsedId) {
        this.partsUsedId = partsUsedId;
    }

    public int getPartId() {
        return partId;
    }

    public void setPartId(int partId) {
        this.partId = partId;
    }

    public int getServiceTicketsId() {
        return serviceTicketsId;
    }

    public void setServiceTicketsId(int serviceTicketsId) {
        this.serviceTicketsId = serviceTicketsId;
    }

    public int getNumberUsed() {
        return numberUsed;
    }

    public void setNumberUsed(int numberUsed) {
        this.numberUsed = numberUsed;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


    @Override
    public String toString() {
        return "Parts used id: "+this.partsUsedId+"\n"+
                "Part id: "+this.partId+"\n"+
                "Service tickets id: "+this.serviceTicketsId+"\n"+
                "Number used: "+this.numberUsed+"\n"+
                "Price: "+this.price+"\n";
    }

    @Override
    public boolean equals(Object obj) {
        Car car=(Car) obj;
        return (this.partsUsedId==partsUsedId);
    }

    @Override
    public int compareTo(PartsUsed partsUsed) {
        if(this.partsUsedId>partsUsedId){

            return 1;
        }else if(this.partsUsedId<partsUsedId){
            return -1;
        }
        return 0;
    }


}
