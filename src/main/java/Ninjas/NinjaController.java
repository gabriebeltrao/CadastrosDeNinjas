package Ninjas;

import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping

public class NinjaController {

    @GetMapping("/boasvindas/")
    public String boasvindas(){
        return ("boas vindas ao minha primeira mensagem na minha rota");
    }
}
