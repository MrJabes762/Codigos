class BalançoTrimestral{
  public static void main() {
    int gastosJaneiro = 15000, gastosFevereiro = 23000, gastosMarco = 17000;
    int gastosTrimestre = gastosFevereiro + gastosMarco + gastosJaneiro;
    float mediaMensal = gastosTrimestre/3;
    System.out.println(gastosTrimestre);
    System.out.println("Valor da média mensal = " + mediaMensal);
  }
}