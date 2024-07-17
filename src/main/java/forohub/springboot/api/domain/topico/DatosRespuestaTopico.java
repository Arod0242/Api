package forohub.springboot.api.domain.topico;

import forohub.springboot.api.domain.autor.DatosAutor;

import java.time.LocalDateTime;

public record DatosRespuestaTopico(
        Long id,
        String titulo,
        String mensaje,
        LocalDateTime fechaCreacion,
        String status,
        DatosAutor autor,
        String curso
) {
}
