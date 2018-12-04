package gui.modeltable;

import javax.swing.table.AbstractTableModel;


import lib.model.cotas.Cota;
import lib.model.pessoa.Pessoa;

public class TableModelCotaIntegrantres extends AbstractTableModel {

	public TableModelCotaIntegrantres() {
		// TODO Auto-generated constructor stub
		this.list = new Object[0];
	}



    
	protected Cota cota;
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
	Pessoa p = (Pessoa) list[rowIndex];
	switch (columnIndex) {
	case 0:
		return p.getId();
	case 1:
	    return p.getNome();


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
	case 2:
		return "tipo";
		case 3:
			return "cpf";
	case 4:
		return "rg";
	case 5:
		return "data de nasimento";
	case 6:
		return "celular";
	case 7:
		return "telefone";
	
	}
	return "";
    }

}