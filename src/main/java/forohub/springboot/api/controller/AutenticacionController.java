package forohub.springboot.api.controller;

import forohub.springboot.api.domain.usuarios.DatosAutenticarUsuario;
import forohub.springboot.api.domain.usuarios.Usuario;
import forohub.springboot.api.infra.security.DatosJwtToken;
import forohub.springboot.api.infra.security.TokenService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class AutenticacionController {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private TokenService tokenService;

    @PostMapping
    public ResponseEntity autenticarUsuario(@RequestBody @Valid DatosAutenticarUsuario datosAutenticarUsuario){
        Authentication authToken = new UsernamePasswordAuthenticationToken(datosAutenticarUsuario.usuario(), datosAutenticarUsuario.clave());
        var usuarioAutenticado = authenticationManager.authenticate(authToken);
        var JwtToken = tokenService.generarToken((Usuario) usuarioAutenticado.getPrincipal());
        return ResponseEntity.ok(new DatosJwtToken(JwtToken));
    }
}
