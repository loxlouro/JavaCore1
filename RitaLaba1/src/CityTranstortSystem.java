import java.io.IOException;
import java.util.ArrayList;

public class CityTranstortSystem {
    private ArrayList<Venicle> venicles;
    private static Route[] routes;
    private TimeTable timeTable = new TimeTable();
    public CityTranstortSystem(int count) {
        CityTranstortSystem.routes = new Route[3];
        venicles=new ArrayList<>();
        for (int i=0;i<routes.length;i++){
            routes[i]=new Route(i,10);
        }

        for (int i=0;i<3;i++){
            venicles.add(new Tram(true,routes[0],12));
            venicles.add(new Bus(true,routes[1],20));
            venicles.add(new Trolleybus(true,routes[2],30));
        }
        timeTable.writeVenicleToFile(venicles);
        timeTable.writeVenicleToFile(venicles);
    }

    public void breakVenicle(int index){
        this.venicles.get(index).isWorkeble=false;
    }
    public int getTransportInterval(Route route){
        int venicleCount=0;
        Venicle temp=null;
        for (int i=0;i<venicles.size();i++){
            if(venicles.get(i).getRoute().getRouteNumber()==route.getRouteNumber()
                    &&venicles.get(i).isWorkeble){
                venicleCount++;
                temp=venicles.get(i);
            }
        }
        return routes[routeNumberByVenicleType(temp)].getInterval(venicleCount);
    }
    private int routeNumberByVenicleType(Venicle venicle){
        return venicle.route.getRouteNumber();
    }

    public String readTimeTable(){
        StringBuilder temp = new StringBuilder("");
        for (Venicle i:timeTable.readVenicleFromFile()
             ) {
            temp.append(i.toString()+"\n");
        }
        return temp.toString();
    }
    public void close(){

    }
    @Override
    public String toString() {
        StringBuilder temp = new StringBuilder();
        for (Venicle i:venicles
             ) {
            temp.append(i+"\n");
        }
        temp.append("\n\n");
        for (Route i:routes
             ) {
            temp.append(i.info()+"\n");
        }
        return temp.toString();
    }

    public void addVenicle(Venicle venicle) throws VenicleException {
        if (venicle.route!=this.venicles.get(venicle.route.getRouteNumber()).route) {
            throw new VenicleException("Venicle excetion happend!! Panic!!!",
                    venicle,this.venicles.get(venicle.route.getRouteNumber()));
        } else this.venicles.add(venicle);
    }
    public ArrayList<Venicle> getVenicles() {
        return venicles;
    }

    public void setVenicles(ArrayList<Venicle> venicles) {
        this.venicles = venicles;
    }
}
