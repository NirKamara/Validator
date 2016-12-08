package factory;

import java.lang.reflect.Field;
import java.util.Random;

/**
 * Created by Evegeny on 08/12/2016.
 */
public class ObjectFactory {
    private Random random = new Random();

    public <T> T createObject(Class<T> type) throws Exception, InstantiationException {
        T o = type.newInstance();
        Field[] fields = type.getDeclaredFields();
        for (Field field : fields) {
            if (field.isAnnotationPresent(InjectRandomInt.class)) {
                InjectRandomInt annotation = field.getAnnotation(InjectRandomInt.class);
                int min = annotation.min();
                int max = annotation.max();
                int value = random.nextInt(max - min) + min;
                field.setAccessible(true);
                field.set(o,value);
            }
        }
        return o;
    }
}


