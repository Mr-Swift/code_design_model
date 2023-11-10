import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Field;

public class LoggerTest {
    Logger log = LoggerFactory.getLogger(LoggerTest.class);

    @Test
    public void test1() {
        com.apple.develop.Logger.Logger log = new com.apple.develop.Logger.Logger();
        log.log("hello\n");
    }

    @Test
    public void test2() throws NoSuchFieldException, IllegalAccessException {
        com.apple.develop.Logger.Logger log = new com.apple.develop.Logger.Logger();
        Field field=com.apple.develop.Logger.Logger.class.getDeclaredField("basePath");
        field.setAccessible(true);
        String path= (String) field.get(log);
        System.out.println(path);
    }
}
