package epam.com.generics;

/**
 * Created by Ermek_Abyshev on 4/7/2017.
 */
public class BoxPrinterGeneric<T> {

    private T val;

    public BoxPrinterGeneric(T val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return "BoxPrinter{" +
               "val=" + val +
               '}';
    }

    public void setVal(T val) {
        this.val = val;
    }

    public T getVal() {
        return val;
    }

    public static void main(String[] args) {
        BoxPrinterGeneric<Integer> value1 = new BoxPrinterGeneric<>(10);
        System.out.println(value1);
        Integer intValue1 = value1.getVal();
        BoxPrinterGeneric<String> value2 = new BoxPrinterGeneric<>("Hello world");
        System.out.println(value2);

        // Здесь программист допустил ошибку, присваивая
        // переменной типа Integer значение типа String.
        if ((value2.getVal() != null)) {
            String intValue2 = value2.getVal();
        }

        System.out.println(value1.getVal());
    }
}
