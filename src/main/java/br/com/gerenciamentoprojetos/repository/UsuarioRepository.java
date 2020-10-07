package br.com.gerenciamentoprojetos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.gerenciamentoprojetos.model.Usuario;

import java.util.List;

public interface UsuarioRepository extends JpaRepository<Usuario,Long>{

    public List<String> findByNome(String nome);
    public List<String> findByNomeNot(String nome);

}
