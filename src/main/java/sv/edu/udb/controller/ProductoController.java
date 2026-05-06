package sv.edu.udb.controller;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
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
}
