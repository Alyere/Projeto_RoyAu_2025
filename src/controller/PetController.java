package controller;

import exceptions.RegraNegocioException;
import model.Pet;
import service.PetService;

public class PetController {

    private final PetService petService;

    public PetController() {
        this.petService = PetService.getInstancia();
    }

    public void cadastrarPet(Pet pet) throws RegraNegocioException {
        petService.cadastrarPet(pet);
        System.out.println("Pet cadastrado com sucesso!");
    }

    public Pet buscarPorId(int id) throws RegraNegocioException {
        return petService.buscarPorId(id);
    }

    public void listarPets() {
        for (Pet p : petService.getRepository().listar()) {
            System.out.println(p);
        }
    }

    public PetService getService() {
        return petService;
    }
}