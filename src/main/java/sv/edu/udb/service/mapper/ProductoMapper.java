package sv.edu.udb.service.mapper;

import org.mapstruct.Mapper;
import sv.edu.udb.controller.response.ProductoResponse;
import sv.edu.udb.repository.domain.Producto;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProductoMapper {
    List<ProductoResponse> toProductoResponseList(List<Producto> productos);

    ProductoResponse toProductoResponse(Producto producto);
}
