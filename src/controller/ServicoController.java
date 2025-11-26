package controller;

import model.Servico;
import service.ServicoService;
import exceptions.RegraNegocioException;

public class ServicoController {

    private final ServicoService servicoService;

    public ServicoController() {
        this.servicoService = ServicoService.getInstancia();
    }

    public Servico buscarPorId(int id) throws RegraNegocioException {
        return servicoService.buscarPorId(id);
    }

    public void listarServicos() {
        servicoService.listarServicos();
    }

    public ServicoService getService() {
        return servicoService;
    }
}
