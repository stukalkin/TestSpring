package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("config")
public class AppConfig {

//    @Bean(name = "bullet")
//    public Bullet bullet(){
//        return new TracerBullet();
//    }

    @Bean(name = "rifle")
    public Rifle rifle (Bullet bullet){
        return new RifleImpl(bullet);
    }
}
