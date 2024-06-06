public class Calculator {
    public static <T extends Number, T2 extends Number> double sum(T t, T2 t2){
        return t.doubleValue() + t2.doubleValue();
    };

    public static <T extends Number, T2 extends Number> double multiply(T t, T2 t2){
        return t.doubleValue() * t2.doubleValue();
    };

    public static <T extends Number, T2 extends Number> double divide(T t, T2 t2){
        return t.doubleValue() / t2.doubleValue();
    };

    public static <T extends Number, T2 extends Number> double subtract(T t, T2 t2){
        return t.doubleValue()- t2.doubleValue();
    };
}
