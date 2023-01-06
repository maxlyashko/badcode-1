package org.example.utils;

import org.example.model.NotifiableProduct;
import org.example.model.ProductBundle;

import java.util.List;

public class ProductNotifier {
    public static int sendNotifications ( List<NotifiableProduct> products ) {
        int notifications = 0;
        for (NotifiableProduct product : products) {
            if (product instanceof ProductBundle) {
                continue;
            }
            //sending some notifications here
            notifications++;
        }
        return notifications;
    }
}
