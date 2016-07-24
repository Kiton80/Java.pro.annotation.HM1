


import java.lang.reflect.Method;

/**
 * Created by Кирил on 20.07.2016.
 */
public class Main {
    public static void main(String[] args) {
        try {
            Class<?> cls = Sum.class;
            Method method = cls.getMethod("sum", int.class, int.class);

            if (method.isAnnotationPresent(Action.class)) {

                Action ann1 = method.getAnnotation(Action.class);
                method.invoke(null, ann1.a(), ann1.b());
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}
