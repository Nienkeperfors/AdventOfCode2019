package Reader;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class fileReader {
    private static String fileLocation = "C:\\Repository\\AdventOfCode\\src\\main\\resources\\";

    public static ArrayList<Integer> fileToIntList(String filePath) {
        Scanner s = null;
        try {
            s = new Scanner(new File(fileLocation + filePath));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        ArrayList<Integer> list = new ArrayList<>();
        while (s.hasNext()){
            list.add(parseInt(s.next()));
        }
        s.close();

        return list;
    };


}
