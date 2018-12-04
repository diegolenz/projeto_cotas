package gui.modeltable;

import lib.model.apartamento.Apartamento;
import lib.model.cotas.PessoaCota;

import javax.swing.table.AbstractTableModel;

public class TableModelApartamento extends AbstractTableModel {


    public TableModelApartamento() {
        // TODO Auto-generated constructor stub
        this.list = new Object[0];
    }





    protected Object list[];

    public Object[] getList() {
        return list;
    }

    public void setList(Object[] list){
        this.list = list;
        this.fireTableDataChanged();
    }

    @Override
    public int getRowCount() {
        return this.list.length;
    }

    @Override
    public int getColumnCount() {
        return 6;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Apartamento p = (Apartamento) list[rowIndex];
        switch (columnIndex) {
            case 0:
                return p.getId();
            case 1:
                return p.getNumero();
            case 2:

        }
        return "";
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "codigo";
            case 1:
                return "numerodo ap";
        }
        return "";
    }

}
