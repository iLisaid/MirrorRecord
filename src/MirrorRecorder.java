import java.io.*;
import java.util.ArrayDeque;

public class MirrorRecorder {
    public static void record(String fileIn, String fileOut) {
        try {FileReader reader = new FileReader(fileIn);
            FileWriter writer = new FileWriter(fileOut);
            int c;
            ArrayDeque<Character> buff = new ArrayDeque<>();
            while ((c = reader.read()) != -1) {
                buff.push((char) c);
            }
            while(!buff.isEmpty()){
                writer.write(buff.pop());
            }
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
