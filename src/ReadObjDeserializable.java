import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObjDeserializable {

    public static void main(String[] args) {
       try(
               FileInputStream fs = new FileInputStream("cat1.txt");
               ObjectInputStream in = new ObjectInputStream(fs);
               )
       {
           Cat c = (Cat) in.readObject();
           System.out.println(c);

       }catch (IOException | ClassNotFoundException e)
       {
           e.printStackTrace();
       }
    }
}
