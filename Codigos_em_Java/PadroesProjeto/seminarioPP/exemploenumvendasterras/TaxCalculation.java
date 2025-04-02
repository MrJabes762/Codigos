package exemploenumvendasterras;

import exemploenumvendasterras.model.LandData;
import exemploenumvendasterras.model.SaleData;

public interface TaxCalculation {
    float calculateSalesTax(SaleData data);
    float calculateLandTax(LandData data);
}