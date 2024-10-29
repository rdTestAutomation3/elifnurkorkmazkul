package com.company;

public class MuhasebeDepartmani {

        int calistigiGun=0;
        int prim=0;
        int maas=0;
        int gunlukUcret = 100;

        // Constructor
        public  MuhasebeDepartmani (int calisilanGun){
            this.calistigiGun=calisilanGun;
        }
        // Maas hesaplama metodu
        int maasHesapla(){
            maas = calistigiGun * gunlukUcret;
            return maas;
        }
        // Prim hesaplama metodu
        int primHesapla(){
            prim= (calistigiGun >= 25) ? (calistigiGun - 25) * 1000 : 0;
            return prim;
        }

        public int getCalistigiGun() {
            return calistigiGun;
        }
    }










