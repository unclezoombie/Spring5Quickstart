package SoundSystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Erick 2020.04.27:14:59
 */
@Component
public class CDPlayer {
//    @Autowired
    private Power power;
//    @Autowired
    private CompactDisk cd;

    public CDPlayer() {
        super();
        System.out.println("CDPlayer with NO parameter constructor!");
    }

    @Autowired
    public CDPlayer(Power power, CompactDisk cd) {
        this.power = power;
        this.cd = cd;

        System.out.println("CDPlayer constructor with 2 parameter [" +cd +"] & [" +power +"]!");
    }

    //    @Autowired
//    public CDPlayer(CompactDisk cd) {
//        super();
//
//        this.cd = cd;
//
//        System.out.println("CDPlayer constructor with parameter [" +cd +"]!");
//    }

    public void play() {
        power.supply();
        cd.play();
    }
}
