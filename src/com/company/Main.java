package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan bir sayı al
        System.out.print("Bir sayı girin: ");
        int kullaniciSayisi = scanner.nextInt();

        MuhasebeDepartmani calisan1 = new MuhasebeDepartmani(kullaniciSayisi);
        int prim = calisan1.primHesapla();
        int maas = calisan1.maasHesapla();
        int totalMaas=maas+ prim;

        System.out.println("Hesaplanan Maas: " + maas);
        System.out.println("Hesaplanan Prim: " + prim);
        System.out.println("Total Yatacak Tutar: " + totalMaas);

        scanner.close();
    }
}
