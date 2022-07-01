package poo.api.bebidas.bebidasPoo.model;

import javax.persistence.*;

@Entity
@Table(name = "refrigerante")
public class Refrigerante {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
}