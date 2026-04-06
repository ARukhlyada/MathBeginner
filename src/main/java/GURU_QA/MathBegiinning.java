package GURU_QA;

public class MathBegiinning {
    public static void main(String[] args) {
        System.out.println("======= Java Basics для автотестировщика =======\n");

        //простая арфиметика
        System.out.println("Простая арфиметика");
        int x = 20, y = 7;
        System.out.println("20 + 7 = " + (x + y));
        System.out.println("20 - 7 = " + (x - y));
        System.out.println("20 * 7 = " + (x * y));
        System.out.println("20 / 7 = " + (x / y) + " (дробная часть отброшена)");
        System.out.println("20 % 7 = " + (x % y) + " (остаток от деления)\n");

        //Смешанная арифметика
        System.out.println("Смешанная арифметика (int + double):");
        int число = 10;
        double дробное_число = 4.5;
        System.out.println("10 + 4.5 = " + (число + дробное_число));
        System.out.println("10 - 4.5 = " + (число - дробное_число));
        System.out.println("10 * 4.5 = " + (число * дробное_число));
        System.out.println("10 / 4.5 = " + (число / дробное_число) + "\n");

        //Логические операции
        System.out.println("2. Логические операции (сравнения):");
        int score = 85;
        System.out.println("score > 90: " + (score > 90));
        System.out.println("score >= 80: " + (score >= 80));
        System.out.println("score < 60: " + (score < 60));
        System.out.println("score <= 100: " + (score <= 100));
        System.out.println("score == 85: " + (score == 85));
        System.out.println("score == 85: " + (score <= 85));
        System.out.println("score == 85: " + (score => 85));
        System.out.println("score != 0: " + (score != 0) + "\n");

        // Диапазоны
        System.out.println("Диапазоны типов данных:");
        System.out.println("int: от " + Integer.MIN_VALUE + " до " + Integer.MAX_VALUE);
        System.out.println("double: от " + Double.MIN_VALUE + " до " + Double.MAX_VALUE);

        //Переполнение
        System.out.println("Переполнение:");
        int max = Integer.MAX_VALUE;
        System.out.println("MAX_INT + 1 = " + (max + 1) + " (переполнение!)");

        double big = Double.MAX_VALUE;
        System.out.println("MAX_DOUBLE * 2 = " + (big * 2) + " (Infinity)");
    }
}
