package gui.modeltable;

import lib.model.hotel.Hotel;
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
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Hotel obj = (Hotel) list[rowIndex];
        switch (columnIndex) {
            case 0:
                return obj.getId();
            case 1:
                return obj.getRazaoSocial();
            case 2:
                return obj.getNome();
            case 3:
                return obj.getCpfCnpj();

        }
        return "";
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "codigo";
            case 1:
                return "razao social";
            case 2:
                return "nome fantasia";
            case 3:
                return "cnpj";

        }
        return "";
    }
}
