package com.company;
import java.util.ArrayList;
public class Main{

    public static void main(String[] args) {
	String [] kelimeler={"tekrar","eden","kelimeler","yada","harfler","girmeliyiz","boylece","yeni","cumle","yada","cumleler","olusabilsin"};

        System.out.println("Tekrar eden harf içeren kelimeler:");
        ArrayList<String> tekrarliKelimeler = new ArrayList<>();
        for (String word : kelimeler) {
            if (harfTekrarEdiyorMu(word)) {
                tekrarliKelimeler.add(word); // Tekrar eden kelimeyi ekle
            }
        }
        // Tekrar eden kelimeleri ekrana yazdır
        System.out.println(tekrarliKelimeler);
        String yeniKelime = yeniKelimeUret(tekrarliKelimeler);
        System.out.println("Yeni Kelime: " + yeniKelime);


    }

    public static boolean harfTekrarEdiyorMu(String Word){
        char[] word = Word.toCharArray();

        for(int i =0;i< word.length;i++){
            for (int j =i+1;j<word.length;j++)
            {
                if(word[i]==word[j]) {

                    return true;// Tekrar eden harf var
                }
            }

        }
        return false;
    }

    public static String yeniKelimeUret(ArrayList<String>  tekrarliKelimeler){
        StringBuilder yeniKelimeler = new StringBuilder();
        for(String kelime :tekrarliKelimeler){

        if (kelime.length()>=3){ //tekrarli harf iceren en kucuk kelime 3 harfli oldugu varsayildi

            yeniKelimeler.append(kelime.substring(0,3));
        }
        else {
            yeniKelimeler.append(kelime);
        }


        }
        return yeniKelimeler.toString();

    }
}
