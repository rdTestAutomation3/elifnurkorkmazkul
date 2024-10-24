package com.company;

public class Main {

    public static void main(String[] args) {
        Worker worker = new Worker();
        worker.name = "Elif Nur Korkmaz Kul";
        worker.department = "Information Technology";
        worker.role = "Software Qa Engineer";
        worker.title ="Sr";
        worker.age=30;
        worker.experience=7;
        int prim=worker.primHesapla();
        
        System.out.println(prim);

    }
}
