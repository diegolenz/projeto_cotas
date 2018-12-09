package gui.modeltable;

import lib.model.cotas.Periodo;

import javax.swing.table.AbstractTableModel;

public class TableModelperiodo extends AbstractTableModel {


    public TableModelperiodo() {
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
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Periodo p = (Periodo) list[rowIndex];
        switch (columnIndex) {
            case 0:
                return p.getId();
            case 1 :
                return p.getDescricao();
            case 2:
                return p.getDtcheckin();
            case 3:
                return p.getDtcheckout();

        }
        return "";
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "codigo";
            case 1:
                return "descricao";
            case 2:
                return "check in";
            case 3:
                return "check out" ;
        }
        return "";
    }

}
