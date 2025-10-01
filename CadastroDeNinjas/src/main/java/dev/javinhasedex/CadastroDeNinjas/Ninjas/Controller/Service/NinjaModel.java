package dev.javinhasedex.CadastroDeNinjas.Ninjas.Controller.Service;

import dev.javinhasedex.CadastroDeNinjas.Missoes.MissoesModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "tb_cadastro")
@NoArgsConstructor
@AllArgsConstructor
public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "nome")
    private String nome;

    @Column(unique = true )
    private String email;

    @Column(name = "idade")
    private int idade;

    @Column(name = "img_Url")
    private String imgUrl;

    @ManyToOne
    @JoinColumn(name = "missoes_id")
    private MissoesModel missoes;

}

