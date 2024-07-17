package forohub.springboot.api.domain.autor;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record DatosAutor(@NotBlank @Pattern(regexp = "\\d{8,12}") String idUsuario, @NotBlank String nombre) {
}
