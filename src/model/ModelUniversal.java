
package model;


import java.awt.Dimension;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JComboBox;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.table.TableRowSorter;
import org.jdesktop.swingx.JXSearchField;
import view.compras.Compras;

public class ModelUniversal {
    
    public void centerJIF(JDesktopPane mainPanel, JInternalFrame jif){
        //JDesktopPane mainPanel = null;
        Dimension desktopSize = mainPanel.getSize();
        Dimension jInternalFrameSize = jif.getSize();
        int xSize = (desktopSize.width - jInternalFrameSize.width)/2;
        int ySize = (desktopSize.height - jInternalFrameSize.height)/2;
        jif.setLocation(xSize, ySize);
    }
    
    public void centerJCBox(JComboBox<String> jcb){
        DefaultListCellRenderer dlcr = new DefaultListCellRenderer();
        dlcr.setHorizontalAlignment(DefaultListCellRenderer.CENTER);
        jcb.setRenderer(dlcr);
    }
    
//    public int numDatosTabla(JTable table){
//        int numProveedores = 0;
//
//        for (int i = 0; i < table.getRowCount(); i++) {
//            numProveedores = 1 + i;
//        }
//        return numProveedores;
//    }
    
    public int numeroDatosTabla(JTable table){
        int numDatos = 0;
        for (int i = 0; i < table.getRowCount(); i++) {
            numDatos = 1 + i;
        }
        return numDatos;
    }
    
    public void validarDatosRepetidos(JTextField textField, JTable table, int columna, String nombre){
        String dato = textField.getText();
        for (int i = 0; i < table.getRowCount(); i++) {
            if (table.getValueAt(i, columna).equals(dato)) {
                JOptionPane.showMessageDialog(null, "El "+nombre+" ya exixte");
                textField.setText("");
                textField.requestFocus();
            }
        }
    }

   
    
    public void ocultarColumnas(JTable table, int numColumna){
        table.getColumnModel().getColumn(numColumna).setMaxWidth(0);
        table.getColumnModel().getColumn(numColumna).setMinWidth(0);
        table.getColumnModel().getColumn(numColumna).setPreferredWidth(0);
    }
    
    public static String formatoDecimal(double number) {
        NumberFormat numberFormat = new DecimalFormat("#,###.00");
        numberFormat.format(number);
        return numberFormat.format(number);
    }
}
