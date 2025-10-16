package taller2_corte2.viajes;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class viajaPlus_controller {

    @GetMapping("/")
    public String index() {
        return "inicio";
    }

    @GetMapping("/destinos")
    public String destino() {
        return "pages/destinos";
    }

    @GetMapping("/servicio")
    public String servicio() {
        return "pages/servicio";
    }

    @GetMapping("/nosotros")
    public String nosotros() {
        return "pages/nosotros";
    }

    @GetMapping("/oferta")
    public String oferta() {
        return "pages/oferta";
    }    
}
