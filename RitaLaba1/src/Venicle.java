import java.io.Serializable;
import java.util.Objects;

public abstract class Venicle implements Serializable {
    protected boolean isWorkeble;           //Поля
    protected Route route;
    protected int sitCount;

    public Venicle(boolean isWorkeble, Route route, int sitCount) { //Конструктор с 3 параметрами
        this.isWorkeble = isWorkeble;           //Присвоение значений полей конкретного экземпляра
        this.route = route;                     //класса транспорт
        this.sitCount = sitCount;
    }

    public boolean isWorkeble() {
        return isWorkeble;
    }

    public void setWorkeble(boolean workeble) {
        if (workeble==false){
            this.route=null;
        }
        isWorkeble = workeble;
    }

    public Route getRoute() {
        return route;
    }

    public void setRoute(Route route) {
        this.route = route;
    }

    public int getSitCount() {
        return sitCount;
    }

    public void setSitCount(int sitCount) {
        this.sitCount = sitCount;
    }

    public String getType(){
        return "Это транспортный транспорт транспорта!!";
    }

    @Override
    public String toString() {
        return "состояние: "+ isWorkeble +
                ", маршрут: " + route +
                ", количество мест для пассажиров" + sitCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Venicle venicle = (Venicle) o;
        return isWorkeble == venicle.isWorkeble && sitCount == venicle.sitCount && Objects.equals(route, venicle.route);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isWorkeble, route, sitCount);
    }
}
