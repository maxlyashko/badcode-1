package ORG.EXAMPLE.utils;

import ORG.EXAMPLE.model.NotifiableProduct;
import ORG.EXAMPLE.repository.ProductRepository;

public class SaveNotifiableProduct extends ProductRepository {
    public static void saveNotifiableProduct ( NotifiableProduct product ) {
        save ( product );
    }
}
