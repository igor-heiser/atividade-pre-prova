package prep_prova.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import prep_prova.demo.model.Jogo;

public interface JogoRepository extends JpaRepository<Jogo, Long> { }