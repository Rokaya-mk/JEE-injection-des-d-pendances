package ma.enset.dao;

public class DaoImpl implements IDao {
    @Override
    public double getData() {
        System.out.println("version bd");
        return 20;
    }
}
