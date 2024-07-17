package forohub.springboot.api.domain.topico;

import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;

public record DatosActualizarTopico(
        @NotNull
        Long id,
        String mensaje,
        LocalDateTime fechaCreacion
) {
}
