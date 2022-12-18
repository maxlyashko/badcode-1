package main.java.ORG.EXAMPLE.utils;

import main.java.ORG.EXAMPLE.model.NotifiableProduct;
import main.java.ORG.EXAMPLE.repository.ProductRepository;

import java.util.List;

public class FilterNotifiableProducts extends ProductRepository {
    public static List<NotifiableProduct> filterNotifiableProducts () {
        return getAll ( ).stream ( ).filter ( it -> it instanceof NotifiableProduct ).map ( it -> (NotifiableProduct) it ).toList ( );
    }
}
