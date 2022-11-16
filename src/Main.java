import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        logger.log("Запуск программы");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите размер массива:");
        int size = scanner.nextInt();
        logger.log("Получен размер массива: " + size);

        System.out.println("Введите максимальное значение в массиве:");
        int max = scanner.nextInt();
        logger.log("Получено максимальное значение в массиве: " + max);


        List<Integer> source = new ArrayList<>();
        Random random = new Random();

        logger.log("Начинаем генерацию массива");

        for (int i = 0; i < size; i++) {

            int a = random.nextInt(max);

            source.add(a);
            logger.log("В исходный массив добавлен элемент №" + i + " со значением " + a);
        }
        logger.log("Выводим на экран сгенерированный массив:");
        System.out.println("Полученный массив:");
        for (int i = 0; i < source.size(); i++) {

            System.out.print(source.get(i) + " ");
        }
        System.out.println();


        System.out.println("Введите пороговое значение для фильтрации массива:");
        int treshold = scanner.nextInt();
        logger.log("Получено пороговое значение для массива: " + treshold);

        Filter filter = new Filter(treshold);

        List<Integer> result = filter.filterOut(source);
        logger.log("Вывод итогового массива");
        System.out.println("Отфильтрованный список:");


        for (int i = 0; i < result.size(); i++) {

            System.out.print(result.get(i) + " ");
        }
        System.out.println();
        logger.log("Завершение работы программы");
    }
}