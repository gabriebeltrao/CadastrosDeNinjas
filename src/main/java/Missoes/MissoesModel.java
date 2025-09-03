package Missoes;

import java.util.List;
import Ninjas.NinjaModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.tomcat.util.buf.UEncoder;


@Entity
@Table(name = "tb_missoes")
@NoArgsConstructor // cheio
@AllArgsConstructor //vazio
@Data //cria os getters e os setters
public class MissoesModel {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String nome;

    private String dificuldade;
    //  @OneToMany uma unica missão para muitos ninjas
    @OneToMany( mappedBy = "missoes")
    private List<NinjaModel> ninjas;








}
