package ma.enset.pres;

import ma.enset.metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Presentation {
    public static void main(String[] args){

        ApplicationContext ctx = new AnnotationConfigApplicationContext
                ("ma.enset.dao", "ma.enset.metier");
        IMetier metier = ctx.getBean(IMetier.class);
        System.out.println(metier.calcule());
    }
}
