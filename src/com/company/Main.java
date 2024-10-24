package com.company;
import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {
        // 2 personel (Worker) nesnesi oluşturalım
        Worker worker1 = new Worker();
        Worker worker2 = new Worker();

        // 1. personelin bilgilerini dolduralım
        worker1.name = "Elif Nur Korkmaz Kul";
        worker1.department = "Information Technology";
        worker1.role = "Software Qa Engineer";
        worker1.title ="Sr";
        worker1.age=30;
        worker1.experience=7;
        int prim1=worker1.primHesapla();
        System.out.println(prim1);

        // 2. personelin bilgilerini dolduralım
        worker2.name = "Elif Nur Korkmaz Kul";
        worker2.department = "Information Technology";
        worker2.role = "Software Qa Engineer";
        worker2.title ="Sr";
        worker2.age=30;
        worker2.experience=7;
        int prim2=worker2.primHesapla();
        System.out.println(prim2);

        // Personel listesini oluşturup personelleri ekleyelim
        ArrayList<Worker> elemanlar = new ArrayList<>();
        elemanlar.add(worker1);
        elemanlar.add(worker2);


        // Listedeki personellerin bilgilerini yazdıralım
        System.out.println("Personel Listesi:");
        for (Worker worker : elemanlar) {
            System.out.println("İsim: " + worker.name);
            System.out.println("Departman: " + worker.department);
            System.out.println("Rol: " + worker.role);
            System.out.println("Ünvan: " + worker.title);
            System.out.println("Yaş: " + worker.age);
            System.out.println("Tecrübe: " + worker.experience);
            System.out.println("Prim: " + worker.primHesapla());
            System.out.println("--------------");
        }


    }
}
