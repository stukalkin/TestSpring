package config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SoldierConfig {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

//        Rifle rifle = context.getBean("rifle", Rifle.class);
//        rifle.fire();

        Rifle rifleComponentNew = context.getBean("rifleComponent", Rifle.class);
        rifleComponentNew.fire();
        rifleComponentNew.fire();

        Rifle rifleComponentNew2 = context.getBean("rifleComponent", Rifle.class);
        rifleComponentNew2.fire();
        rifleComponentNew2.fire();

        rifleComponentNew.reloading(new ArmorBullet());
        rifleComponentNew.fire();
        rifleComponentNew.fire();

        rifleComponentNew.reloading(new TracerBullet());
        rifleComponentNew2.fire();
        rifleComponentNew2.fire();
    }
}
