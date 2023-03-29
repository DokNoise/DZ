import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        /*Первое задание: Объявить три переменные типа int и присвоить первой числовое значение,
        вторая переменная равна первой переменной увеличенной на 3, а третья переменная
        равна сумме первых двух.*/

        int intOdin = 8;
        int intDva = intOdin + 3;
        int intTri = intOdin + intDva;

        /*Второе задание: Создайте 4 переменные с разными типами данных и
        предложите пользователю ввести в них значения.
        После ввода, отобразите их на экране.*/

        int intZd2;
        short shortZd2;
        byte byteZd2;
        float floatZd2;
        Scanner in = new Scanner(System.in);
        intZd2 = in.nextInt();
        shortZd2 = in.nextShort();
        byteZd2 = in.nextByte();
        floatZd2 = in.nextFloat();
        System.out.println(intZd2);
        System.out.println(shortZd2);
        System.out.println(byteZd2);
        System.out.println(floatZd2);

        /* Третье задание: Вывести на экран текст в таком виде одним методом:
	Не те
	бляди,
	что хлеба
	ради
	спереди
	и сзади
	дают нам
	ебти,
	Бог их прости!
	А те бляди -
	лгущие,
	деньги
	сосущие,
	еть
	не дающие -
	вот бляди
	сущие,
	мать их ети!
			(c) В. В. Маяковский */

        System.out.println("Не те\nбляди,\nчто хлеба\nради\nспереди\nи сзади\nдают нам\nебти,\nБог их прости!\nА те бляди -\nлгущие,\nденьги\nсосущие,\nеть\nне дающие -\nвот бляди\nсущие,\nмать их ети!");

       /* Четвёртое задание: Пользователь должен ввести 2 числа.
        вам надо показать на экран произведение этих чисел, сумму и разницу.
        Покажите так же среднее арифметическое этих введенных чисел.*/

        float floatZd41 = in.nextFloat();
        float floatZd42 = in.nextFloat();
        System.out.println(floatZd41*floatZd42);
        System.out.println(floatZd41+floatZd42);
        System.out.println(floatZd41-floatZd42);
        System.out.println((floatZd41+floatZd42)/2);

        /* Пятое задание: Пользователь вводит номер английской заглавной буквы в ASCII.
        Вывести эту букву маленькую букву, оставив её заглавную версию в переменной.*/

        char charZd5 = (char) in.nextInt(); // От 65 до 90
        System.out.println((char)(charZd5+32));

        /* Шестое задание: Пусть цена товара A обычно составляет 1000 руб, и товара B составляет 500 руб.
        Если клиент покупает товары вместе, то на них действует скидка 10% на всю покупку.
        Выведите на экран переменную, которая стоимости суммы A+B со скидкой. Отдельно выведите на экран сумму скидки от этой покупки.*/

        int intZd61 = 1000;
        int intZd62 = 500;
        float floatZd6 = intZd61 + intZd62 - (intZd61 + intZd62) / 10;
        System.out.println(floatZd6);
        System.out.println((intZd61 + intZd62) / 10);

        /* Седьмое задание: Объявите 10 переменных типа int со значениями 0,1, 2, 3, 4, 5, 6, 7, 8, 9.
        Объявите ещё одну переменную и сохраните в неё сумму этих переменных, деленную на 10.*/

        int intZd101 = 0;
        int intZd102 = 1;
        int intZd103 = 2;
        int intZd104 = 3;
        int intZd105 = 4;
        int intZd106 = 5;
        int intZd107 = 6;
        int intZd108 = 7;
        int intZd109 = 8;
        int intZd1010 = 9;
        float floatZd10 = (intZd101 + intZd102 + intZd103 + intZd104 + intZd105 + intZd106 + intZd107 + intZd108 + intZd109 + intZd1010);
        floatZd10 /= 10;
    }
}