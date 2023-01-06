package org.example;

import org.example.model.NotifiableProduct;
import org.example.model.Product;
import org.example.model.ProductBundle;
import org.example.utils.ProductUtils;

import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main ( String[] args ) {
        ProductUtils utils = new ProductUtils ( );
        List<Product> products = new ArrayList<> ( );
        products.add ( utils.generateRandomProduct ( ) );
        products.add ( utils.generateRandomProduct ( ) );
        products.add ( utils.generateRandomProduct ( ) );
        products.add ( utils.generateRandomProduct ( ) );
        products.add ( utils.generateRandomProduct ( ) );
        products.add ( utils.generateRandomProduct ( ) );
        products.add ( utils.generateRandomProduct ( ) );
        products.forEach ( it -> {
            if (it instanceof ProductBundle) {
                utils.saveProductBundle ( (ProductBundle) it );
            } else if (it instanceof NotifiableProduct) {
                utils.saveNotifiableProduct ( (NotifiableProduct) it );
            }
        } );

        System.out.println ( utils.getAll ( ) );
        System.out.println ( "notifications sent: " + utils.filterNotifiableProductsAndSendNotifications ( ) );
    }
}