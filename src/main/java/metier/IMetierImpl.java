package metier;

import dao.IDao;

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


}
