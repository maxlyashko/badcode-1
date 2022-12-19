package ORG.EXAMPLE.utils;

import ORG.EXAMPLE.model.ProductBundle;
import ORG.EXAMPLE.repository.ProductRepository;

public class SaveProductBundle extends ProductRepository {
    public static void saveProductBundle ( ProductBundle product ) {
        save ( product );
    }
}
