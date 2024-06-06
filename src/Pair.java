public class Pair <T, T2>{
    private T t;
    private T2 t2;

    public Pair(T t, T2 t2) {
        this.t = t;
        this.t2 = t2;
    }

    public T getFirst(){
        return t;
    }

    public T2 getSecond(){
        return t2;
    }

    public String toString(){
        return "First: " + t.toString() + ", Second: " + t2.toString();
    }
}
