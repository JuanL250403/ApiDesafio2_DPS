package sv.edu.udb.service;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import sv.edu.udb.controller.response.ProductoResponse;
import sv.edu.udb.repository.ProductoRepository;
import sv.edu.udb.repository.domain.Producto;
import sv.edu.udb.service.mapper.ProductoMapper;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductoService {
    @NonNull
    private final ProductoRepository productoRepository;

    @NonNull
    private final ProductoMapper productoMapper;

    public List<ProductoResponse> obtenerProductos() {
        List<Producto> productos = productoRepository.findAll();
        return productoMapper.toProductoResponseList(productos);
    }
}
