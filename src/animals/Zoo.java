package animals;

import java.util.ArrayList;

public class Zoo {
    public static void main(String[] args) {
        ArrayList<String> animals = new ArrayList<>();
        animals.add(0, "Rat1");
        animals.add(1, "Bull2");
        animals.add(2, "Tiger3");
        animals.add(3, "Rabbit4");
        animals.add(4, "Dragon5");
        animals.add(5, "Snake6");
        animals.add(6, "Horse7");
        animals.add(7, "Monkey8");

        animals.remove(2);
        animals.remove(3);
        animals.remove(4);

        System.out.println("Size = " + animals.size());
        for (String a: animals) {
            System.out.println(a);
        }
    }
}

