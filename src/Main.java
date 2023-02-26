import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        Scanner scanner = new Scanner(System.in);


        logger.log("Запуск программы");
        logger.log("Введите входные данные для списка \n" +
                "Введите размер списка:");
        int size = scanner.nextInt();
        System.out.println("Введите верхнюю границу для значений:");
        int limit = scanner.nextInt();
        logger.log("Создаём и наполняем список");
        List<Integer> list = buildList(size, limit);
        System.out.print("Вот случайный список: ");
        printList(list);
        logger.log("Введите входные данные для фильтрации \n" +
                "Введите порог для фильтра:");
        int numForFil = scanner.nextInt();
        logger.log("Запускаем фильтрацию");
        Filter filter = new Filter(numForFil);
        List<Integer> newList = filter.filterOut(list);
        logger.log("Фильтрация завершена");
        System.out.print("Отфильтрованный список: ");
        printList(newList);
        logger.log("Завершаем программу");

    }

    public static List<Integer> buildList(int size, int limit) {
        Random random = new Random();
        List<Integer> list = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            list.add(random.nextInt(limit) + 1);
        }
        return list;
    }

    public static void printList(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            if (i != list.size() - 1) {
                System.out.print(list.get(i) + " ");
            } else {
                System.out.println(list.get(i));
            }
        }
    }
}