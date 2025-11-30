package controller;

import model.Agendamento;
import service.AgendamentoService;
import exceptions.RegraNegocioException;

public class AgendamentoController {

    private final AgendamentoService agendamentoService;

    public AgendamentoController() {

        this.agendamentoService = AgendamentoService.getInstancia();
    }


    public void cadastrarAgendamento(Agendamento agendamento) throws RegraNegocioException {
        agendamentoService.agendarServico(agendamento);
        System.out.println("Agendamento criado com sucesso...");

    }


    public void finalizarAgendamento(int idAgendamento) throws RegraNegocioException {
        agendamentoService.finalizarAgendamento(idAgendamento);
    }

    // Método auxiliar para obter a instância do Service (útil para a Main)
    public AgendamentoService getService() {
        return agendamentoService;
    }

    /** Lista todos os agendamentos registrados (CRUD - Read). */
    public void listarTodos() {
        System.out.println("--- Agendamentos Registrados ---");

        for (Agendamento a : agendamentoService.getRepository().listar()) {

            a.exibirAgendamento();
        }
    }
}