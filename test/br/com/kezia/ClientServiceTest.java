package br.com.kezia;

import dao.ClientDao;
import dao.ClientDaoMock;
import dao.IClientDao;
import org.junit.Assert;
import org.junit.Test;
import service.ClientService;

public class ClientServiceTest {

    @Test
    public void salvarTest() {
        ClientDaoMock mockDao = new ClientDaoMock();
        ClientService service = new ClientService(mockDao);
        String retorno = service.salvar();
        char expected;
        Assert.assertEquals( "Sucesso", retorno);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoSalvarTest() {
        IClientDao mockDao = new ClientDao();
        ClientService service = new ClientService(mockDao);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }

    @Test
    public void buscarTest() {
        ClientDaoMock mockDao = new ClientDaoMock();
        ClientService service = new ClientService(mockDao);
        String retorno = service.salvar();
        char expected;
        Assert.assertEquals( "Sucesso", retorno);
    }

    @Test
    public void atualizarTest() {
        ClientDaoMock mockDao = new ClientDaoMock();
        ClientService service = new ClientService(mockDao);
        String retorno = service.salvar();
        char expected;
        Assert.assertEquals( "Sucesso", retorno);
    }

    @Test
    public void excluirTest() {
        ClientDaoMock mockDao = new ClientDaoMock();
        ClientService service = new ClientService(mockDao);
        String retorno = service.salvar();
        char expected;
        Assert.assertEquals( "Sucesso", retorno);
    }
}
