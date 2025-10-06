package dev.javinhasedex.CadastroDeNinjas.Ninjas.Controller.Service;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ninjas")
public class Controller {

    private NinjaService ninjaService;

    public Controller(NinjaService ninjaService) {
        this.ninjaService = ninjaService;
    }

    //TODO (crude)

//    Adiciinar ninja (CREATE)
    @PostMapping("/criar")
    public String criarninja(){
        return "ninja criado com sucesso";
      }

//    Mostrar todos os ninjas (READ)
    @GetMapping("/listar")
    public List<NinjaModel> listarNinjas(){
        return ninjaService.listarNinjas();
    }

//    Mostrar ninja por id (READ)
    @GetMapping("/listar/{id}")
    public NinjaModel listarNinjasPorID(@PathVariable Long id) {
        return ninjaService.listarNinjaPorId(id);
    }

//    Alterar dados dos ninja (UPDATE)
    @PutMapping("/alterarID")
    public String AlterarNinjaPorID(){
        return "Alterar Ninjas por ID";
    }

//    Deletar Ninja (DELETE)
    @DeleteMapping("/deletarID")
    public String deletarNinjaPorID(){
        return "Ninjas deletado por ID";
    }

}
