package org.example.model;

import lombok.Setter;

@Setter
public class ProductBundle extends Product implements BundleInterface {
    protected int amount;

    @Override
    public int getAmountInBundle () {
        return amount;
    }

    @Override
    public String getBasicInfo () {
        return "ProductBundle{" +
                "id=" + id +
                ", available=" + available +
                ", title='" + title + '\'' +
                ", price=" + price +
                ", amount=" + amount +
                '}';
    }
}
