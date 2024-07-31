package mobile;

public class ObserverPatternTest {
 public static void main(String[] args) {
     StockMarket stockMarket = new StockMarket();

     MobileApp mobileApp = new MobileApp();
     WebApp webApp = new WebApp();

     stockMarket.registerObs(mobileApp);
     stockMarket.registerObs(webApp);

     stockMarket.setStockPrice(148.13);
     System.out.println();

     stockMarket.setStockPrice(148.20);
 }
}
