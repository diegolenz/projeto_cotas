package gui.modeltable;

import lib.model.endereco.Endereco;

import javax.swing.table.AbstractTableModel;

public class TableModelEndereco extends AbstractTableModel {

    public TableModelEndereco() {
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
        Endereco p = (Endereco) list[rowIndex];
        switch (columnIndex) {
            case 0:
                return p.getBairro().getCidade().getNome();
            case 1:
                return p.getBairro().getNome();
            case 2:
                return p.getBairro().getCep();

        }
        return "";
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "cidade";
            case 1:
                return "bairro";
            case 2:
                return "cep";

        }
        return "";
    }

}