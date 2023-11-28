/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package springHibernate.service;

import springHibernate.model.listkaryawan;
import java.util.List;

public interface karyawanService {
    public void save(listkaryawan karyawans);
    public void update(listkaryawan karyawans);
    public void delete(listkaryawan karyawans);
    public listkaryawan getKaryawan(String id);
    public List<listkaryawan> getKaryawan();
}