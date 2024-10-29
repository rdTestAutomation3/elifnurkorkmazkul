package com.company;
import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {
        // 2 personel (Worker) nesnesi oluşturalım
        Worker worker1 = new Worker();
        Worker worker2 = new Worker();
        Department worker1department= new Department();
        Department worker2department = new Department();

        // 1. personelin bilgilerini dolduralım
        worker1.name = "Elif Nur Korkmaz Kul";
        worker1.title ="Sr";
        worker1.age=30;
        worker1.experience=7;
        worker1department.department = "Information Technology";
        worker1department.role = "Software Qa Engineer";
        worker1department.officeLocation = "Ankara";
        worker1department.relatedDirectory="Customer";
        int prim1=worker1.primHesapla();
        System.out.println(prim1);

        // 2. personelin bilgilerini dolduralım
        worker2.name = "Elif Kul";
        worker2.title ="Mid";
        worker2.age=26;
        worker2.experience=3;
        worker2department.department = "Human Resources Department";
        worker2department.role = "Human Resources";
        worker2department.officeLocation = "Istanbul";
        worker2department.relatedDirectory="Corporate";
        int prim2=worker2.primHesapla();
        System.out.println(prim2);


        // Personel listesini oluşturup personelleri ekleyelim
        ArrayList<Worker> elemanlar = new ArrayList<>();
        elemanlar.add(worker1);
        elemanlar.add(worker2);

        // Department  listesini oluşturup personelleri ekleyelim
        ArrayList<Department> departments = new ArrayList<>();
        departments.add(worker1department);
        departments.add(worker2department);

        // Listedeki personellerin bilgilerini yazdıralım
        System.out.println("Personel Listesi:");
        for (Worker worker : elemanlar) {
            System.out.println("İsim: " + worker.name);
            System.out.println("Ünvan: " + worker.title);
            System.out.println("Yaş: " + worker.age);
            System.out.println("Tecrübe: " + worker.experience);
            System.out.println("Prim: " + worker.primHesapla());
            System.out.println("--------------");
        }

        // Listedeki personellerin departman bilgilerini yazdıralım
        System.out.println("Personelin Departman Listesi:");
        for (Department department : departments) {
            System.out.println("Rol: " + department.role);
            System.out.println("Department: " + department.department);
            System.out.println("Related Directory: " + department.relatedDirectory);
            System.out.println("Office Location: " + department.officeLocation);
            System.out.println("--------------");

        }

    }
}
