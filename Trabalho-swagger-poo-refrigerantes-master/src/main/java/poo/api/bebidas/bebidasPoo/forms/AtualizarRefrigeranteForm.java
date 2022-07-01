package poo.api.bebidas.bebidasPoo.forms;

import poo.api.bebidas.bebidasPoo.model.Refrigerante;
import poo.api.bebidas.bebidasPoo.repository.RefrigeranteRepository;

public class AtualizarRefrigeranteForm {

    private Long id;

    private String nome;
    private String marca;
    private String sabor;
    private Boolean diet;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public Boolean getDiet() {
        return diet;
    }

    public void setDiet(Boolean diet) {
        this.diet = diet;
    }

    public Refrigerante atualizar(Long id, RefrigeranteRepository refrigeranteRepository) {
        Refrigerante refrigerante = refrigeranteRepository.getById(id);
        refrigerante.setDiet(this.diet);
        refrigerante.setNome(this.nome);
        refrigerante.setMarca(this.marca);
        refrigerante.setSabor(this.sabor);
        refrigeranteRepository.save(refrigerante);
        return refrigerante;
    }
}
