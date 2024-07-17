package forohub.springboot.api.domain.autor;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Autor {

    private String idUsuario;
    private String nombre;

    public Autor(DatosAutor autor) {
        this.idUsuario = autor.idUsuario();
        this.nombre = autor.nombre();
    }
}
