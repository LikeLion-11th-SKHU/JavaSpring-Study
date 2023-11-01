package happy_java_05;

public class GenericBox<T> { // 보통 type의 T 사용
    private T t;

    public void add(T obj) {
        this.t = obj;
    }

    public T get() {
        return this.t;
    }
}