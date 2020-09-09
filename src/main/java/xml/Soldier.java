package xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Soldier {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        Rifle rifle = context.getBean("rifle", Rifle.class);
        rifle.fire();

        RifleImpl rifleImpl = context.getBean("rifle", RifleImpl.class);
        System.out.println(rifle == rifleImpl);

        Rifle rifleInnerBean = context.getBean("rifleInnerBean", Rifle.class);
        rifleInnerBean.fire();


        Rifle rifleConstructor = context.getBean("rifleConstructor", Rifle.class);
        rifleConstructor.fire();

//        xml.ArmorBullet aBullet = new xml.ArmorBullet();
//        xml.Rifle rifle = new xml.Rifle(aBullet);
//        rifle.fire();
//
//        xml.TracerBullet tBullet = new xml.TracerBullet();
//        rifle.setBullet(tBullet);
//        rifle.fire();
    }
}