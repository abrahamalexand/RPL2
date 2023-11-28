package springHibernate.dao;

import springHibernate.model.listkaryawan;
import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class karyawanDAOImpl implements karyawanDAO {
    @Autowired
    private SessionFactory sessionFactory;
    
    @Override
    public void save(listkaryawan karyawans) {
	sessionFactory.getCurrentSession().save(karyawans);
    }
    
    @Override
    public void update(listkaryawan karyawans) {
	sessionFactory.getCurrentSession().update(karyawans);
    }
    
    @Override
    public void delete(listkaryawan karyawans) {
	sessionFactory.getCurrentSession().delete(karyawans);
    }
    
    @Override
    public listkaryawan getKaryawan(String nama) {
	return (listkaryawan) sessionFactory.getCurrentSession().get(listkaryawan.class, nama);
    }

    @Override
    public List<listkaryawan> getKaryawan() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
