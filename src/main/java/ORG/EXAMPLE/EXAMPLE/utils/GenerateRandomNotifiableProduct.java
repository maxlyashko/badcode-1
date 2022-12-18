package main.java.ORG.EXAMPLE.utils;

import main.java.ORG.EXAMPLE.model.NotifiableProduct;
import main.java.ORG.EXAMPLE.model.Product;

import java.util.Random;

public class GenerateRandomNotifiableProduct {
    public static Product generate ( Random random ) {
        NotifiableProduct product = new NotifiableProduct ( );
        product.setId ( random.nextLong ( ) );
        product.setTitle ( random.nextFloat ( ) + "" + random.nextDouble ( ) );
        product.setAvailable ( random.nextBoolean ( ) );
        product.setChannel ( random.nextBoolean ( ) + "" + random.nextDouble ( ) );
        product.setPrice ( random.nextDouble ( ) );
        return product;
    }
}
