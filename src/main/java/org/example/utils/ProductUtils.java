package org.example.utils;

import org.example.model.NotifiableProduct;
import org.example.model.Product;
import org.example.model.ProductBundle;
import org.example.repository.ProductRepository;

import java.util.List;
import java.util.Random;

public class ProductUtils {
    private static final ProductRepository productRepository = new ProductRepository ( );

    public List<NotifiableProduct> filterNotifiableProducts (List<Product> products) {
        return products.stream ( ).filter ( it -> it instanceof NotifiableProduct ).map ( it -> (NotifiableProduct) it ).toList ( );
    }

    public void saveNotifiableProduct ( NotifiableProduct product ) {
        productRepository.save ( product );
    }

    public void saveProductBundle ( ProductBundle product ) {
        productRepository.save ( product );
    }

    public List<Product> getAll () {
        return productRepository.getAll ( );
    }

    public Product generateRandomProduct () {
        Random random = new Random ( );
        if (random.nextBoolean ( ) ) {
            return ProductGenerator.generateProductBundle ( );
        } else {
            return ProductGenerator.generateNotifiableProduct ( );
        }
    }
}
