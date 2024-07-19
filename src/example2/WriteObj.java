package example2;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObj {

    public static void main(String[] args) {
        try (FileOutputStream fs = new FileOutputStream("owner.txt");
             ObjectOutputStream out = new ObjectOutputStream(fs);
        ) {

            var owner = new Owner("Florin",new Dog());
            out.writeObject(owner);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
