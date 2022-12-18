package main.java.ORG.EXAMPLE.utils;

import main.java.ORG.EXAMPLE.model.NotifiableProduct;
import main.java.ORG.EXAMPLE.model.Product;
import main.java.ORG.EXAMPLE.model.ProductBundle;

import java.util.List;
import java.util.Random;

public class ProductUtils {

    public void saveNotifiableProduct ( NotifiableProduct product ) {
        SaveNotifiableProduct.save ( product );
    }

    public void saveProductBundle ( ProductBundle product ) {
        SaveProductBundle.save ( product );
    }

    public int filterNotifiableProductsAndSendNotifications () {
        return SendNotificationsForFilteredNotifiableProducts.SendNotifications ( FilterNotifiableProducts.filterNotifiableProducts ( ) );
    }

    public List<Product> getAll () {
        return GetAllProducts.getAll ( );
    }

    public Product generateRandomProduct () {
        Random random = new Random ( );
        if (random.nextBoolean ( )) {
            return GenerateRandomProductBundle.generate ( random );
        } else {
            return GenerateRandomNotifiableProduct.generate ( random );
        }
    }
}