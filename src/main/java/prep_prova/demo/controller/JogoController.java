package prep_prova.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import prep_prova.demo.repository.JogoRepository;
import prep_prova.demo.model.Jogo;
import java.util.List;

@RestController
@RequestMapping("/jogos")

public class JogoController {

    //Anotação para que vai instruir o Spring a procurar uma instância pronta
    @Autowired
    private JogoRepository jogoRepository;

    @PostMapping
    public Jogo salvar(@RequestBody Jogo jogo){
        return jogoRepository.save(jogo);
    }

    @GetMapping
    public List<Jogo> listar(){
        return jogoRepository.findAll();
    }

}