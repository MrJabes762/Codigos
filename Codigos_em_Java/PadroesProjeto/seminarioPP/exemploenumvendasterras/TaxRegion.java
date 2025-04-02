package exemploenumvendasterras;

import exemploenumvendasterras.model.LandData;
import exemploenumvendasterras.model.SaleData;

public enum TaxRegion implements TaxCalculation {
    NORTH(5.0f, 10.0f), 
    NORTH_EAST(6.0f, 12.0f), 
    SOUTH(4.0f, 8.0f), 
    EAST(7.0f, 14.0f), 
    WEST(5.5f, 11.0f), 
    CENTRAL(6.5f, 13.0f);

    private final float salesTaxRate;
    private final float landTaxRate;

    TaxRegion(float salesTaxRate, float landTaxRate) {
        this.salesTaxRate = salesTaxRate;
        this.landTaxRate = landTaxRate;
    }

    @Override
    public float calculateSalesTax(SaleData data) {
        return data.getSaleAmount() * salesTaxRate / 100;
    }

    @Override
    public float calculateLandTax(LandData data) {
        return data.getLandValue() * landTaxRate / 100;
    }
}
