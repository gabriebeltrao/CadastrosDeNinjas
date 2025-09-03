package Ninjas;

import Missoes.MissoesModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;



@Entity
@Table(name = "tb_cadastros_de_ninjas")
@NoArgsConstructor
@AllArgsConstructor
@Data //cria os getters e os setters
public class NinjaModel {
    @Id
    long id;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String nome;
    private String email;
    private int idade;


    @ManyToOne
    @JoinColumn (name = "missoes_id")// um ninja tem uma unica missão
    private MissoesModel missoes;



}
