import java.util.*;

public class Task {
    public static void main(String[] args) {
        Random random = new Random();

        ArrayList<Integer> list = new ArrayList<>(100); // Задаем новый список и выделяем память по 100 элементов после и заполняем его рандомными числами от 0 до 100
        for(int i = 0; i < 100; i++){
            list.add(i, random.nextInt(100));
        }
        System.out.println("Изначальный список: ");
        System.out.println(list);
        System.out.println("-".repeat(20));

        ArrayList<Integer> tmpList = new ArrayList<>();

    // ==================================================
    // Удаляем из него чётные числа

        for(int i = 0; i < list.size(); i++){
            if(list.get(i) % 2 == 0){
                tmpList.add(list.get(i));
            }
        }
        list.removeAll(tmpList);
        System.out.println("Список без четных чисел: ");
        System.out.println(list);
        System.out.println("-".repeat(20));

    // ==================================================
    // Находим минимальное значение

        int min = list.get(0);
        for(int i = 0; i < list.size()-1; i++){
            if(min > list.get(i+1)){
                min = list.get(i+1);
            }
        }
        System.out.print("Минимальное значение в списке: ");
        System.out.println(min);
        System.out.println("-".repeat(20));

    // ==================================================
    // Находим максимальное значение

        int max = list.get(0);
        for(int i = 0; i < list.size()-1; i++){
            if(max < list.get(i+1)){
                max = list.get(i+1);
            }
        }
        System.out.print("Максимальное значение в списке: ");
        System.out.println(max);
        System.out.println("-".repeat(20));

    // ==================================================
    // Находим среднее значение

        int tmp = 0;
        for (int i: list) {
            tmp += i;
        }
        float average = (float) tmp / list.size();
        System.out.printf("Среднее значение: %.2f %n", average);
    }
}
