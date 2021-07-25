package Observer;

public class CurrentConditioonsDisplay  implements Observer,DisplayElement{
    private float temprature;
    private float humidity;
    private WheatherData1 data;

    public CurrentConditioonsDisplay(WheatherData1 fgfg) {
        this.data = fgfg;
        data.registerObserver(this);
    }

    public void update(float temp, float humidity, float pressure){
      this.temprature=temp;
     this.humidity=humidity;
     display();
    }

    @Override
    public void display() {
         System.out.println("current conditions are"+toString());
    }

    @Override
    public String toString() {
        return "CurrentConditioonsDisplay{" +
                "temprature=" + temprature +
                ", humidity=" + humidity +
                ", data=" + data +
                '}';
    }
}
