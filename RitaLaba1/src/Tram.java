import java.util.Objects;

public class Tram extends Venicle{
    private int batteryCharge; //Поля
    public Tram(boolean isWorkeble, Route route, int sitCount) { //Конструктор
        super(isWorkeble, route, sitCount);
    }

    public int getBatteryCharge() {
        this.batteryCharge--;
        return batteryCharge;
    }

    public void setBatteryCharge(int batteryCharge) {
        this.batteryCharge = batteryCharge;
    }

    public String getType(){
        return " трамвай";
    }

    @Override
    public String toString() {
        return "Трамвай: " +
                "исправен: " + isWorkeble +
                ", на маршруте: " + route +
                ", количество мест для пассажиров: " + sitCount +
                ", заряд аккумулятора: " + batteryCharge +
                "%";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Tram tram = (Tram) o;
        return batteryCharge == tram.batteryCharge;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), batteryCharge);
    }
}
