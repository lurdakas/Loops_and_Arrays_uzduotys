public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println();
        System.out.println("-----------LENGVESNI-------------");
        System.out.println();

        System.out.println("_____Pirma Užduotis_____");

        for (int i = 0; i < 10; i++) {
            System.out.println("labas");
        }

        System.out.println("_____Antra Užduotis_____");


        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        System.out.println("_____Trečia Užduotis_____");


        String[] Augalai = {"Levanda", "Kaktusas", "Rožė", "Ežiuolė", "Bijūnas", "Tulpė", "Astras", "Šalavijas", "Kinmetė", "Aguona"};
        System.out.println(Augalai[0]);
        System.out.println(Augalai[1]);
        System.out.println(Augalai[2]);
        System.out.println(Augalai[3]);
        System.out.println(Augalai[4]);
        System.out.println(Augalai[5]);
        System.out.println(Augalai[6]);
        System.out.println(Augalai[7]);
        System.out.println(Augalai[8]);
        System.out.println(Augalai[9]);


        System.out.println("_____Ketvirta Užduotis_____");


        for (int i = 0; i < 10; i++) {
            System.out.println(Augalai[i]);
        }


        System.out.println("_____Penkta Užduotis_____");


        for (int i = Augalai.length - 1; i >= 0; i--) {
            System.out.println(Augalai[i]);
        }

        System.out.println("_____Šešta Užduotis_____");

        for (int i = 10; i <= 50; i += 2) {
            System.out.println(i);
        }

        System.out.println("_____Septinta Užduotis_____");

        for (int i = 10; i <= 50; i += 2) {
            if (i % 10 == 0) {
                continue;
            }
            System.out.println(i);
        }

        System.out.println("_____Aštunta Užduotis_____");

        int Count = 0;
        for (int i = 0; i <= 20; i++) {
            if (i % 2 == 0) {
                Count++;
            }
        }
        System.out.println(Count);


        System.out.println("_____Devinta Užduotis_____");

        String[] Augalai2 = {"Levanda", "Kaktusas", "Rožė", "Ežiuolė", "Bijūnas", "Tulpė", "Astras", "Šalavijas", "Kinmetė", "Aguona"};

        int Count1 = 0;
        for (int i = 0; i < Augalai2.length; i++) {
            if (Augalai2[i].length() <= 4) {
                Count1++;
            }
        }
        System.out.println(Count1);


        System.out.println("__________");

        int Count2 = 0;
        for (int i = 0; i < Augalai2.length; i++) {
            if (Augalai2[i].length() > 7) {
                Count2++;
            }
        }

        System.out.println(Count2);


        System.out.println("_____Dešimta Užduotis_____");


        String[] Augalai3 = {"Levanda", "Kaktusas", "Rožė", "Ežiuolė", "Bijūnas", "Tulpė", "Astras", "Šalavijas", "Kinmetė", "Aguona"};

        int Count3 = 0;
        for (int i = 0; i < Augalai3.length; i++) {
            if (Augalai3[i].length() > 5 && Augalai3[i].length() < 10) {
                Count3++;
            }
        }
        System.out.println(Count3);


        System.out.println();
        System.out.println("-----------SUNKESNI-------------");
        System.out.println();

        System.out.println("_____Pirma Užduotis_____");


        int min = 0;
        int max = 0;


        for (int i = 0; i < 300; i++) {

            int result = 1 + (int) (Math.random() * 300);
            if (result > 150) {
                min++;

                int result1 = 1 + (int) (Math.random() * 300);
                if (result1 > 275) {
                    max++;
                    System.out.println("[" + result1 + "]");
                } else {
                    System.out.println(result1);

                }
            }
        }
        {
            System.out.println("--------------");
            System.out.println(min);
        }


        System.out.println();
        System.out.println("_____Antra Užduotis_____");
        System.out.println();


        String num = "";
        for (int i = 0; i <= 3000; i++) {
            if (i % 77 == 0) {
                num += i + ",";
            }
        }
        System.out.print(num.substring(0, num.length() - 1));


        System.out.println();
        System.out.println("_________");
        System.out.println();


        for (int i = 0; i <= 3000; i++) {
            if (i % 77 == 0) {
                if (3000 / 77 > i / 77) {
                    System.out.print(i + ",");
                } else {
                    System.out.println(i);
                }
            }
        }


        System.out.println();
        System.out.println("_____Trečia Užduotis_____");
        System.out.println();


        for (int i = 1; i <= 25; i++) {
            for (int a = 1; a <= 25; a++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("_____Ketvirta Užduotis_____");
        System.out.println();


        for (int i = 1; i <= 25; i++) {
            for (int a = 1; a <= 25; a++) {
                if (a == i) {
                    System.out.print(".");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }


        System.out.println();
        System.out.println("_____Penkta Užduotis_____");
        System.out.println();

        System.out.println();
        System.out.println("a)");
        System.out.println();


        while (true) {
            int moneta = 0 + (int) Math.round(Math.random() * 1);
            if (moneta == 1) {
                System.out.println("S");
            }
            if (moneta == 0) {
                System.out.println("H");
                break;
            }
        }


        System.out.println();
        System.out.println("b)");
        System.out.println();

        int count = 0;
        while (true) {
            int moneta1 = (int) (Math.floor(Math.random() * 2));
            if (moneta1 == 0) {
                count++;
                System.out.println("H");
            }else {
                System.out.println("S");
            }
            if (count == 3) {
                break;
            }
        }



        System.out.println();
        System.out.println("c)");
        System.out.println();


        int count2 = 0;
        while (true) {
            int moneta3 = (int) (Math.floor(Math.random() * 2));
            if (moneta3 == 0) {
                count2++;
                System.out.println("H");
            }else {
                System.out.println("S");
            }
            if (count2 == 3) {
                break;
            }
        }























































































        }
    }