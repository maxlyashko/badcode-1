package main.java.ORG.EXAMPLE.utils;

import main.java.ORG.EXAMPLE.model.ProductBundle;
import main.java.ORG.EXAMPLE.repository.ProductRepository;

public class SaveProductBundle extends ProductRepository {
    public static void saveProductBundle ( ProductBundle product ) {
        save ( product );
    }
}
