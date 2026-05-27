package prep_prova.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import prep_prova.demo.model.Aluguel;

public interface AluguelRepository extends JpaRepository<Aluguel, Long> { }