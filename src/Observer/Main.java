package Observer;

public class Main {

    public static void main(String args[]){
        WheatherData1  wd=new WheatherData1();

        CurrentConditioonsDisplay currentDispaly=new CurrentConditioonsDisplay(wd);


        wd.setMeasurments(80,60,55);
        StatisticsDisplay statsDisplay=new StatisticsDisplay(wd);
        wd.setMeasurments(82,70,29.2f);
    }
}
