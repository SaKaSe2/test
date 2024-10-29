package org.example;

public class Main {
    public static void main(String[] args) {
        Order order = new Order();

        MenuItem nasiGoreng = new MenuItem("Nasi Goreng", 25000);
        MenuItem mieGoreng = new MenuItem("Mie Goreng", 22000);
        MenuItem tehManis = new MenuItem("Teh Manis", 5000);

        order.addItem(nasiGoreng);
        order.addItem(mieGoreng);
        order.addItem(tehManis);

        order.printReceipt();
    }
}
