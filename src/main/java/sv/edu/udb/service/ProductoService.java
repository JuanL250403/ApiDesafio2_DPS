package sv.edu.udb.service;

import jakarta.persistence.EntityNotFoundException;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import sv.edu.udb.controller.request.ProductoRequest;
import sv.edu.udb.controller.response.ProductoResponse;
import sv.edu.udb.exception.CantidadInsuficienteException;
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

    public ProductoResponse obtenerProducto(Long id) {
        Producto producto = productoRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("producto no existente"));

        return productoMapper.toProductoResponse(producto);
    }

    public ProductoResponse venderProducto(Long id, ProductoRequest producto) {
        Producto productoVender = productoRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Producto no existente"));

        if (productoVender.getStock() < producto.getStock()) {
            throw new CantidadInsuficienteException("Producto con stock insuficiente");
        }

        productoVender.setStock(productoVender.getStock() - producto.getStock());

        Producto productoVendido = productoRepository.save(productoVender);

        return productoMapper.toProductoResponse(productoVendido);
    }
}
