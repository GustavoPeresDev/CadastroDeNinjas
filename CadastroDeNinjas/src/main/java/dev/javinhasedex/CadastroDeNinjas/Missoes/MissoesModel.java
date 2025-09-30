package dev.javinhasedex.CadastroDeNinjas.Missoes;

import dev.javinhasedex.CadastroDeNinjas.Ninjas.Controller.Service.NinjaModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tb_missões")
public class MissoesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nomeDaMissao;

    private String dificuldadeDaMissao;

    @ManyToMany(mappedBy = "missoes")
    private List<NinjaModel> ninja;

}
