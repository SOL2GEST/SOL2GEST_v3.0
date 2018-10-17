
import java.awt.Color;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bsabaron
 */
public class ChangeTableModelBDC implements TableModelListener {
    
    public static JTable tab;
    public static JTextField montantTot;

    public ChangeTableModelBDC(JTable tab, JTextField montantTot) {
        super();
        this.tab=tab;
        this.montantTot=montantTot;
    }

    @Override
    public void tableChanged(TableModelEvent e) {
        try{
            int qtt=(int) tab.getValueAt(e.getFirstRow(), 1);
            float prixU=(float) tab.getValueAt(e.getFirstRow(), 3);
            float montant=arrondiCalcul(qtt*prixU);           
            tab.getModel().removeTableModelListener(this);
            tab.getModel().setValueAt(montant, e.getFirstRow(), 4);
            tab.getModel().addTableModelListener(this);
            montantTot.setText(Float.toString(calculMontantTotal((DefaultTableModel) tab.getModel()))+" €");
        }catch(Exception ex){
        }
    }
//    @Override
//    public void tableChanged(TableModelEvent e) {
//        try{
//            tab.getCellRenderer(tab.getSelectedRow(), tab.getSelectedColumn()).getTableCellRendererComponent(tab, e, true, true, tab.getSelectedRow(), tab.getSelectedColumn()).setBackground(Color.white);
//        }catch(Exception ex){
//        }
//        try{
//            int qtt=(int) tab.getValueAt(e.getFirstRow(), 1);
//        }catch(Exception ex){
//            tab.getCellRenderer(tab.getSelectedRow(), tab.getSelectedColumn()).getTableCellRendererComponent(tab, e, true, true, tab.getSelectedRow(), tab.getSelectedColumn()).setBackground(Color.red);
//        }
//        try{
//            float prixU=(float) tab.getValueAt(e.getFirstRow(), 3);
//        }catch(Exception ex){
//            tab.getCellRenderer(tab.getSelectedRow(), tab.getSelectedColumn()).getTableCellRendererComponent(tab, e, true, true, tab.getSelectedRow(), tab.getSelectedColumn()).setBackground(Color.red);
//        }
//        try{
//            int qtt=(int) tab.getValueAt(e.getFirstRow(), 1);
//            float prixU=(float) tab.getValueAt(e.getFirstRow(), 3);
//            float montant=arrondiCalcul(qtt*prixU);           
//            tab.getModel().removeTableModelListener(this);
//            tab.getModel().setValueAt(montant, e.getFirstRow(), 4);
//            tab.getModel().addTableModelListener(this);
//            montantTot.setText(Float.toString(calculMontantTotal((DefaultTableModel) tab.getModel()))+" €");
//        }catch(Exception ex){
//        }
//    }
    
    public float calculMontantTotal(DefaultTableModel model){
        float montantTotal = 0;
        for(int i=0;i<tab.getRowCount();i++){
            montantTotal=montantTotal+(float)model.getValueAt(i, 4);
        }
        return arrondiCalcul(montantTotal);
    }
    
    public float arrondiCalcul(float nombre){
        float arrondi = (float) Math.round(nombre * 100) / 100;
        return arrondi;
    }
}
