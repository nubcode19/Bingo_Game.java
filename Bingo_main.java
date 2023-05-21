import otherPack.*;
import java.util.Scanner;

public class Bingo_main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        rng object = new rng();

        System.out.print("\n\nBINGO!!\n\n||RULES||\nStart by inputing three numbers ranging from 1-50.\nIf those three numbers are generated and all three equaled\nto true then you get a BINGO!\n\n||Input numbers here||: ");
        
        int frstNum, scndNum, thrdNum;
        frstNum = scan.nextInt(); scndNum = scan.nextInt(); thrdNum = scan.nextInt();
        while(frstNum > 50 || scndNum > 50 || thrdNum > 50){
            System.out.print("\nInput is higher than 50!!\nPls input three numbers rangin from 1-50\n||Input numbers here||: ");

            frstNum = scan.nextInt(); scndNum = scan.nextInt(); thrdNum = scan.nextInt();
        }

        while(true){
            System.out.print("\n||Generating Numbers...||\n");
            object.rngMain(frstNum, scndNum, thrdNum);
            break;
        }
    }
}
