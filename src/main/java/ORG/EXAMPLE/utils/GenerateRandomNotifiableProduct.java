package ORG.EXAMPLE.utils;

import ORG.EXAMPLE.model.NotifiableProduct;
import ORG.EXAMPLE.model.Product;

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
