package prep_prova.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import prep_prova.demo.model.Aluguel;
import prep_prova.demo.repository.AluguelRepository;
import prep_prova.demo.repository.JogoRepository;
import prep_prova.demo.model.Jogo;
import java.util.List;

@RestController
@RequestMapping("/alugueis")

public class AluguelController {

    //Anotação para que vai instruir o Spring a procurar uma instância pronta
    @Autowired
    private AluguelRepository aluguelRepository;

    @PostMapping
    public Aluguel salvar(@RequestBody Aluguel aluguel){
        return aluguelRepository.save(aluguel);
    }

    @GetMapping
    public List<Aluguel> listar(){
        return aluguelRepository.findAll();
    }

}