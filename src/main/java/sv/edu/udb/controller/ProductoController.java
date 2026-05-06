package sv.edu.udb.controller;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import sv.edu.udb.controller.request.ProductoRequest;
import sv.edu.udb.controller.response.ProductoResponse;
import sv.edu.udb.service.ProductoService;

import java.util.List;

@RestController
@RequestMapping("/api/productos")
@RequiredArgsConstructor
public class ProductoController {
    @NonNull
    private final ProductoService productoService;

    @GetMapping
    public List<ProductoResponse> obtenerProcutos(){
        return productoService.obtenerProductos();
    }

    @GetMapping("/{id}")
    public ProductoResponse obtenerProducto(@PathVariable("id") Long id){
        return productoService.obtenerProducto(id);
    }

    @PutMapping("/{id}")
    public ProductoResponse venderProducto(@PathVariable("id") Long id, @RequestBody ProductoRequest producto){
        return productoService.venderProducto(id, producto);
    }
}
