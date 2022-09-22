package com.company;

public class Main {

    public static void main(String[] args) {

        String sehirYazdır  = sehirVer();
        topla(1, 2, 3, 4, 5, 6, 7);
        System.out.println(sehirYazdır);
        int toplam = topla2(5,3);
        System.out.println(toplam);
    }

    public static void ekle() {

    }

    public static void sil() {

    }

    public static void guncelle() {

    }

    public static String sehirVer(){
        String sehir = "Ankara";
        return sehir;
    }

    public static int topla(int... sayılar) {
        int toplam = 0;
        for (int sayı : sayılar) {
            toplam += sayı;
        }
        System.out.println(toplam);
        return toplam;

    }

    public static int topla2(int a, int b){

        return a+b;
    }
}
