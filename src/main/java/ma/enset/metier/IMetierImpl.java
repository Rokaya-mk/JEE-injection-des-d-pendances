package ma.enset.metier;

import ma.enset.dao.DaoImpl;
import ma.enset.dao.IDao;

public class IMetierImpl implements IMetier {
    private IDao dao;

    public IMetierImpl() {}
    public IMetierImpl(IDao dao) {
        this.dao = dao;
    }
    @Override
    public double calcule() {
        return dao.getData() * 2;
    }


    public void setDao(DaoImpl dao) {
        this.dao = dao;
    }
}
