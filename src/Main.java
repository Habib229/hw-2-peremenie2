public class Main {
    public static void main(String[] args) {
        System.out.println("Домашние задание");
        System.out.println("Задача 1");
        int bananas = 50000;
        System.out.println("Значение переменной bananas с типом int равно " + bananas);
        byte apples = 100;
        System.out.println("Значение переменной apples с типом byte равно " + apples);
        short oranges = 25000;
        System.out.println("Значение переменной oranges с типом short равно " + oranges);
        long pineapples = 229745997;
        System.out.println("Значение переменной pineapples с типом long равно " + pineapples);
        float kiwi = 7.5f;
        System.out.println("Значение переменной kiwi с типом float равно " + kiwi);
        double watermelons = 227.458;
        System.out.println("Значение переменной watermelons с типом double равно " + watermelons);

        System.out.println();

        System.out.println("Задача 2");
        double a = 27.12;
        System.out.println(a);
        long b = 987678965549L;
        System.out.println(b);
        float c = 2.786f;
        System.out.println(c);
        short d = 569;
        System.out.println(d);
        short i = -159;
        System.out.println(i);
        int f = 27897;
        System.out.println(f);
        byte g = 67;
        System.out.println(g);

        System.out.println();

        System.out.println("Задача 3");
        byte lyudmilaPavlovna = 23;
        byte annaSergeevna = 27;
        byte catherineAndreyevna = 30;
        short sheetsOfPaper = 480;
        long totalNumberOfStudents = lyudmilaPavlovna + catherineAndreyevna + annaSergeevna;
        long sheetsForEachStudent = sheetsOfPaper / totalNumberOfStudents;
        System.out.println("На каждого ученика рассчитано " + sheetsForEachStudent + " листов бумаги");

        System.out.println();

        System.out.println("Задача 4");
        byte bottles = 16;
        byte minutes = 2;
        byte time1 = 20;
        long bottlesAtATime1 = (time1 / minutes) * bottles;
        System.out.println("За " + time1 + " минут машина произвела " + bottlesAtATime1 + " штук бутылок");
        int time2 = time1 * 3;
        long bottlesAtATime2 = (time2 / minutes) * bottles;
        System.out.println("За сутки машина произвела " + bottlesAtATime2 + " штук бутылок");
        int time3 = time2 * 3;
        long bottlesAtATime3 = (time3 / minutes) * bottles;
        System.out.println("За 3 дня машина произвела " + bottlesAtATime3 + " штук бутылок");
        int time4 = time3 * 10;
        long bottlesAtATime4 = (time4 / minutes) + bottles;
        System.out.println("За 1 месяц машина произвела " + bottlesAtATime4 + " штук бутылок");

        System.out.println();

        System.out.println("Задача 5");
        byte totalNumberOfCansOfPaint = 120;
        byte cansOfWhitePaint = 2;
        byte cansOfBrownPaint = 4;
        int totalNumberOfClasses = totalNumberOfCansOfPaint / (cansOfWhitePaint +cansOfBrownPaint);
        long totalNumberOfWhiteCans = cansOfWhitePaint * totalNumberOfClasses;
        long totalNumberOfBrownApples = cansOfBrownPaint * totalNumberOfClasses;
        System.out.println("В школе, где " + totalNumberOfClasses + " классов, нужно " + totalNumberOfWhiteCans + " банок белой краски и " + totalNumberOfBrownApples + " банок коричневой краски");

        System.out.println();

        System.out.println("Задача 6");
        byte banana = 5;
        byte weightOf1Banana = 80;
        short milk = 200;
        byte milkWeight = 105;
        byte iceCreamSundae = 2;
        byte massOfIceCreamSundae = 100;
        byte rawEggs = 4;
        byte weightOf1RawEgg = 70;
        short kgInMg = 1000;
        int weightOfSportsNutrition = ((banana * weightOf1Banana) + (milk / 100) * milkWeight) + (iceCreamSundae * massOfIceCreamSundae) + (rawEggs * weightOf1RawEgg);
        float inKg = (float) weightOfSportsNutrition / kgInMg;
        System.out.println("Масса спортивного завтрака ровна " + inKg + " кг");

        System.out.println();

        System.out.println("Задача 7");
        byte needToReset = 7;
        short loseWeight1 = 250;
        short loseWeight2 = 500;
        short kgInGr = 1000;
        int weightLoss1 = (needToReset * kgInGr) / loseWeight1;
        System.out.println(weightLoss1 + " дней уйдет на похудение, если спортсмен будет терять каждый день по " + loseWeight1 + " грамм");
        int weightLoss2 = (needToReset * kgInGr) / loseWeight2;
        System.out.println(weightLoss2 + " дней уйдет на похудение, если спортсмен будет терять каждый день по " + loseWeight2 + " грамм");
        long averageNumberOfDays = (weightLoss1 + weightLoss2) / 2;
        System.out.println(averageNumberOfDays + " дней в среднем нужно, чтобы добиться результата похудения");

        System.out.println();

        System.out.println("Задача 8");
        int MashaGets = 67760;
        int DenisGets = 83690;
        int KristinaGets = 76230;
        byte percentageIncrease = 10;
        byte monthsPerYear = 12;
        int MashaGets2 = ((MashaGets * percentageIncrease) / 100) + MashaGets;
        int DenisGets2 = ((DenisGets * percentageIncrease) / 100) + DenisGets;
        int KristinaGets2 = ((KristinaGets * percentageIncrease) / 100) + KristinaGets;
        int MashasAnnualIncome = (MashaGets2 * monthsPerYear) - (MashaGets * monthsPerYear);
        int DenissAnnualIncome = (DenisGets2 * monthsPerYear) - (DenisGets * monthsPerYear);
        int KristinasAnnuaIncome = (KristinaGets2 * monthsPerYear) - (KristinaGets * monthsPerYear);
        System.out.println("Маша теперь получает " + MashaGets2 + " рублей. Годовой доход вырос на " + MashasAnnualIncome + " рублей");
        System.out.println("Денис теперь получает " + DenisGets2 + " рублей. Годовой доход вырос на " + DenissAnnualIncome + " рублей");
        System.out.println("Кристина теперь получает " + KristinaGets2 + " рублей. Годовой доход вырос на " + KristinasAnnuaIncome + " рублей");
    }
}