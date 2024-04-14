import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner s=new Scanner(System.in);
        int randomNumber,userNumber, flag, j,result=0,rounds=0;
        String ch;
        System.out.println("""
                welcome to number game
                you are given 3 attempts to guess the ri8 number
                score allocation points:
                1st attempt:30 pts
                2nd attempt:20 pts
                3st attempt:10 pts
                not guessed:0 pts
                would you like to have multi rounds(yes or no):""");
        ch=s.nextLine();
        if("yes".equals(ch)){
            System.out.println("enter desired rounds:");
            rounds=s.nextInt();
        }
        for(j=rounds;j>0;j--) {
            randomNumber = r.nextInt(101);
            //System.out.println(randomNumber);
            flag=0;
            for (int i = 3; i > 0; --i) {
                System.out.println("enter ur choice:");
                userNumber = s.nextInt();
                System.out.println(userNumber);
                if (userNumber == randomNumber) {
                    System.out.println("u guessed it");
                    System.out.printf("done with %d attempts left%n", i);
                    flag = 1;
                    result+=i*10;
                    break;
                } else if (userNumber > randomNumber) {
                    System.out.println("u guessed larger num");
                    System.out.println(i-1+" attempts left");
                } else if (userNumber < randomNumber) {
                    System.out.println("u guessed smaller num");
                    System.out.println(i-1+" attempts left");
                }

            }
            if(flag==0) {
                System.out.println("u lose");
                System.out.println("the crt answer is " + randomNumber);
            }
        }
        System.out.printf("you scored %d pts from playing %d rounds%n", result, rounds);
    }
}
