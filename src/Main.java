
// 1. Написать класс Калькулятор (необобщенный), который содержит обобщенные статические методы: sum(), multiply(), divide(), subtract().
// Параметры этих методов – два числа разного типа, над которыми должна быть произведена операция. Методы должны возвращать результат своей работы.
// 2. Напишите обобщенный метод compareArrays(), который принимает два массива и возвращает true, если они одинаковые, и false в противном случае.
// Массивы могут быть любого типа данных, но должны иметь одинаковую длину и содержать элементы одного типа по парно по индексам.
// 3. Напишите обобщенный класс Pair, который представляет собой пару значений разного типа.
// Класс должен иметь методы getFirst(), getSecond() для получения значений каждого из составляющих пары, а также переопределение метода toString(),
// возвращающее строковое представление пары. Работу сдать в виде ссылки на гит репозиторий.


public class Main {
    public static void main(String[] args) {

        //задача 1
        System.out.println(Calculator.sum(10, 0.25));
        System.out.println(Calculator.multiply(10, 0.25));
        System.out.println(Calculator.divide(10, 0.25));
        System.out.println(Calculator.subtract(10, 0.25));

        //задача 2
        Object[] array1 = new Object[]{1, "два", 3.2};
        Object[] array2 = new Object[]{10, "три", 8.2};
        Object[] array3 = new Object[]{10, 3, 8.2};
        System.out.println(compareArrays(array1, array2));
        System.out.println(compareArrays(array1, array3));

        //задача 3
        Pair pair = new Pair(1, "One");
        pair.getFirst();
        pair.getSecond();
        System.out.println(pair.toString());
    }

    public static <T, T2> boolean compareArrays(T[] array1, T2[] array2){
        if(array1.length == array2.length){
            for (int i = 0; i < array1.length; i++) {
                if(array1[i].getClass().getName() != array2[i].getClass().getName()){
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}