public class Main {
    public static void main(String[] args) {

        // Задача 1
        System.out.println(" Задача 1");

        byte courses = 4;
        System.out.println(" Значение переменной courses c типом byte = " + courses);
        short semesters = 8;
        System.out.println(" Значение переменной semesters c типом short = " + semesters);
        int age = 25;
        System.out.println(" Значение переменной age c типом int = " + age);
        long year = 365L;
        System.out.println(" Значение переменной year c типом long = " + year);
        float x = 1.63f;
        System.out.println(" Значение переменной x c типом float = " + x);
        double numberForPi = 3.1415926535;
        System.out.println(" Значение переменной number for Pi c типом double = " + numberForPi);

       // Задача 2
        System.out.println(" Задача 2");

     float variable1 = 27.12f;
     System.out.println( variable1);
     long variable2 = 987_678_965_549L;
     System.out.println( variable2);
     double variable3 = 2.786;
     System.out.println( variable3);
     boolean variable4 = false;
     System.out.println( variable4);
     char variable5 = 569;
     System.out.println( variable5);
     short variable6 = -159;
     System.out.println( variable6);
     int variable7 = 27897;
     System.out.println( variable7);
     byte variable8 = 67;
     System.out.println( variable8);

        // Задача 3
        System.out.println(" Задача 3");

        int classA = 23;
        int classB = 27;
        int classC = 30;
        int paper = 480;
        int result = classA + classB + classC;
        System.out.println("Всего в школе " + result + " учеников");
        int numberOfSheets = paper / result;
        System.out.println("На каждого ученика рассчитано " + numberOfSheets + " листов бумаги");

        // Задача 4
        System.out.println(" Задача 4");

        int twoBottles = 16;
        int productionTime = 2;
        int bottlePer20Minute = 20;
        int productionTimePerDay = 24 * 60;
        int productionTimeIn3Days = 3 * productionTimePerDay;
        int productionTimeInMonth = 10 * productionTimeIn3Days ;
        int bottlePerMinute = twoBottles / productionTime;
        System.out.println("Машина делает  " + bottlePerMinute + " бутылок в минуту");
        int bottlePer20 = bottlePerMinute * bottlePer20Minute;
        System.out.println(" За " + bottlePer20Minute+ " минут машина произвела бутылок " + bottlePer20 + " штук");
        int bottlePerDay = bottlePerMinute * productionTimePerDay;
        System.out.println( " За " + productionTimePerDay + " минут машина произвела бутылок " + bottlePerDay + " штук ");
        int bottlePer3Days = bottlePerMinute * productionTimeIn3Days;
        System.out.println(" За " + productionTimeIn3Days + " минут машина произвела бутылок " + bottlePer3Days + " штук");
        int bottlePerMonths = bottlePerMinute * productionTimeInMonth ;
        System.out.println(" За " + productionTimeInMonth+  " минут машина произвела бутылок " + bottlePerMonths + " штук");

      // Задача 5
        System.out.println(" Задача 5");
















    }
}