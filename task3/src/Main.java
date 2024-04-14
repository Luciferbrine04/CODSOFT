import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        amtbalance amtbal= new amtbalance();
        Scanner s=new Scanner(System.in);
        int cho,amount;
        System.out.printf("welcome to atm kiosk\nfor withdrawing money choose 1\nfor depositing money choose 2\nfor checking bank balance choose 3\nfor exiting choose 0\n%n");
        do {
            System.out.print("enter your choice:");
            cho=s.nextInt();
            if(cho==1){
                System.out.println("enter money for withdrawal:");
                amount=s.nextInt();
                if (amount<amtbal.getUser_amount()){
                    withdraw(amount,amtbal);
                    System.out.println("money has been withdrawn");
                }
                else{
                    System.out.println("insufficient amount");
                }
            }
            else if (cho==2) {
                System.out.println("enter money for deposit:");
                amount=s.nextInt();
                deposit(amount,amtbal);
                System.out.println("money has been deposited");
            }
            else if (cho==3) {
                checkbalance(amtbal);
            } else if (cho==0) continue;
            else {
                System.out.println("invalid input");
            }
        }while(cho!=0);
        System.out.println("thanks for choosing our service");
    }

    public static void withdraw(int amount , amtbalance amt){
        int bal = amt.getUser_amount() - amount;
        amt.setUser_amount(bal);
    }

    public static void deposit(int amount,amtbalance amt){
        int bal = amt.getUser_amount() + amount;
        amt.setUser_amount(bal);

    }

    public static void checkbalance(amtbalance amt){
        System.out.println(amt.getUser_amount());
    }
}