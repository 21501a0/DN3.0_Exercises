package mobile;

import java.util.ArrayList;
import java.util.List;

public class StockMarket implements Stock {
 private List<Observer> obs;
 private double stPrice;

 public StockMarket() {
     obs = new ArrayList<>();
 }

 public void setStockPrice(double price) {
     this.stPrice = price;
     notifyObs();
 }

 @Override
 public void registerObs(Observer obs) {
     obs.add(obs);
 }

 @Override
 public void deregisterObs(Observer obs) {
     obs.remove(obs);
 }

 @Override
 public void notifyObs() {
     for (Observer obs : observers) {
         obs.update(stPrice);
     }
 }
}

