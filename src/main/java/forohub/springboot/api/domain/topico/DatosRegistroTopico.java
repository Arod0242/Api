package forohub.springboot.api.domain.topico;

import forohub.springboot.api.domain.autor.DatosAutor;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;

public record DatosRegistroTopico(

        @NotBlank
        String titulo,
        @NotBlank
        String mensaje,
        LocalDateTime fechaCreacion,
        String status,
        @NotNull
        @Valid
        DatosAutor autor,
        @NotNull
        Curso curso) {

}
