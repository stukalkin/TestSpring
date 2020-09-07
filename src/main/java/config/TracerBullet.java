package config;

import org.springframework.stereotype.Component;

@Component("tracerBullet")
public class TracerBullet implements Bullet {
    @Override
    public void processing() {
        System.out.println("Tracer bullet shot");
    }
}
