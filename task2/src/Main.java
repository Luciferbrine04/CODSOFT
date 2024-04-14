import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int dapa;
        int os;
        int math;
        int coa;
        int evs;
        int dbms;
        int result,pr;
        System.out.println("enter students mark out of 100");
        System.out.println("dapa:");
        dapa=s.nextInt();
        System.out.println("os:");
        os=s.nextInt();
        System.out.println("math:");
        math=s.nextInt();
        System.out.println("coa:");
        coa=s.nextInt();
        System.out.println("evs:");
        evs=s.nextInt();
        System.out.println("dbms:");
        dbms=s.nextInt();
        result=dapa+os+coa+math+evs+dbms;
        System.out.println("total mark(/600):"+result);
        pr=result/6;
        System.out.printf("percentage:%d%%%n", pr);
        if(pr==100)
            System.out.println("O grade");
        else if(pr>89&&pr<100)
            System.out.println("A grade");
        else if(pr>79&&pr<90)
            System.out.println("B grade");
        else if(pr>69&&pr<80)
            System.out.println("C grade");
        else if(pr>59&&pr<70)
            System.out.println("D grade");
        else if(pr>49&&pr<60)
            System.out.println("E grade");
        else if(pr<50)
            System.out.println("F grade");
    }
}