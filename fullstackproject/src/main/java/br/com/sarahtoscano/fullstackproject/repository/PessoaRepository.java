package br.com.sarahtoscano.fullstackproject.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import br.com.sarahtoscano.fullstackproject.domain.Pessoa;

public interface PessoaRepository  extends JpaRepository <Pessoa, Long> {
    
}

