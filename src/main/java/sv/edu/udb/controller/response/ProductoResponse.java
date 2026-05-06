package sv.edu.udb.controller.response;

import lombok.Data;

@Data
public class ProductoResponse {
    private Long id;

    private String nombre;

    private String descripcion;

    private int stock;

    private double precio;
}
