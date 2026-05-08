package sv.edu.udb.service;

import lombok.RequiredArgsConstructor;
import org.apache.catalina.User;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import sv.edu.udb.controller.request.AuthRequest;
import sv.edu.udb.controller.response.AuthResponse;
import sv.edu.udb.repository.domain.Usuario;

@Service
@RequiredArgsConstructor
public class AuthService {
    private final AuthenticationManager authenticationManager;
    private final JwtService jwtService;

    public AuthResponse generarToken(AuthRequest authRequest) {
        Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        authRequest.getUsuario(),
                        authRequest.getContrasenia()
                )
        );

        if (authentication.isAuthenticated()) {
            Usuario usuario = (Usuario) authentication.getPrincipal();
            String jwt = jwtService.generarToken(usuario);

            return AuthResponse.builder()
                    .authToken(jwt)
                    .build();
        }

        throw  new UsernameNotFoundException("Credenciales invalidas");
    }
}
