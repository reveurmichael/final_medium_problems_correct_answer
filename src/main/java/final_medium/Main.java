package final_medium;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
//        FinalExamMedium medium = new FinalExamMedium();
        // TODO: modify Class Monster's comparedTo() function

        FinalExamMediumCorrectAnswer medium = new FinalExamMediumCorrectAnswer();
        Scanner scanner = new Scanner(System.in);
        String in = "";
        System.out.println("------------GAME BEGINS ------------\n");
        while(true){
            System.out.println("INPUT YOUR COMMAND: \n");
            try {
                in = scanner.next().toUpperCase().trim();
            }
            catch (Exception e) {
                System.out.println("INPUT SOMETHING ELSE");
            }
            switch (in) {
                case "AD":
                    medium.addOneDragon();
                    break;
                case "AB":
                    medium.addOneBull();
                    break;
                case "AT":
                    medium.addOneTortoise();
                    break;
                case "RD":
                    medium.removeAllDragons();
                    break;
                case "RB":
                    medium.removeAllBulls();
                    break;
                case "RT":
                    medium.removeAllTortoise();
                    break;
                case "SORT":
                    medium.sortArrUsingComparableInterface();
                    break;
                case "C":
                    medium.cloneLastMonster();
                    break;
                case "U":
                    medium.upgradeLastMonster();
                    break;
                case "S":
                    medium.saveArrToTextFile();
                    break;
                case "L":
                    medium.loadArrFromTextFile();
                    break;
                case "Q":
                    System.out.println("-------- GAME OVER --------");
                    return;
                default:
                    System.out.println("INPUT SOMETHING ELSE");
            }
            medium.printArrMonster();
        }
    }
}
