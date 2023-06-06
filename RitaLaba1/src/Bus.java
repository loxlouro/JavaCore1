import java.util.Objects;

public class Bus extends Venicle{       //Класс Автобус
    private boolean hasAccordion;       //Поля

    public Bus(boolean isWorkeble, Route route, int sitCount) { //Конструктор с 3 параметрами
        super(isWorkeble, route, sitCount);                     //Конструктор супер-класса
    }

    public Bus(boolean isWorkeble, Route route, int sitCount, boolean hasAccordion) { //Конструтор с 4 параметрами
        super(isWorkeble, route, sitCount);
        this.hasAccordion = hasAccordion;
    }

    public boolean isHasAccordion() {
        return hasAccordion;
    }

    public void setHasAccordion(boolean hasAccordion) {
        this.hasAccordion = hasAccordion;
    }

    public String getType(){
        return " автобус";
    }
    @Override
    public String toString() {
        return "Автобус: " +
        "исправен: " + isWorkeble +
                ", на маршруте: " + route +
                ", количество мест для пассажиров: " + sitCount +
                ", гармошка: " + hasAccordion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Bus bus = (Bus) o;
        return hasAccordion == bus.hasAccordion;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), hasAccordion);
    }
}
