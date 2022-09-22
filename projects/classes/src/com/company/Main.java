package com.company;

public class Main {

    public static void main(String[] args) {
        // reference type için örnek
        CustomerManager customerManager = new CustomerManager();
        //bellek te stack ve heap olarak ik bölüm mevcut.
        // soluk gözüken new lediğmiz alan artık heap de yer almamaktadır.
        // customerManager nesnesi heap de yer alan customerManager1 nesnesine bakmaktadır.
        // Bu nedenle garbage collector heap den customerManager ı silecektir.
        CustomerManager customerManager1 = new CustomerManager();
        customerManager = customerManager1;
        customerManager.add();
        customerManager.remove();
        customerManager.update();


        //value type için örnek

        int sayı1 = 10;
        int sayı2 = 20;
        sayı1 = 30;
        sayı2 = sayı1;
        System.out.println(sayı2); // değer tipli verilen stack de tutulur. Bu nedenle değeri değişmez.

        // reference type örnek2 -- diziler reference type dır. String ve Integerlar value (değer) type dır.

        int[] sayılar1 = new int[] {1,2,3};
        int[] sayılar2 = new int[] {3,4,5};
        sayılar2 = sayılar1;
        sayılar1[0] = 10;

        System.out.println(sayılar2[0]);
    }
}
