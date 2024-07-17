package forohub.springboot.api.domain.topico;

import forohub.springboot.api.domain.autor.Autor;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Table(name = "topicos")
@Entity(name = "Topico")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Topico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String mensaje;
    @CreationTimestamp
    private LocalDateTime fechaCreacion;
    private String status;
    private Boolean activo;
    @Embedded
    private Autor autor;
    @Enumerated(EnumType.STRING)
    private Curso curso;


    public Topico(DatosRegistroTopico datosRegistroTopico) {
        this.activo = true;
        this.titulo = datosRegistroTopico.titulo();
        this.mensaje = datosRegistroTopico.mensaje();
        this.fechaCreacion = datosRegistroTopico.fechaCreacion();
        this.status = "1";
        this.autor = new Autor(datosRegistroTopico.autor());
        this.curso = datosRegistroTopico.curso();
    }

    public void actualizarDatos(DatosActualizarTopico datosActualizarTopico) {
        if(datosActualizarTopico.mensaje() != null){
            this.mensaje = datosActualizarTopico.mensaje();
        }
        this.fechaCreacion = datosActualizarTopico.fechaCreacion() != null ? datosActualizarTopico.fechaCreacion() : LocalDateTime.now();
    }

    public void desactivarTopico() {
        this.activo = false;
    }
}
