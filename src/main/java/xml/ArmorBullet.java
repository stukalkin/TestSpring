package xml;

import org.springframework.stereotype.Component;

@Component("bullet")
public class ArmorBullet implements Bullet{
    @Override
    public void processing() {
        System.out.println("Armor bullet shot");
    }
}
