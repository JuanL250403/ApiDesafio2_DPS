package sv.edu.udb.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sv.edu.udb.controller.request.AuthRequest;
import sv.edu.udb.controller.response.AuthResponse;
import sv.edu.udb.service.AuthService;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/auth")
public class AuthController {
    private final AuthService authService;

    @PostMapping("/login")
    public AuthResponse login(@RequestBody AuthRequest authRequest){
        return authService.generarToken(authRequest);
    }
}
