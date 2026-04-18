package ma.enset.pres;

import ma.enset.dao.IDao;
import ma.enset.metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.util.Scanner;

public class PresXml {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext
                ("appContext.xml");

        IMetier metier = (IMetier) context.getBean("metier");

        System.out.println("Res = " + metier.calcule());
    }
}
