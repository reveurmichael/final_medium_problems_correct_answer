package final_medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.io.*;
import java.math.*;
import java.util.Collections;
import java.util.ArrayList;

public class FinalExamMedium {

    ArrayList<Monster> arrMonster = new ArrayList<>();

    public void addOneDragon(){
        arrMonster.add(new Dragon());
    }

    public void addOneBull(){
        // TODO: write your code here.

    }

    public void addOneTortoise(){
        // TODO: write your code here.

    }

    public void sortArrUsingComparableInterface(){
        // TODO: write your code here.

    }

    public void cloneLastMonster(){

        if(arrMonster.size() == 0)
            return;

        int size = arrMonster.size();
        Monster clone = new Monster();
        clone.name = arrMonster.get(size - 1).name;
        clone.intelligence = arrMonster.get(size - 1).intelligence;
        clone.strength = arrMonster.get(size - 1).strength;
        clone.agility = arrMonster.get(size - 1).agility;

        // TODO: write your code here.
    }

    public void upgradeLastMonster(){
        // TODO
        //  Double the attributes of the last monster (last in the position of arrMonster).
        //  Double means multiplying by 2.
        //  For example, if the last monster's intelligence = 20, strength = 11, agility = 3,
        //  then, after calling this function,
        //  the monster should have intelligence = 40, strength = 22, agility = 6

        if(arrMonster.size() == 0)
            return;

        // TODO: write your code here.

    }

    public void removeAllDragons(){
        ArrayList<Monster> monstersToRemove = new ArrayList<>();
        for(Monster m : arrMonster)
            if(m.name.equalsIgnoreCase("Dragon"))
                monstersToRemove.add(m);

        arrMonster.removeAll(monstersToRemove);
    }

    public void removeAllBulls(){
        // TODO: write your code here.

    }

    public void removeAllTortoise(){
        // TODO: write your code here.


    }

    public void saveArrToTextFile() throws IOException {
        // This function goes in pair with loadArrFromTextFile().
        // It's up to you to conceive how the data should be saved.
        // We will call saveArrToTextFile() first and then loadArrToTextFile(), if we have the same arrMonster,
        // then it's OK.

        BufferedWriter bw = new BufferedWriter(new FileWriter("file.txt"));
        // TODO: write your code here.


        bw.close();
    }

    public void loadArrFromTextFile() throws IOException {
        // ATTENTION: Don't modify this function!!!
        // ATTENTION: Don't modify this function!!!
        // ATTENTION: Don't modify this function!!!
        BufferedReader br = new BufferedReader(new FileReader("file.txt"));
        String str = br.readLine();
        arrMonster.clear();

        while(str != null){
            if(str.length() == 0)
                return;
            String[] split = str.split(" ");
            Monster monster = new Monster();
            monster.name = split[0];
            monster.intelligence = Integer.parseInt(split[1]);
            monster.strength = Integer.parseInt(split[2]);
            monster.agility = Integer.parseInt(split[3]);
            arrMonster.add(monster);
            str = br.readLine();
        }

        br.close();
    }

    public void printArrMonster(){
        int size = arrMonster.size();
        for(int i = 0; i < size; i ++){
            System.out.println(i + ": " + arrMonster.get(i));
        }
        System.out.println("\n--------------------------\n");
    }
}
