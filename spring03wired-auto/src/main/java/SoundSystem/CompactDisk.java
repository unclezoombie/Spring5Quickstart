package SoundSystem;

import org.springframework.stereotype.Component;

/**
 * Created by Erick 2020.04.27:14:59
 */
//@Component
public class CompactDisk {

    public CompactDisk() {
        super();
        System.out.println("CompactDisk with NO parameter constructor!");
    }

    public void play() {
        System.out.println("CompactDisk: music is playing ...");
    }
}
