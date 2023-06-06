import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CityTranstortSystem cityTranstortSystem=new CityTranstortSystem(5);
        System.out.println(cityTranstortSystem);
        System.out.println(
                cityTranstortSystem.getTransportInterval(new Route(1)));

        cityTranstortSystem.breakVenicle(3);
        System.out.println(
                cityTranstortSystem.getTransportInterval(new Route(0)));
        System.out.println("\n"+cityTranstortSystem.readTimeTable());

        try {
            cityTranstortSystem.addVenicle(new Bus(true, new Route(0, 10),
                    10, true));
        } catch (VenicleException e){
            e.printStackTrace();
        }
        cityTranstortSystem.close();
    }
}