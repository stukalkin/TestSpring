package config;

import org.springframework.beans.factory.annotation.Value;

public class RifleImpl implements Rifle {
    public Bullet bullet;
    @Value("false")
    private boolean empty;

    @Override
    public void reloading(Bullet bullet) {
        empty = false;
        setBullet(bullet);
    }

    public RifleImpl() {
    }

    public RifleImpl (Bullet bullet) {
        this.bullet = bullet;
    }

    public void fire(){
        System.out.println("TRA - TA - TA");
        bullet.processing();
    }

    public Bullet getBullet() {
        return bullet;
    }

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
}
