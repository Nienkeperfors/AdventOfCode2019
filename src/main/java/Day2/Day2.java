package Day2;

import Reader.fileReader;
import com.sun.jdi.IntegerValue;

import java.util.ArrayList;

public class Day2 {

    public static int part1() {
        ArrayList<Integer> list = fileReader.fileStringToInt("Day2.txt");
        int placeOfOpcode = 4;

        firstloop:
        for (int i = 0; i < list.size(); i = i + placeOfOpcode) {
            int opcode = list.get(i);
            if (opcode == 99) {
                break firstloop;
            }
            int newValue = getNewValue(opcode, list.get(list.get(i + 1)), list.get(list.get(i + 2)));
            list.set(list.get(i + 3), newValue);
        }
        return list.get(0);
    }

    private static int getNewValue(int opcode, int value1, int value2) {
        if (1 == opcode) {
            return value1 + value2;
        }
        if (opcode == 2) {
            return value1 * value2;
        }
        System.out.println("OpCode komt niet overeen");
        return 0;
    }
}
