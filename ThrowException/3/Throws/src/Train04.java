// Объявить класс, который есть производным от класса Exception
// После этого данный класс есть частью системы исключений Java
class NegativeNumberException extends Exception {
    private double value;

    // конструктор класса
    NegativeNumberException(double _value) {
        value = _value;
    }

    // переопределенный метод toString() класса Throwable,
    // этот метод виводит информацию об исключении типа NegativeNumberException
    public String toString() {
        String msg = "Exception: " + value + " is a negative number!!!";
        return msg;
    }
}

// демонстрация исключения
class DemoThrows {
    int SumItems(int A[]) throws NegativeNumberException {
        int i, sum=0;
        for (i=0; i<10; i++) {
            // если индекс за пределами массива, то сгенерировать исключение
            if (i>A.length)
                throw new ArrayIndexOutOfBoundsException("Индекс за пределами массива.");
            if (A[i]<0)
                throw new NegativeNumberException((double)A[i]);
            sum += A[i];
        }
        return sum;
    }
}

public class Train04 {
    public static void main(String[] args) {
        // вызов метода SumItems из класса DemoThrows
        int M[] = { 1, -2, 3, 4, 5, 6, 7 };
        DemoThrows dt = new DemoThrows(); // создать екземпляр класса DemoThrows
        int summ=0;

        try {
            // вызвать метод, в котором генерируется
            // исключение NegativeNumberException
            summ = dt.SumItems(M);
        }
        catch (NegativeNumberException e) {
            System.out.println("Отрицательное число: "+e);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Перехвачено исключение: " + e);
        }
        finally {
            System.out.println("Summ = " + summ);
        }
    }
}
