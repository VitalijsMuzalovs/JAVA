// Объявить класс, который есть производным от класса Exception
// Данный класс есть частью системы исключений Java
class NegativeNumberException extends Exception {
    private double value;

    // некоторый конструктор класса
    NegativeNumberException(double _value) {
        value = _value;
    }

    // переопределенный метод toString() класса Throwable,
    // этот метод выводит информацию об исключении типа NegativeNumberException
    public String toString() {
        String msg = "Exception: " + value + " is a negative number!!!";
        return msg;
    }
}

class Train04 {
    public static void main(String[] args) {
        // демонстрируется генерирование исключения типа NegativeNumberException
        double value;

        try {
            value = -5; // отрицательное число

            // если отрицательное значение,
            // то сгенерировать исключение типа NegativeNumberException
            if (value<0)
                throw new NegativeNumberException(value);
        }
        catch (NegativeNumberException e) {
            // вывести информацию об исключении
            // вызывается метод toString() класса NegativeNumberException
            System.out.println(e);
        }
    }
}