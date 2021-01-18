import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class runPython {
    public static void main(String[] args) {
        try {
            String s = null;
            // コマンドはmacOSのもの
            Process p = Runtime.getRuntime().exec("python hello.py");
            BufferedReader in = new BufferedReader(new InputStreamReader(p.getInputStream()));
            while ((s = in.readLine()) != null) {
                System.out.println(s);
            }
        } catch (IOException ie) {
            ie.printStackTrace();
        }
    }
}
