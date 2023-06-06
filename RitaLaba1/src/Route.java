import java.io.Serializable;

public class Route implements Serializable {
    private int interval; //Поля
    private int routeNumber;

    public Route(int routeNumber, int interval) {        //Конструктор
        this.interval = interval;                       //минуты
        this.routeNumber = routeNumber;
    }
    public Route(int routeNumber){
        this.routeNumber=routeNumber;
    }

    public int getRouteNumber(){
        return this.routeNumber;
    }
    public int getInterval(int venicleCount) {
        return interval/venicleCount*3;                    //условно по умолчанию 3 средства на марштрут
    }

    public void setInterval(int interval) {
        this.interval = interval;
    }

    @Override
    public String toString() {
        return String.valueOf(routeNumber);
    }
    public String info(){
        return "Маршрут: "+this.routeNumber+"\t Интервал: "+this.interval+ " мин";
    }
}
