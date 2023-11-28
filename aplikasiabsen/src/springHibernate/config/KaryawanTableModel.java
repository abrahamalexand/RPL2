package springHibernate.config;

import springHibernate.model.listkaryawan;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class KaryawanTableModel extends AbstractTableModel {
     private List<listkaryawan> karyawans = new ArrayList<>();
    private final String HEADER[] = {"nama", "id", "bidang"};
    
    public KaryawanTableModel(List<listkaryawan> karyawans) {
	this.karyawans = karyawans;
    }
    
    @Override
    public int getRowCount() {
	return karyawans.size();
    }
    
    @Override
    public int getColumnCount() {
	return HEADER.length;
    }
    
    @Override
    public String getColumnName(int columnIndex) {
	return HEADER[columnIndex];
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
	listkaryawan karyawan = karyawans.get(rowIndex);
            switch (columnIndex) {
		case 0:
                    return karyawan.getNama();
		case 1:
                    return karyawan.getID();
		case 2:
                    return karyawan.getBidang();
		default:
                    return null;
		}
    }
}
