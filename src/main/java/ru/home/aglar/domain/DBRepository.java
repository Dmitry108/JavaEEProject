package ru.home.aglar.domain;

import ru.home.aglar.model.Product;

import java.util.ArrayList;
import java.util.List;

public class DBRepository {
    public static List<Product> getAllProducts() {
        List<Product> products = new ArrayList<>();
        products.add(new Product(1, "Звездолет", 2200));
        products.add(new Product(2, "Летающая тарелка", 1200));
        products.add(new Product(3, "Реактивный самолет", 3000));
        products.add(new Product(4, "Избушка", 2500));
        products.add(new Product(5, "Ступа c метлой", 1000));
        products.add(new Product(6, "Ковер-самолет", 1200));
        products.add(new Product(7, "Аэрокар", 2900));
        products.add(new Product(8, "Воздушный шар", 200));
        products.add(new Product(9, "Ракета", 2800));
        products.add(new Product(10, "НЛО", 6666));
        return products;
    }
}