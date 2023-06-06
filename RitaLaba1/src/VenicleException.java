public class VenicleException extends Exception{
    public VenicleException(String message, Venicle venicle,Venicle venicle2){
        super("Это "+message+" "+venicle.getType()+"  а этот маршрут для "+venicle2.getType());
    }
}
