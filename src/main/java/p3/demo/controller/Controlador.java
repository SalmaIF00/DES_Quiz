package p3.demo.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Controlador {
//Pregunta 1
	@RequestMapping(value = "/pregunta1", method = RequestMethod.GET)
	public String pregunta1_get() {
		return "pregunta1";
	}

	@RequestMapping(value = "/pregunta1", method = RequestMethod.POST)
	public String pregunta1_post(Model modelo) {

		return "redirect:/pregunta2";

	}
	

//Pregunta 2
	@RequestMapping(value = "/pregunta2", method = RequestMethod.GET)
	public String pregunta2_get() {
		return "pregunta2";
	}

	@RequestMapping(value = "/pregunta2", method = RequestMethod.POST)
	public String pregunta2_post(Model modelo) {

		return "redirect:/pregunta3";

	}

//Pregunta 3
	@RequestMapping(value = "/pregunta3", method = RequestMethod.GET)
	public String pregunta3_get() {
		return "pregunta3";
	}

	@RequestMapping(value = "/pregunta3", method = RequestMethod.POST)
	public String pregunta3_post(Model modelo) {

		return "redirect:/pregunta4";

	}

//Pregunta 4
	@RequestMapping(value = "/pregunta4", method = RequestMethod.GET)
	public String pregunta4_get() {
		return "pregunta4";
	}

	@RequestMapping(value = "/pregunta4", method = RequestMethod.POST)
	public String pregunta4_post(Model modelo) {

		return "redirect:/pregunta5";

	}

//Pregunta 5
	@RequestMapping(value = "/pregunta5", method = RequestMethod.GET)
	public String pregunta5_get() {
		return "pregunta5";
	}

	@RequestMapping(value = "/pregunta5", method = RequestMethod.POST)
	public String pregunta5_post(Model modelo) {

		return "redirect:/pregunta6";

	}

//Pregunta 6
	@RequestMapping(value = "/pregunta6", method = RequestMethod.GET)
	public String pregunta6_get() {
		return "pregunta6";
	}

	@RequestMapping(value = "/pregunta6", method = RequestMethod.POST)
	public String pregunta6_post(Model modelo) {

		return "redirect:/pregunta7";

	}

//Pregunta 7
	@RequestMapping(value = "/pregunta7", method = RequestMethod.GET)
	public String pregunta7_get() {
		return "pregunta7";
	}

	@RequestMapping(value = "/pregunta7", method = RequestMethod.POST)
	public String pregunta7_post(Model modelo) {

		return "redirect:/pregunta8";

	}

//Pregunta 8
	@RequestMapping(value = "/pregunta8", method = RequestMethod.GET)
	public String pregunta8_get() {
		return "pregunta8";
	}

	@RequestMapping(value = "/pregunta8", method = RequestMethod.POST)
	public String pregunta8_post(Model modelo) {

		return "redirect:/pregunta9";

	}

//Pregunta 9
	@RequestMapping(value = "/pregunta9", method = RequestMethod.GET)
	public String pregunta9_get() {
		return "pregunta9";
	}

	@RequestMapping(value = "/pregunta9", method = RequestMethod.POST)
	public String pregunta9_post(Model modelo) {

		return "redirect:/Resultado";

	}
}
