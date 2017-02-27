import ru.ifmo.ctddev.Zemtsov.walk.ArraySet;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Vlad on 27.02.2017.
 */
public class main {

    public static void main(String[] args) {
        Class c = ArraySet.class;
        for (Field m : c.getDeclaredFields()) {
            System.out.println(m);
        }
        for (Constructor m : c.getDeclaredConstructors()) {
            System.out.println(m);
        }
        for (Method m : c.getDeclaredMethods()) {
            System.out.println(m);
        }
    }
}
