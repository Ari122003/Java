package IO;

import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.imageio.IIOException;

public class Character_Stream {

    public static void main(String[] args) {

        try {

            FileReader fir = new FileReader("C:/Users/Hp/OneDrive/Desktop/Program files/Java/IO/input.txt");

            int conetnt = fir.read();

            while (conetnt != -1) {
                System.out.println((char) conetnt);
                conetnt = fir.read();
                fir.close();
            }
        } catch (IOException e) {
            System.out.println(e);

        }

        try {
            FileWriter fos = new FileWriter(
                    "C:/Users/Hp/OneDrive/Desktop/Program files/Java/IO/output.txt");
            String text = "a Fullstack dev";

            fos.write(text);
            fos.close();
        } catch (IOException e) {
            System.out.println(e);

        }

    }

}
