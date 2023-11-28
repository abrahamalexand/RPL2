package springHibernate.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

public class listkaryawan {
    @Column(name = "nama_kry", length = 100)
    private  String nama;
    
    @Id
    @Column(name = "id_kry", length = 16)
    private  String id;
    
    @Column(name = "bidang_kry", length = 100)
    private  String bidang;
    
    public listkaryawan(String nama, String id, String bidang) {
        this.nama = nama;
        this.id = id;
        this.bidang = bidang;
    }
    
    public String getNama() {
        return nama;
    }
    
    public String getID() {
        return id;
    }
    
    public String getBidang() {
        return bidang;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setBidang(String bidang) {
        this.bidang = bidang;
    }
    
}
