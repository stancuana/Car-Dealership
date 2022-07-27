package com.company.views;

import com.company.controllers.ControllCustomer;

import java.util.Scanner;

public class ViewLoginCustomer {

    public Scanner scanner;
    public ControllCustomer controllCustomer;


    public ViewLoginCustomer(){

        this.scanner=new Scanner(System.in);
        this.controllCustomer=new ControllCustomer();
    }

    public void meniu(){
        System.out.println("Pentru a va loga apasati tasta 1");
        System.out.println("Pentru a va crea un cont apasati tasta 2");
    }

    public void play(){
        boolean running=true;

        while(running==true){

            meniu();

            int alegere=Integer.parseInt(scanner.nextLine());

            switch (alegere){
                case 1:logare();
                    break;

                default: meniu();
            }
        }
    }

    public void logare(){

        System.out.println("Introduceti numele: ");
        String nume=scanner.nextLine();

        System.out.println("Introduceti prenumele: ");
        String prenume=scanner.nextLine();



    }
}
