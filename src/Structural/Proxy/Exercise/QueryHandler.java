package Structural.Proxy.Exercise;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class QueryHandler implements InvocationHandler {
    private final Object target;
    private int queries = 0, insertions = 0;
    
    QueryHandler(Object target) {
        this.target = target;
    }
    
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if (method.getName().contains("get")) {
            ++queries;
        } else if (method.getName().contains("insert")) {
            ++insertions;
        }
    
        System.out.print("queries = " + queries);
        System.out.println(", inserts = " + insertions);
        return method.invoke(target, args);
    }
    
    public static <T> T withQueryCounter(T target, Class<T> tClass) {
        return (T) Proxy.newProxyInstance(tClass.getClassLoader(), new Class<?>[]{tClass}, new QueryHandler(target));
    }
}
