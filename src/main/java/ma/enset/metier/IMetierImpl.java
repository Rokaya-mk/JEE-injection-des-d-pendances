package ma.enset.metier;

import ma.enset.dao.DaoImpl;
import ma.enset.dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IMetierImpl implements IMetier {
    private IDao dao;

    public IMetierImpl() {}

    @Autowired
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
