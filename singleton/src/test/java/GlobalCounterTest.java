import com.apple.develop.GlobalCounter;
import lombok.extern.java.Log;
import org.junit.Test;


@Log
public class GlobalCounterTest {

    @Test
    public void test1() {
        GlobalCounter globalCounter = GlobalCounter.getInstance();
        long id = globalCounter.getId();
        log.info("id: " + id);

        id = globalCounter.getId();
        log.info("id: " + id);

    }

    @Test
    public void test2() {
        GlobalCounter globalCounter = GlobalCounter.getInstance();
        long id = 0L;

        for (int i = 0; i < 10; i++) {
            id = globalCounter.getId();
            log.info("第"+(i+1)+"次id: " + id);
        }
    }
}
