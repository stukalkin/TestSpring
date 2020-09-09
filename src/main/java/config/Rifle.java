package config;

public interface Rifle {
    void fire();
    Bullet getBullet();
    void setBullet(Bullet bullet);
    void empting();
    boolean isEmpty();
    void reloading(Bullet bullet);
}