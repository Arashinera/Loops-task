package app;

import java.util.Scanner;
import java.util.Locale;

//Домашнє завдання
//
//        Loops
//        -------
//        Є діапазон чисел від 1 до 6, включно.
//        За допомогою циклу розрахуйте суму чисел наростаючим підсумком
//        та загальну суму чисел.
//        Виведення окремого пункту переліку чисел має бути пронумероване.
//        Виведення має такий вигляд:
//
//        1) Num is 1, sum is 1
//        2) Num is 2, sum is 3
//        3) Num is 3, sum is 6
//        4) Num is 4, sum is 10
//        5) Num is 5, sum is 15
//        6) Num is 6, sum is 21
//        ------------------------
//        Sum of numbers is 21

public class Main {

    //Створюємо глобальні змінні;
    static int num;
    static int sum;

    public static void main(String[] args) {

        //Налаштовуємо сканер та локейл :
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.ENGLISH);

        //Створюємо перевірку через do while :
        do {
            System.out.println("Input number from 1 to 100 : ");
            num = input.nextInt();
        } while (num < 1 || num > 100);

        //Записуємо нуль у змінну sum щоб прибрати сміття :
        sum = 0;

        //Створюємо цикл :
        for (int i = 1; i <= num; i++){
            sum = sum + i;
            System.out.printf("%d) Num is %d, sum is %d%n", i, i, sum);
        }

        //Виводимо підсумки :
        System.out.printf("%nSum of numbers is %d%n", sum);

    }
}
