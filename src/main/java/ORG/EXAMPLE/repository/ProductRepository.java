package ORG.EXAMPLE.repository;

import ORG.EXAMPLE.model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductRepository {
    private static final Map<Long, Product> storage = new HashMap<> ( );

    public static Product save ( Product product ) {
        return storage.put ( product.getId ( ) , product );
    }

    public static List<Product> getAll () {
        return new ArrayList<> ( storage.values ( ) );
    }
}
