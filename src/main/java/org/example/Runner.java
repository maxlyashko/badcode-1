package org.example;

import org.example.model.Product;
import org.example.repository.ProductRepository;
import org.example.utils.ProductNotifier;
import org.example.utils.ProductUtils;

import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main ( String[] args ) {
        ProductRepository productRepository = new ProductRepository ( );
        ProductUtils utils = new ProductUtils ( );
        List<Product> products = new ArrayList<> ( );
        products.add ( utils.generateRandomProduct ( ) );
        products.add ( utils.generateRandomProduct ( ) );
        products.add ( utils.generateRandomProduct ( ) );
        products.add ( utils.generateRandomProduct ( ) );
        products.add ( utils.generateRandomProduct ( ) );
        products.add ( utils.generateRandomProduct ( ) );
        products.add ( utils.generateRandomProduct ( ) );
        products.forEach ( productRepository::save );

        System.out.println ( utils.getAll ( ) );
        System.out.println ( "notifications sent: " + ProductNotifier.sendNotifications ( utils.filterNotifiableProducts ( products ) ) );
    }
}