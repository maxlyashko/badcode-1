package org.example.utils;

import org.example.model.NotifiableProduct;

import java.util.List;

public class ProductNotifier {
    public static int sendNotifications ( List<NotifiableProduct> products ) {
        int notifications = 0;
        for (NotifiableProduct product : products) {
            notifications++;
        }
        return notifications;
    }
}
