package Contatos.backend.repository;

import Contatos.backend.entity.ContatoUsuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContatoRepository extends JpaRepository<ContatoUsuario, Long> {
}
