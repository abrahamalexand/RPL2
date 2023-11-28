package springHibernate.controll;
import springHibernate.model.listkaryawan;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class controllerKaryawan {
   ArrayList<listkaryawan> ArrayData;
   DefaultTableModel tablelist;
   
   public controllerKaryawan(){
       ArrayData = new ArrayList<listkaryawan>();
   }
   public void InsertData(String nama, String id, String bidang){
       listkaryawan kry = new listkaryawan(nama, id, bidang);
       ArrayData.add(kry);
   }
   
   public boolean updateData(int index, String nama, String id, String bidang) {
        if (index >= 0 && index < ArrayData.size()) {
            listkaryawan kry = ArrayData.get(index);
            kry.setNama(nama);
            kry.setId(id);
            kry.setBidang(bidang);
            return true;
        }
        return false;
    }
   
   public DefaultTableModel showData(){
       String[] kolom = { "Nama", "ID", "Bidang"};
       Object[][] objData = new Object[ArrayData.size()][3];
       int i = 0;
       
       for(listkaryawan n : ArrayData){
           String[] arrData = {n.getNama(), n.getID(), n.getBidang()};
           objData[i] = arrData;
           i++;
       }
       tablelist = new DefaultTableModel(objData, kolom){
            public boolean inCellEditTable(int rowIndex, int colIndex){
                return false;
            }
        };
   
   
   return tablelist;
   }
}
