import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObjSerializable {
    public static void main(String[] args) {
        try (FileOutputStream fs = new FileOutputStream("cat1.txt");
             ObjectOutputStream out = new ObjectOutputStream(fs);
        ) {

            var cat = new Cat("Tom2",5);
            out.writeObject(cat);



        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}