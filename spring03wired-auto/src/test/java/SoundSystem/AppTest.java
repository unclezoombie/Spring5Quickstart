package SoundSystem;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Erick 2020.04.28:11:01
 */

public class AppTest {
    @Test
    public void testPlay() {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        CDPlayer cdPlayer = context.getBean(CDPlayer.class);
        cdPlayer.play();
    }
}
