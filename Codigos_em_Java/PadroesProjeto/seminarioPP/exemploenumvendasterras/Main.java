package exemploenumvendasterras;

import exemploenumvendasterras.model.LandData;
import exemploenumvendasterras.model.SaleData;

public class Main {
    public static void main(String[] args) {
        // Solicitar cálculos para duas regiões: NORTH e SOUTH
        // Calcular imposto de vendas em ambas as regiões
        // Venda de 1000 unidades monetárias
        System.out.println("Imposto de vendas na região NORTH: " + TaxRegion.NORTH.calculateSalesTax(new SaleData(1000f)));
        System.out.println("Imposto de vendas na região SOUTH: " + TaxRegion.SOUTH.calculateSalesTax(new SaleData(1000f)));
        // Valor da terra de 5000 unidades monetárias
        System.out.println("Imposto sobre terras na região NORTH: " + TaxRegion.NORTH.calculateLandTax(new LandData(5000f)));
        System.out.println("Imposto sobre terras na região SOUTH: " + TaxRegion.SOUTH.calculateLandTax(new LandData(5000f)));
    }
}