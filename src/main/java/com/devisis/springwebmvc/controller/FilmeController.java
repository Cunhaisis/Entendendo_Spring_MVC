package com.devisis.springwebmvc.controller;

import com.devisis.springwebmvc.model.Filme;
import com.devisis.springwebmvc.repository.FilmeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class FilmeController {

    @Autowired
    private FilmeRepository repository;

    @GetMapping("/filme")
    public ModelAndView filme() {

        final ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("filme");
        modelAndView.addObject("allFilme", repository.getAllFilme());

        return modelAndView;
    }

    @GetMapping("/new-filme")
    public String createFilme(Model model) {

        model.addAttribute("filme", new Filme());

        return "new-filme";
    }

    @PostMapping("/filme")
    public String createFilme(@Validated @ModelAttribute Filme filme, BindingResult result, RedirectAttributes redirect) {

        if (result.hasErrors()) {
            return "new-filme";
        }
        repository.add(filme);
        redirect.addFlashAttribute("message", "Filme adicionado com sucesso.");

        return "redirect:filme";
    }

}


