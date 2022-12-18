package main.java.ORG.EXAMPLE.utils;

import main.java.ORG.EXAMPLE.model.NotifiableProduct;
import main.java.ORG.EXAMPLE.repository.ProductRepository;

public class SaveNotifiableProduct extends ProductRepository {
    public static void saveNotifiableProduct ( NotifiableProduct product ) {
        save ( product );
    }
}
