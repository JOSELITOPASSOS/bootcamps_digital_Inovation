package br.com.exemple.webmvc.springwebmvc.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.exemple.webmvc.springwebmvc.model.Jedi;
import br.com.exemple.webmvc.springwebmvc.repository.JediRepository;

@Controller
public class JediController {

	@Autowired
	private JediRepository repository;
	
	@GetMapping("/jedi")
	public ModelAndView jedi() {
		final ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("jedi");

		modelAndView.addObject("allJedi", this.repository.getAllJedi());
		
		return modelAndView;
	}
	
	@GetMapping("/new-jedi")
	public ModelAndView newJedi() {
		final ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("new-jedi");
		modelAndView.addObject("jedi", new Jedi());
		
		return modelAndView;
	}
	
	@PostMapping("/jedi")
	public String createJedi(@Valid @ModelAttribute Jedi jedi, BindingResult result, RedirectAttributes redirectAttributes) {
		if(result.hasErrors()) {
			return "new-jedi";
		}
		
		this.repository.add(jedi);
		redirectAttributes.addFlashAttribute("message", "Jedi successfully created.");
		
		return "redirect:jedi";
	}
}