package gui.modeltable;

import lib.model.apartamento.Apartamento;
import lib.model.cotas.Cota;

import javax.swing.table.AbstractTableModel;

public class TableModelCota extends AbstractTableModel {


    public TableModelCota() {
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
        return 3;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Cota p = (Cota) list[rowIndex];
        switch (columnIndex) {
            case 0:
                return p.getId();
            case 1:
                return p.getDescricao();
            case 2:
                return p.getTitular().getPessoa().getNome();


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
                return "titular";
            case 3:
                return "bloco";
            case 4:
                return "hotel";
        }
        return "";
    }

}
