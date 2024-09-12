package org.example;

public class Main {
    public static void main(String[] args)
    {
        // LESSONS 1 !!
        System.out.println("Hello World!");

        // variable definition
        String ortaMetin = "İlginizi Çekebilir";
        String altMetin = "Vade Süresi";

        System.out.println(ortaMetin);

        int vade = 12;

        double dolarDun = 18.14;
        double dolarBugun = 18.10;

        boolean dolarDustuMu = false;

        String okYonu = "down.svg";

        if (dolarBugun < dolarDun) {
            okYonu = "down.svg";
            System.out.println(okYonu);
        } else if (dolarBugun > dolarDun) {
            okYonu = "down.svg";
            System.out.println(okYonu);
        }
        else {
            okYonu = "up.svg";
            System.out.println(okYonu);
        }

        String[] krediler = {"Hızlı Kredi", "Maaşını Halkbankta","Mutlu Emekli"};

        System.out.println(krediler[0]);
        System.out.println(krediler[1]);
        System.out.println(krediler[2]);

        for (int i = 0; i < krediler.length; i++) {
            System.out.println(krediler[i]);
        }

        // LESSONS 2 !!!
                  // set value
        Product product1 = new Product();
        product1.setName("Kahve Makinesi");
        product1.setUnitPrice(7500);
        product1.setDiscount(3);
        product1.setUnitStock(3);
        product1.setImageUrl("ll.jpg");

        Product product2 = new Product();
        product2.setName("Kahve Makinesi");
        product2.setUnitPrice(7500);
        product2.setDiscount(3);
        product2.setUnitStock(3);
        product2.setImageUrl("ll.jpg");

        Product product3 = new Product();
        product3.setName("Kahve Makinesi");
        product2.setUnitPrice(7500);
        product3.setDiscount(3);
        product3.setUnitStock(3);
        product3.setImageUrl("ll.jpg");

        Product[] products = {product1, product2, product3};

        IndividualCustomer individualCustomer = new IndividualCustomer();


    }
}
