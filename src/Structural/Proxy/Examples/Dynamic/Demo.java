package Structural.Proxy.Examples.Dynamic;

import java.lang.reflect.Proxy;

class Demo {
    public static <T> T withLogging(T target, Class<T> tClass) {
        return (T) Proxy.newProxyInstance(tClass.getClassLoader(), new Class<?>[]{tClass}, new LoggingHandler(target));
    }
    
    public static void main(String[] args) {
        Person person = new Person();
        Human logged = withLogging(person, Human.class);
        logged.walk();
        logged.talk();
        logged.talk();
        
        System.out.println(logged);
    }
}
