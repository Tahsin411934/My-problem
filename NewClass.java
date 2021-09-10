
package uri_10_9_2020;

import java.util.Scanner;


public class NewClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a=input.nextInt();
        int d=input.nextInt();
        int b=input.nextInt();
        int e=input.nextInt();
        int c=a-b;
        int f=d-e;
        
       if(a>b && d>e)
       {
           int duration = 24+(b-a);
           int du=60+(e-d);
           System.out.printf("O JOGO a>b d>e DUROU %d HORA(S) E %d MINUTO(S)",duration,du);
       }
       
       else if(a==b && d==e)
       {
           System.out.println("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)");
       }
       
      else if(a>b && d<e)
       {
           int duration = 24+(b-a);
           int du=d-e;
           System.out.printf("O JOGO DUROU %d HORA(S) a>b || d<e E %d MINUTO(S)",duration,du);
       }
      else if(a<b && d<e)
       {
           int duration = (b-a);
           int du=(e-d);
           System.out.printf("O JOGO DUROU %d HORA(S) a<b || d<e E %d MINUTO(S)",duration,du);
       }
      else if(a<b && d>e)
       {
           int duration = (b-a-1);
           int du=60+(e-d);
           System.out.printf("O JOGO DUROU %d HORA(S) a<b || d>e E %d MINUTO(S)",duration,du);
       }
      
        
    }
}
