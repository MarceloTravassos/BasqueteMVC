package br.edu.basquete.mvcbasquete.controllers;

import br.edu.basquete.mvcbasquete.model.Basquete;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/basquete")
public class BasqueteApiController {
    private static final List<Basquete> basquete = new ArrayList<Basquete>();

    public BasqueteApiController() {
        basquete.add(new Basquete("Stephen Curry", "Golden State Warriors", 34));
        basquete.add(new Basquete("Kevin Durant", "Brooklyn Nets", 34));
        basquete.add(new Basquete("Giannis Antetokounmpo", "Milwaukee Bucks", 27));
        basquete.add(new Basquete("Joel Embiid", "Philadelphia 76ers", 28));
        basquete.add(new Basquete("Donovan Mitchell", "Cleveland Cavaliers", 26));
    }

    @GetMapping
    public List<Basquete> getBasquete() {
        return basquete;
    }
}
