package xml;

public class RifleImpl implements Rifle{
    public Bullet bullet;

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
}
