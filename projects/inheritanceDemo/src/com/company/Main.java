package com.company;

public class Main {
//poliformizm örneği
    public static void main(String[] args) {

        KrediUI krediUI = new KrediUI();
        krediUI.krediHesapla(new OgretmenKrediManager()); //annesi baseManager olduğu için burda ögretmeKredi kullaılabiliyor.
        krediUI.krediHesapla(new AskerKrediManager());
    }
}
