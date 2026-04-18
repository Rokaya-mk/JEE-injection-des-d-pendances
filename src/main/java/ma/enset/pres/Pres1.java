package ma.enset.pres;

import ma.enset.dao.DaoImpl;
import ma.enset.dao.IDao;
import ma.enset.metier.IMetier;
import ma.enset.metier.IMetierImpl;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.util.Scanner;

public class Pres1 {
    public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {

        Scanner scanner = new Scanner(new File("config.txt"));

        //DaoImpl d = new  DaoImpl();
        String daoClassName = scanner.nextLine();
        Class cDao = Class.forName(daoClassName);
        IDao d = (IDao) cDao.newInstance();
        //IMetierImpl metier = new IMetierImpl(d);
        String metierClassName = scanner.nextLine();
        Class cMetier = Class.forName(metierClassName);
        IMetier metier =(IMetier) cMetier.getConstructor(IDao.class).newInstance(d);

        System.out.println("couplage faible, res :"+ metier.calcule());
    }
}
