
//Observer pattern is a one to many relationship between a set of objects .When the state of one object chnages
// ,all of its dependents are notified .
package Observer;

public class WeatherData {

   // CurrentConditioonsDisplay currentConditioonsDisplay=new CurrentConditioonsDisplay();
    ForecastDisplay forecastDisplay=new ForecastDisplay();
    //StatisticsDisplay statisticsDisplay=new StatisticsDisplay();

    public Float getTemprature(){

        return 0.00F;
    }

    public Float getHumidity(){
        return 0.00F;
    }
    public Float getPressure(){
        return 0.00F;
    }

    public void measurementChanged(){

        float temp= getTemprature();
        float humidity=getHumidity();
        float pressure=getPressure();

       //currentConditioonsDisplay.update(temp,humidity,pressure);
        forecastDisplay.update(temp,humidity,pressure);
       // statisticsDisplay.update(temp,humidity,pressure);


    }


}
