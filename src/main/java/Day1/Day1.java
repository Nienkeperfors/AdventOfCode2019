package Day1;

import Reader.fileReader;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class Day1 {

    public static int part1() {
        ArrayList<Integer> list = fileReader.fileToIntList("Day1.txt");
        AtomicInteger fuel = new AtomicInteger();
        list.forEach(mass -> {
            int fuelPerMass = berekenFuelForMass(mass);
            fuel.set(fuelPerMass + fuel.get());
        });
        return fuel.get();
    }

    public static int part2() {
        ArrayList<Integer> list = fileReader.fileToIntList("Day1.txt");
        AtomicInteger fuel = new AtomicInteger();
        list.forEach(mass -> {
            int fuelPerMass = berekenFuelForMass(mass);
            fuel.set(fuelPerMass + fuel.get());
            while (fuelPerMass > 0) {
                fuelPerMass = berekenFuelForMass(fuelPerMass);
                if(fuelPerMass > 0){
                    fuel.set(fuelPerMass + fuel.get());
                }
            }
        });
        return fuel.get();
    }

    private static int berekenFuelForMass(int mass) {
        return (mass / 3) - 2;
    }
}
