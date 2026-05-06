package sv.edu.udb.repository.domain;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    private String descripcion;

    private int stock;

    private double precio;

    @OneToMany(mappedBy = "producto", fetch = FetchType.LAZY)
    private List<Venta> ventas;

}
