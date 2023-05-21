package otherPack;
import java.util.stream.IntStream;

public class rng {
    public boolean rngMain(int frstNum, int scndNum, int thrdNum){
        int [] rngArr = new int [26];
        boolean  numStat1, numStat2, numStat3;

        for (int a = 0; a <= 25; a++){
            System.out.print(" | " + (rngArr[a] = (int)(Math.random()*50+1)));

            if(a == 25){
                numStat1 = IntStream.of(rngArr).anyMatch(x->x == frstNum);
                numStat2 = IntStream.of(rngArr).anyMatch(x->x == scndNum);
                numStat3 = IntStream.of(rngArr).anyMatch(x->x == thrdNum);
                
                if(numStat1 && numStat2 && numStat3){
                    System.out.print("\n\n" + numStat1 + " | " + numStat2 + " | " + numStat3 + "\n|| BINGO!! ||\n\n");    
                }
                else if (numStat1 && !numStat2 && !numStat3){
                    System.out.print("\n\n" + numStat1 + " | " + numStat2 + " | " + numStat3 + "\n| So close |\n\n");
                }
                else if (numStat1 && numStat2 && !numStat3){
                    System.out.print("\n\n" + numStat1 + " | " + numStat2 + " | " + numStat3 + "\n| So close |\n\n");
                }
                else if (numStat1 && !numStat2 && numStat3){
                    System.out.print("\n\n" + numStat1 + " | " + numStat2 + " | " + numStat3 + "\n|| So close ||\n\n");
                }
                else if (!numStat1 && numStat2 && numStat3){
                    System.out.print("\n\n" + numStat1 + " | " + numStat2 + " | " + numStat3 + "\n|| So close ||\n\n");
                }
                else if (!numStat1 && !numStat2 && !numStat3){
                    System.out.print("\n\n" + numStat1 + " | " + numStat2 + " | " + numStat3 + "\n|| Better Luck Next Time ||\n\n");
                }
            }
        }
        
        return true;
    }
}
