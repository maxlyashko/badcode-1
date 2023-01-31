package org.example.utils;

import org.example.model.NotifiableProduct;
import org.example.model.Product;
import org.example.model.ProductBundle;

import java.util.Random;

public class ProductGenerator {
    private static final Random random = new Random ( );

    public static Product generateNotifiableProduct () {
        NotifiableProduct product = new NotifiableProduct ( );
        product.setId ( random.nextLong ( ) );
        product.setTitle ( random.nextFloat ( ) + "" + random.nextDouble ( ) );
        product.setAvailable ( random.nextBoolean ( ) );
        product.setChannel ( random.nextBoolean ( ) + "" + random.nextDouble ( ) );
        product.setPrice ( random.nextDouble ( ) );
        return product;
    }

    public static Product generateProductBundle () {
        ProductBundle productBundle = new ProductBundle ( );
        productBundle.setAmount ( random.nextInt ( 15 ) );
        productBundle.setAvailable ( random.nextBoolean ( ) );
        productBundle.setPrice ( random.nextDouble ( ) );
        productBundle.setId ( random.nextLong ( ) );
        productBundle.setTitle ( random.nextFloat ( ) + "" + random.nextDouble ( ) );
        return productBundle;
    }
}
