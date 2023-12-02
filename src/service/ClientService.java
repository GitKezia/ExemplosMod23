package service;

import dao.ClientDao;
import dao.IClientDao;
import dao.ClientDaoMock;

public class ClientService {

    private IClientDao clienteDao;

    public ClientService(IClientDao clienteDao){
        // clienteDao = new ClientDao();
        this.clienteDao = clienteDao;
    }

    public String salvar(){
        clienteDao.salvar();

        return "Sucesso";
    }


}
