package com.company.models;

public class Service implements Comparable<Service>{

    public int serviceId;
    public String serviceName;
    public int hourlyRate;


    public Service(String atribute){

        this.serviceId=Integer.parseInt(atribute.split(",")[0]);
        this.serviceName=atribute.split(",")[1];
        this.hourlyRate=Integer.parseInt(atribute.split(",")[2]);
    }

    public Service(int serviceId, String serviceName, int hourlyRate){

        this.serviceId=serviceId;
        this.serviceName=serviceName;
        this.hourlyRate=hourlyRate;
    }



    public int getServiceId() {
        return serviceId;
    }

    public void setServiceId(int serviceId) {
        this.serviceId = serviceId;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public int getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(int hourlyRate) {
        this.hourlyRate = hourlyRate;
    }



    @Override
    public String toString() {
        return "Service id: "+this.serviceId+"\n"+
                "Service name: "+this.serviceName+"\n"+
                "Hourly rate: "+this.hourlyRate+"\n";
    }

    @Override
    public boolean equals(Object obj) {
        Service service=(Service) obj;
        return (this.serviceId==serviceId && this.serviceName.equals(serviceName));
    }

    @Override
    public int compareTo(Service service) {
       if(this.serviceId>serviceId){

           return 1;
       }else if(this.serviceId<serviceId){
           return -1;
       }
       return 0;
    }
}
