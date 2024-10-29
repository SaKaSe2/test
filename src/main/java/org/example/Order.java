package org.example;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<MenuItem> items;
    private double total;

    public Order() {
        this.items = new ArrayList<>();
        this.total = 0;
    }

    public void addItem(MenuItem item) {
        items.add(item);
        calculateTotal(); // Memperbarui total setiap kali item ditambahkan
    }

    private void calculateTotal() {
        total = 0;
                for (MenuItem item : items) {
                    total += item.getPrice();
                }
    }

    public double getTotal() {
        return total;
    }

    public void printReceipt() {
        System.out.println("====== Nota Pemesanan ======");
        for (MenuItem item : items) {
            System.out.println(item.getName() + " - Rp" + item.getPrice());
        }
        System.out.println("Total: Rp" + getTotal());
    }
}
