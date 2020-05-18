package app;

import java.io.*;

public class App {
    public static void main(String[] args) {
        File file = new File("file.csv");
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line = null;

            while ((line = bufferedReader.readLine()) != null){
                String[] listData = line.split(",");
                System.out.println(listData[5]);
            }
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
