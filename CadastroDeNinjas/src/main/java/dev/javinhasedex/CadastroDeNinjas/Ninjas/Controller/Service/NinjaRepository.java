package dev.javinhasedex.CadastroDeNinjas.Ninjas.Controller.Service;

import dev.javinhasedex.CadastroDeNinjas.Missoes.MissoesModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NinjaRepository extends JpaRepository<NinjaModel, Long> {
}
