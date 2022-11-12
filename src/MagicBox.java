import java.util.Random;

public class MagicBox<T> {

    private int namObj;

    private T[] arrObj;
    private Random random = new Random();

    public MagicBox(int namObj) {
        this.namObj = namObj;
        arrObj = (T[]) new Object[namObj];
    }

    public boolean add(T item) {
        boolean flag = true;
        for (int i = 0; i < arrObj.length; i++) {
            if (arrObj[i] == null) {
                arrObj[i] = item;
                flag = true;
                break;
            } else {
                flag = false;
            }
        }
        return flag;
    }

    public T pick() throws RuntimeException {
        for (T item : arrObj) {
            if (item == null) {
                throw new RuntimeException("Не полна коробочка!!!");
            }
        }
        return arrObj[random.nextInt(arrObj.length)];
    }

    public void printArr() {
        for (T obj : arrObj) {
            System.out.println(obj);
        }
        ;
    }

    public T[] getArr() {
        return arrObj;
    }

}


