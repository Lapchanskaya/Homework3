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

       int totalCans = 120;
       int whitePaintInOneClass = 2;
       int brownPaintInOneClass = 4;
       int totalPaintInOneClass = whitePaintInOneClass + brownPaintInOneClass;
        System.out.println(" Всего в одном классе используют " + totalPaintInOneClass + " банок краски" );
       int totalClasses = totalCans / totalPaintInOneClass;
        System.out.println(" Всего в школе " + totalClasses + " классов." );
        int totalWhitePaint = whitePaintInOneClass * totalClasses ;
        int totalBrownPaint = brownPaintInOneClass * totalClasses ;
        System.out.println(" В школе, где " +  totalClasses + " классов, нужно " + totalWhitePaint + " банок белой краски и " + totalBrownPaint + " банок коричневой краски");

        // Задача 6
        System.out.println(" Задача 6");

        int OneBanana = 80;
        int fiveBananas = OneBanana * 5;
        System.out.println ("Пять бананов весят " + fiveBananas + " грамм" ) ;
        int milk100Ml = 105;
        int milk200Ml = milk100Ml * 2;
        System.out.println (" 200 миллилитров молока  " + milk200Ml + " грамм" ) ;
        int iceCream = 2 * 100;
        System.out.println (" 2 брикета мороженного  " + iceCream + " грамм" ) ;
        int oneEgg = 70;
        int fourEggs = oneEgg * 4;
        System.out.println (" 4 яйца  " +  fourEggs + " грамм" ) ;
        int totaldishes = fiveBananas + milk200Ml + iceCream + fourEggs;
        System.out.println ( " Вес блюда " + totaldishes + " грамм") ;
        int grPerKg = 1000;
        float weightKg = totaldishes/(float)grPerKg;
        System.out.println ( " Вес блюда " + weightKg + " килограмм") ;

        // Задача 7
        System.out.println(" Задача 7");
         int needToRest = 7;
        int grPerKg2 = 1000;
        int needToRestGr = needToRest * grPerKg2;
        int loose1 = 250;
        int loose2 = 500;
        int theFirstWay = needToRestGr / loose1 ;
        System.out.println ( "Если спортсмен будет терять " + loose1 + " грамм в день то он похудеет на " + needToRest + " кг за " + theFirstWay + " дней ") ;
        int theSecondWay = needToRestGr / loose2 ;
        System.out.println ( "Если спортсмен будет терять " + loose2 + " грамм в день то он похудеет на " + needToRest + " кг за " + theSecondWay + " дней ") ;
        int arithmeticMean =  (theFirstWay + theSecondWay ) / 2 ;
        System.out.println ( " В среднем, спортсмену потребуется " + arithmeticMean + " день, для того чтобы похудеть на " + needToRest + " кг ") ;














    }
}