package Observer;

import java.util.ArrayList;
import java.util.List;

public class WheatherData1 implements Subject {

    private List<Observer> observers;
    private float temprature;
    private float humidity;
    private float pressure;

    public WheatherData1() {
        observers=new ArrayList<Observer>();
    }

    public void setMeasurments(float temprature,float humidity,float pressure){
        this.temprature=temprature;
        this.humidity=humidity;
        this.pressure=pressure;
        measurementChanged();
    }


    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
      observers.remove(o);
    }

    @Override
    public void notifyObservers() {

        for(Observer ob: observers){
            ob.update(temprature,humidity,pressure);
        }
    }

    public void measurementChanged(){
     notifyObservers();


    }


}
