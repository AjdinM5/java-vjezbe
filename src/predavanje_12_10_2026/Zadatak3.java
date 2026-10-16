package predavanje_12_10_2026;

public class Zadatak3 {
    public static void main(String[] args) {
            int a=20,b=10;
            int suma=a+b;
            int razlika=a-b;
            boolean jeVeci=a>b;
            boolean obaPozitivna=(a>0) && (b>0);

            System.out.printf("Suma brojeva %d i %d je %d\n", a, b, suma);
            System.out.printf("Razlika brojeva %d i %d je %d\n", a,b,razlika);
            System.out.printf("Je li a(%d) veci od b(%d): %s\n", a,b,jeVeci);
            System.out.println("Jesu li oba pozitivna? " + obaPozitivna);

            //dodatne operacije
            System.out.println();
            System.out.printf("%d * %d = %d\n", a,b, a*b);
            System.out.printf("%d / %d = %d\n", a,b, a/b);
            System.out.printf("%d %% %d = %d\n\n", a,b, a%b);

            //zagrade i prioritet operatora
            System.out.printf("2+10*60=%d\n", 2+10*60);
            System.out.printf("(20/5)*13=%d\n", (20/5)*13);
            System.out.printf("(10-4)/2=%d\n", (10-4)/2);
            System.out.printf("27+52/6=%d\n\n", 27+52/6);

            //kalkulator
            int x=60, y=40;
            System.out.printf("%d + %d = %d\n",x,y,x+y);
            System.out.printf("%d - %d = %d\n", x,y,x-y);
            System.out.printf("%d * %d = %d\n", x,y,x*y);
            System.out.printf("%d / %d = %d\n", x,y,x/y);
            System.out.printf("%d / %d = %.2f\n", x,y,(double)x/y);
            System.out.printf("%d %% %d = %d\n", x,y,x%y);



    }

}
