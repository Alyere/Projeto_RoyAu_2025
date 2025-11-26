package controller;

import model.Tutor;
import service.TutorService;
import exceptions.RegraNegocioException;

public class TutorController {

    private final TutorService tutorService;

    public TutorController() {
        this.tutorService = TutorService.getInstancia();
    }

    public void cadastrarTutor(Tutor tutor) throws RegraNegocioException {
        tutorService.cadastrarTutor(tutor);
        System.out.println("Tutor cadastrado com sucesso!");
    }

    public Tutor buscarPorId(int id) throws RegraNegocioException {
        return tutorService.buscarPorId(id);
    }

    public void listarTutores() {
        for (Tutor t : tutorService.getRepository().listar()) {
            System.out.println(t.getId() + " - " + t.getNome() + " - " + t.getTelefone());
        }
    }

    public TutorService getService() {
        return tutorService;
    }
}