package by.it.group151051.makovetskiy.lesson02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/*
даны события events
реализуйте метод calcStartTimes, так, чтобы число включений регистратора на
заданный период времени (1) было минимальным, а все события events
были зарегистрированы.
Алгоритм жадный. Для реализации обдумайте надежный шаг.
*/

public class A_VideoRegistrator {

    public static void main(String[] args)  {
        A_VideoRegistrator instance = new A_VideoRegistrator();
        double[] events=new double[]{1, 1.1, 1.6, 2.2, 2.4, 2.7, 3.9, 8.1, 9.1, 5.5, 3.7};
        List<Double> starts=instance.calcStartTimes(events,1);
        System.out.println(starts);
    }
    List<Double> calcStartTimes(double[] events, double workDuration)  {
        List<Double> result = new ArrayList<>();
        int i=0;
        Arrays.sort(events);
        while (i < events.length) {
            result.add(events[i]);
            if (i != events.length -1) {
            while (events[i+1] > events[i] && events[i+1] < (int) events[i] + workDuration) i++;
            }
            i++;
        }
        return result;
    }
}
