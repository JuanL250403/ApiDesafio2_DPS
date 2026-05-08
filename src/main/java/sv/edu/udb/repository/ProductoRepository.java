package sv.edu.udb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import sv.edu.udb.repository.domain.Producto;

import java.util.List;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
    @Query("SELECT p FROM Producto p WHERE p.nombre LIKE %:nombre%")
    List<Producto> buscarProductoNomnbre(@Param("nombre") String nombre);
}
