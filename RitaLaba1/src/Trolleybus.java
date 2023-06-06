import java.util.Objects;

public class Trolleybus extends Venicle{
    private int batteryCharge; //Поля
    private boolean hasAccordion;
    public Trolleybus(boolean isWorkeble, Route route, int sitCount) {
        super(isWorkeble, route, sitCount);
        this.batteryCharge=50;
    }
    public int getBatteryCharge() {
        this.batteryCharge--;
        return batteryCharge;
    }

    public void setBatteryCharge(int batteryCharge) {
        this.batteryCharge = batteryCharge;
    }

    public boolean isHasAccordion() {
        return hasAccordion;
    }

    public void setHasAccordion(boolean hasAccordion) {
        this.hasAccordion = hasAccordion;
    }

    public String getType(){
        return " троллейбус";
    }
    @Override
    public String toString() {
        return "Троллейбус " +
                "исправен: " + isWorkeble +
                ", на маршруте: " + route +
                ", количество мест для пассажиров: " + sitCount +
                ", заряд аккумулятора: " + batteryCharge +
                "%, гармошка: " + hasAccordion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Trolleybus that = (Trolleybus) o;
        return batteryCharge == that.batteryCharge && hasAccordion == that.hasAccordion;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), batteryCharge, hasAccordion);
    }
}
