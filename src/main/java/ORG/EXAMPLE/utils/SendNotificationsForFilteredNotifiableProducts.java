package ORG.EXAMPLE.utils;

import ORG.EXAMPLE.model.NotifiableProduct;
import ORG.EXAMPLE.model.ProductBundle;

import java.util.List;

public class SendNotificationsForFilteredNotifiableProducts {
    public static int SendNotifications ( List<NotifiableProduct> products ) {
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
