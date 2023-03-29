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

        /* Задание третье: Вывести на экран текст в таком виде одним методом:
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
    }
}