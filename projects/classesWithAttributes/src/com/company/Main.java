package com.company;

public class Main {

    public static void main(String[] args) {
        Product product = new Product();
        /*   product.name = "Laptop";
        product.description = "14 inc 256ram içermektedir.";
        product.price = 3500;
        product.stockAmount= 15;*/

        product.setId(1500);
        product.setName("Laptop");
        product.setDescription(" ");
        product.setPrice(3500);
        product.setStockAmount(15);
        product.getKod();
        System.out.println(product.getKod());


        ProductManagement productManagement = new ProductManagement();
        productManagement.Add(product);
    }
}
