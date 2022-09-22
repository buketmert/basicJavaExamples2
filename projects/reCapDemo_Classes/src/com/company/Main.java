package com.company;

public class Main {

    public static void main(String[] args) {

        DortIslem dortIslem= new DortIslem();
        int bolum = dortIslem.Bol(16,4);
        int toplam = dortIslem.Topla(3,3);
        int sonuc = dortIslem.Carp(3,3);
        int carpım = dortIslem.Cıkar(3,3);

        System.out.println(bolum + " " + toplam + " " +sonuc + " " + carpım);
    }
}
