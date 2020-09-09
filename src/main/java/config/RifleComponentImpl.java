package config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("rifleComponent")
//@Scope("prototype")
public class RifleComponentImpl implements Rifle{
    private Bullet bullet;
    @Value("false")
    private boolean empty;

    public void fire(){
        if (empty) {
            System.out.println("Need to reload");
            return;
        }
        System.out.println("TRA - TA - TA");
        bullet.processing();
        empting();
    }

    public Bullet getBullet() {
        return bullet;
    }

    @Autowired
//    @Autowired(required = false)
    @Qualifier("tracerBullet")
    public void setBullet(Bullet bullet) {
        this.bullet = bullet;
    }

    @Override
    public void empting() {
        this.empty = true;
    }

    @Override
    public boolean isEmpty() {
        return empty;
    }

    @Override
    public void reloading(Bullet bullet) {
        empty = false;
        setBullet(bullet);
    }
}
