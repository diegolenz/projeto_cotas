package gui.modeltable;

import lib.model.bloco.Bloco;

import javax.swing.table.AbstractTableModel;

public class TableModelBloco extends AbstractTableModel {
    public TableModelBloco() {
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
        Bloco obj = (Bloco) list[rowIndex];
        switch (columnIndex) {
            case 0:
                return obj.getId();
            case 1:
                return obj.getDescricao();
            case 3:
                return obj.getHotel().getNome();

        }
        return "";
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "id";
            case 1:
                return "numero";
            case 2:
                return "descricao";


        }
        return "";
    }

}
