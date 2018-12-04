package main;

import lib.dao.AbstractDao;
import lib.dao.imp.apartamento.ApartamentoDao;
import lib.model.apartamento.Apartamento;
import gui.JanelaPrincipal;

public class Main {

    public static void main(String[] args) throws Exception {
       JanelaPrincipal a=new JanelaPrincipal();
        AbstractDao.estanciaem();
       a.show();

    }
}
