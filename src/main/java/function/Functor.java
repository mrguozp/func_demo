package function;

import java.util.function.Function;

/**
 * Created by Mrguozp on 2017/1/21.
 */
public interface Functor<T,F extends Functor<?,?>> {
    <R> F map(Function<T,R> f);
}
