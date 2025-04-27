package br.com.atvselenium;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/noticias")
public class NoticiaController {

    @Autowired
    private NoticiaService noticiaService;

    @GetMapping
    public List<String> getNoticias() {
        return noticiaService.getNoticias();
    }
}
