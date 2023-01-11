package org.example;

public class Main {
    public static void main(String[] args) {
        Laptop L = new Laptop();
        L.setProduct("Laptop");
        L.setBrand("Dell");
        L.setPrice(44000.0);
        L.setColor("Silver");

        Order d = new Order();
        d.setOrderId(45578);
        d.setOrderAddress("Bangalore");
        System.out.println("Product Type:" + L.getProduct());
        System.out.println("Product Brand:" + L.getBrand());
        System.out.println("Product price:" + L.getPrice());
        System.out.println("Product color:" + L.getColor());
        System.out.println("Order Id:" + d.getOrderId());
        System.out.println("Ordered Address:" + d.getOrderAddress());
    }
}