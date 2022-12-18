package main.java.ORG.EXAMPLE.utils;

import main.java.ORG.EXAMPLE.model.Product;
import main.java.ORG.EXAMPLE.model.ProductBundle;

import java.util.Random;

public class GenerateRandomProductBundle {
    public static Product generate ( Random random ) {
        ProductBundle productBundle = new ProductBundle ( );
        productBundle.setAmount ( random.nextInt ( 15 ) );
        productBundle.setAvailable ( random.nextBoolean ( ) );
        productBundle.setChannel ( random.nextBoolean ( ) + "" + random.nextDouble ( ) );
        productBundle.setPrice ( random.nextDouble ( ) );
        productBundle.setId ( random.nextLong ( ) );
        productBundle.setTitle ( random.nextFloat ( ) + "" + random.nextDouble ( ) );
        return productBundle;
    }
}
