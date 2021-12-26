package com.company;

public class Main {

    public static void main(String[] args) {
        Animal dolphin1 = new Dolphin("dolphin1", "blue");
        Animal dolphin2 = new Dolphin("dolphin2", "white");
        Animal dolphin3 = new Dolphin("dolphin3", "grey");

        Animal penguin1 = new Penguin("Penguin1", "black");
        Animal penguin2 = new Penguin("Penguin2", "white");
        Animal penguin3 = new Penguin("Penguin3", "yellow");

        Animal whale1 = new Whale("Whale1", "black");
        Animal whale2 = new Whale("Whale2", "white");
        Animal whale3 = new Whale("Whale3", "blue");

        Animal penguin = new Penguin("Lolo", "black and white");
        Animal dolphin = new Dolphin("Wally", "blue");
        Animal whale = new Whale("Ruby", "black");

        Animal[] animals = {penguin1,penguin2,penguin3,dolphin1,
                      dolphin2, dolphin3, whale1,whale2,whale3};

        Dolphin[] dolphins = new Dolphin[3];
        Penguin[] penguins =new Penguin[3];
        Whale[] whales = new Whale[3];

        int a =0;
        int b =0;
        int c =0;
        for (Animal s:animals
        ) {
            if (s instanceof Penguin) {
                penguins[a] = (Penguin) s;
                a++;
            } else if (s instanceof Dolphin) {
                dolphins[b] = (Dolphin) s;
                b++;
            }else{
                whales[c] =(Whale) s;
                c++;
            }
        }
        for (Penguin t:penguins
        ) {
            t.layEgg();
        }
        for (Dolphin k:dolphins
        ) {
            k.smart();
        }
        for (Whale w:whales
        ) {
            w.attack();
        }

        System.out.println("*************************************************");
        for (Animal s : animals
        ) {
            if (s instanceof Penguin) {
                ((Penguin) s).layEgg();
                ((Penguin) s).voice();
                System.out.println("*************************************************");

            } else if (s instanceof Dolphin) {
                ((Dolphin) s).smart();
                ((Dolphin) s).voice();
                System.out.println("*************************************************");
            } else {
                ((Whale) s).attack();
                ((Whale) s).voice();
            }
        }

        System.out.println("*************************************************");

        for (Animal s : animals
        ) {
            if (s.getClass().getName() == "com.company.Penguin") {
                ((Penguin) s).layEgg();
                ((Penguin) s).voice();
                System.out.println("*************************************************");
            } else if (s.getClass().getName() == "com.company.Dolphin") {
                ((Dolphin) s).smart();
                ((Dolphin) s).voice();
                System.out.println("*************************************************");
            } else {
                ((Whale) s).attack();
                ((Whale) s).voice();
                System.out.println("*************************************************");
            }
        }
        printLn(penguins);
        System.out.println("*************************************************");

        printLn(dolphins);
        System.out.println("*************************************************");

        printLn(whales);
        System.out.println("*************************************************");

    }
    public  static void printLn(Object[] objects){
        for (Object method:objects
        ) {
            System.out.println(method);
        }
    }
}


