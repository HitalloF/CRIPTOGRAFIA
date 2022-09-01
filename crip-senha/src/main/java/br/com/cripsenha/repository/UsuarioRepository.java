package br.com.cripsenha.repository;

import br.com.cripsenha.model.UsuarioModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<UsuarioModel,Long> {

    public Optional<UsuarioModel> findByLogin(String login);

}
