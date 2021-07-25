package Observer;

public class StatisticsDisplay implements Observer,DisplayElement
{
    private float temprature;
    private float humidity;
    private float pressure;
    private WheatherData1 data;

    public StatisticsDisplay(WheatherData1 data) {
        this.data=data;
        data.registerObserver(this);
    }

    public void update(float temp, float humidity, float pressure){

        this.temprature=temp;
        this.humidity=humidity;
        this.pressure=pressure;
        display();
    }

    @Override
    public void display() {

       System.out.println("In Statstical display");

    }
}
