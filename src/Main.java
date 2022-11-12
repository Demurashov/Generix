import java.util.Arrays;

public class Main<T> {
    private static String[] arrStr1 = {"Гвозди", "Молоток"};
    private static String[] arrStr = {"Вася", "Петя", "Даша", "Маша"};
    private static Integer[] arrInt = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    public static void main(String[] args) {

        MagicBox<String> box1 = new MagicBox<String>(3);//задаем размер коробки 1 стрингов
        MagicBox<Integer> box2 = new MagicBox<>(10);//задаем размер коробки 2 интов
        for (String item : arrStr1) {
            System.out.println(item + " " + box1.add(item)); //кладем в коробку стринги
        }
        for (Integer item : arrInt) {
            System.out.println(item + " " + box2.add(item)); //кладем в коробку инты
        }
        //демонстрация работы интов
        System.out.println("В коробке 2 интов лежит:");
        Object[] arrObjInt = box2.getArr();
        System.out.println(Arrays.toString(arrObjInt));
        System.out.println(box2.pick());

        //демонстрация работы стрингов
        System.out.println("В коробке 1 стрингов лежит:");
        Object[] arrObjStr = box1.getArr();
        System.out.println(Arrays.toString(arrObjStr));
        System.out.println(box1.pick());


    }


}
