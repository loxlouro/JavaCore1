import java.io.*;
import java.util.ArrayList;
import java.util.Collection;

public class TimeTable {
    private ObjectInputStream fileReadStream;
    private ObjectOutputStream fileWriteStream;

    public TimeTable() {
        try {
            fileReadStream = new ObjectInputStream(
                    new FileInputStream("timetable.dat"));
            fileWriteStream = new ObjectOutputStream(
                    new FileOutputStream("timetable.dat"));
        }catch (IOException e){
            e.printStackTrace();
            System.out.println(fileWriteStream.toString()+"\n"+fileReadStream.toString());
        }
    }
    public void close() {
        try {
            this.fileReadStream.close();
            this.fileWriteStream.close();

        }catch (IOException e){

        }
    }
        public ArrayList<Venicle> readVenicleFromFile() {
            ArrayList<Venicle> temp = new ArrayList<>();

            try {
                while (temp.size() < 30) {
                    temp.add((Venicle) fileReadStream.readObject());

                }
            } catch (IOException e) {
                return temp;
            } catch (ClassNotFoundException e) {
                return temp;
            }
            return temp;
        }

    public void writeVenicleToFile(Venicle venicle){
        try {
            fileWriteStream.writeObject(venicle);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    public void writeVenicleToFile(Collection<Venicle> venicles){
        try {
            for (Venicle i:venicles
                 ) {
                fileWriteStream.writeObject(i);
            }
            System.out.println(fileReadStream.readAllBytes());
        }catch (IOException e){
            e.printStackTrace();
        }
    }

}
