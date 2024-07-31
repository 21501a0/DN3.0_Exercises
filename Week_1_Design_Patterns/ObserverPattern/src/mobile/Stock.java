package mobile;


public interface Stock {
 void registerObs(Observer observer);
 void deregisterObs(Observer observer);
 void notifyObs();
}
