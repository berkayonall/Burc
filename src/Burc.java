import java.util.Scanner;

public class Burc {
    public static void main(String[] args) {

        int dg, ay;
        Scanner input = new Scanner(System.in);

        System.out.println("Doğum gününüzü giriniz :");
        dg = input.nextInt();

        System.out.println("Hangi ay doğdunuz :");
        ay = input.nextInt();

        if (ay == 1) {
            if ((dg >= 1 && dg <= 31)) {
                if (dg <= 21) {
                    System.out.println("Oğlak Burcusun");
                }
            } else {
                System.out.println("Ne kadar şanslısın ki Kovasın");
            }
        }


        if (ay == 2) {
            if ((dg >= 1 && dg <= 28)) {
                if (dg <= 20) {
                    System.out.println("Ne kadar şanslısın ki Kovasın");
                }
            } else {
                System.out.println("Balık");
            }
        }


        if (ay == 3) {
            if ((dg >= 1 && dg <= 31)) {
                if (dg <= 21) {
                    System.out.println("Balık");
                }
            } else {
                System.out.println("Koç");
            }
        }

        if (ay == 4) {
            if ((dg >= 1 && dg <= 30)) {
                if (dg <= 21) {
                    System.out.println("koç");
                }
            } else {
                System.out.println("Boğa");
            }
        }

        if (ay == 5) {
            if ((dg >= 1 && dg <= 31)) {
                if (dg <= 21) {
                    System.out.println("Boğa");
                }
            } else {
                System.out.println("İkizler");
            }
        }

        if (ay == 6) {
            if ((dg >= 1 && dg <= 30)) {
                if (dg <= 21) {
                    System.out.println("İkizler");
                }
            } else {
                System.out.println("Yengeç");
            }
        }

        if (ay == 7) {
            if ((dg >= 1 && dg <= 31)) {
                if (dg <= 21) {
                    System.out.println("Yengeç");
                }
            } else {
                System.out.println("Aslan");
            }
        }

        if (ay == 8) {
            if ((dg >= 1 && dg <= 31)) {
                if (dg <= 21) {
                    System.out.println("Aslan");
                }
            } else {
                System.out.println("Başak");
            }
        }


        if (ay == 9) {
            if ((dg >= 1 && dg <= 30)) {
                if (dg <= 21) {
                    System.out.println("Başak");
                }
            } else {
                System.out.println("Terazi");
            }
        }


        if (ay == 10) {
            if ((dg >= 1 && dg <= 31)) {
                if (dg <= 21) {
                    System.out.println("Terazi");
                }
            } else {
                System.out.println("Akrep");
            }
        }


        if (ay == 11) {
            if ((dg >= 1 && dg <= 30)) {
                if (dg <= 21) {
                    System.out.println("Akrep");
                }
            } else {
                System.out.println("Yay");
            }
        }


        if (ay == 12) {
            if ((dg >= 1 && dg <= 31)) {
                if (dg <= 21) {
                    System.out.println("Yay");
                }
            } else {
                System.out.println("Oğlak");
            }
        }

    }
}