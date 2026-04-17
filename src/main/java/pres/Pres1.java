package pres;

import dao.DaoImpl;
import metier.IMetierImpl;

public class Pres1 {
    public static void main(String[] args) {
        DaoImpl d = new  DaoImpl();
        IMetierImpl metier = new IMetierImpl(d);

        System.out.println("couplage for, res :"+ metier.calcule());
    }
}
