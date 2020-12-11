package final_medium;

import java.io.*;
import java.math.*;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Random;

public class Monster implements Comparable<Monster> {
    public static Random random = new Random(999);
    public String name;
    public int strength; // 力量
    public int agility; // 敏捷
    public int intelligence;  //智力

    public String toString(){
        // Don't modify code in this toString function.
        return "[ " + this.name +
                ": S = " + this.strength + ", A = " + this.agility + ", I = "
                + this.intelligence +  ", TOTAL = " +
                (this.agility + this.intelligence + this.strength) + " ]";
    }

    @Override
    public int compareTo(Monster other) {
        // TODO: modify your code here for the function sortArrUsingComparableInterface()
        if(strength + agility + intelligence < other.strength + other.agility + other.intelligence)
            return -1;
        return 1;
    }
}

class Bull extends Monster {
    public Bull(){
        this.name = "Bull";
        this.strength = 8  + random.nextInt(10);
        this.agility = 28 + random.nextInt(10);
        this.intelligence = 8 + random.nextInt(10);
    }
}

class Dragon extends Monster {
    public Dragon(){
        this.name = "Dragon";
        this.strength = 29  + random.nextInt(10);
        this.agility = 9 + random.nextInt(10);
        this.intelligence = 9 + random.nextInt(10);
    }
}

class Tortoise extends Monster {
    public Tortoise(){
        this.name = "Tortoise";
        this.strength = 1  + random.nextInt(10);
        this.agility = 31 + random.nextInt(10);
        this.intelligence = 1 + random.nextInt(10);
    }
}
