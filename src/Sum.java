/**
 * Created by Кирил on 20.07.2016.
 */
public class Sum {
    @Action(a = 15, b = 5)
    public static void sum(int a, int b) {
        System.out.println("a + b = " + (a + b)+".");
    }
}
