package gui.modeltable;

import lib.model.pessoa.Pessoa;
import lib.model.pessoa.Pessoajuridica;

import javax.swing.table.AbstractTableModel;

public class TableModelHotel extends AbstractTableModel {


    public TableModelHotel() {
        // TODO Auto-generated constructor stub
        this.list = new Object[0];
    }


    protected Object list[];

    public Object[] getList() {
        return list;
    }

    public void setList(Object[] list) {
        this.list = list;
        this.fireTableDataChanged();
        Pessoajuridica p = new Pessoajuridica() {
            @Override
            public int hashCode() {
                return super.hashCode();
            }
        };

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
        Pessoa obj = (Pessoa) list[rowIndex];
        switch (columnIndex) {
            case 0:
                return obj.getId();
            case 1:
                return obj.getCpfCnpj();
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
                return "nome";
            case 3:
        }
        return "";
    }
}
