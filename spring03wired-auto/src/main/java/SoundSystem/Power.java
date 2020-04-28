package SoundSystem;

import org.springframework.stereotype.Component;

@Component
public class Power {

    public Power() {
        super();
        System.out.println("Power with NO parameter constructor!");
    }

    public void supply() {
        System.out.println("Power is supplying ...");
    }

}
