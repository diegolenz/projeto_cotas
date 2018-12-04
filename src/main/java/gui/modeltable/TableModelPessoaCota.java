package gui.modeltable;

import lib.model.cotas.Cota;
import lib.model.cotas.PessoaCota;

import javax.swing.table.AbstractTableModel;
public class TableModelPessoaCota extends AbstractTableModel {

        public TableModelPessoaCota() {
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
            PessoaCota p = (PessoaCota) list[rowIndex];
            switch (columnIndex) {
                case 0:
                    return p.getId();
                case 1:
                    return p.getNome();
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
                    return "documento";
                case 6:
                    return "celular";
                case 7:
                    return "telefone";

            }
            return "";
        }


}
