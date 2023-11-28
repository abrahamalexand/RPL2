package springHibernate.service;

import springHibernate.dao.karyawanDAO;
import springHibernate.model.listkaryawan;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("KaryawanService")
@Transactional(readOnly = true)

public class karyawanServiceImpl implements karyawanService {
    @Autowired
    private karyawanDAO karyawansDao;
    
    @Transactional
    @Override
    public void save(listkaryawan karyawans) {
	karyawansDao.save(karyawans);
    }
    
    @Transactional
    @Override
    public void update(listkaryawan karyawans) {
	karyawansDao.update(karyawans);
    }
    
    @Transactional
    @Override
    public void delete(listkaryawan karyawans) {
	karyawansDao.delete(karyawans);
    }
    
    @Override
    public listkaryawan getKaryawan(String id) {
	return karyawansDao.getKaryawan(id);
    }
    
    @Override
    public List<listkaryawan> getKaryawan() {
	return karyawansDao.getKaryawan();
    }
}
