package Draft;

import java.util.function.Function;

public class Some2 {

    public static void main(String[] args) {
        Function<String, Integer> f = s -> s.length();
        int i = f.apply("xxx");
        System.out.println(i);
    }
}



class P<T> {
    T t;

    public P(T t) {
        this.t = t;
    }
}


class C<T> extends P<T> {
    public C(T t) {
        super(t);
    }
}
