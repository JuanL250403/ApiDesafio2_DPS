package sv.edu.udb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sv.edu.udb.repository.domain.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
