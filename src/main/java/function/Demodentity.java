package function;

import java.util.function.Function;

/**
 * Created by Mrguozp on 2017/1/21.
 */
public class Demodentity<T> implements Functor<T, Demodentity<?>> {
    private final T value;

    public Demodentity(T value) { this.value = value; }

    public <R> Demodentity<R> map(Function<T,R> f) {
        final R result = f.apply(value);
        return new Demodentity<>(result);
    }
}
