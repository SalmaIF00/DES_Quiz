package p3.demo.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import p3.demo.controladorbbdd.Usuario;
import p3.demo.controladorbbdd.UsuarioDao;

@Controller
public class Controlador {
	
//Inicio
	@GetMapping("/inicio")
	public String inicio(Model model, HttpSession session) {
		@SuppressWarnings("unchecked")
		List<String> messages = (List<String>) session.getAttribute("MY_SESSION_MESSAGES");
		if (messages == null) {
			messages = new ArrayList<>();
		}
		model.addAttribute("sessionMessages", messages);
		return "inicio";
	}
	
	
	@PostMapping("/inicio")
	public String persistMessage(@RequestParam("inicio") String inicio, HttpServletRequest request) {
		@SuppressWarnings("unchecked")
		List<String> messages = (List<String>) request.getSession().getAttribute("MY_SESSION_MESSAGES");
		if (messages == null) {
			messages = new ArrayList<>();
			request.getSession().setAttribute("MY_SESSION_MESSAGES", messages);
		}
		messages.add(inicio);
		request.getSession().setAttribute("MY_SESSION_MESSAGES", messages);
		return "redirect:/pregunta1";
	}
	
//Pregunta 1
	@GetMapping("/pregunta1")
	public String process1(Model model, HttpSession session) {
		@SuppressWarnings("unchecked")
		List<String> messages = (List<String>) session.getAttribute("MY_SESSION_MESSAGES");
		if (messages == null) {
			messages = new ArrayList<>();
		}
		model.addAttribute("sessionMessages", messages);
		return "pregunta1";
	}

	@PostMapping("/pregunta1")
	public String persistMessage1(@RequestParam("pregunta1") String pregunta1, HttpServletRequest request) {
		@SuppressWarnings("unchecked")
		List<String> messages = (List<String>) request.getSession().getAttribute("MY_SESSION_MESSAGES");
		if (messages == null) {
			messages = new ArrayList<>();
			request.getSession().setAttribute("MY_SESSION_MESSAGES", messages);
		}
		messages.add(pregunta1);
		request.getSession().setAttribute("MY_SESSION_MESSAGES", messages);
		return "redirect:/pregunta2";
	}

//Pregunta 2
	@GetMapping("/pregunta2")
	public String process2(Model model, HttpSession session) {
		@SuppressWarnings("unchecked")
		List<String> messages = (List<String>) session.getAttribute("MY_SESSION_MESSAGES");
		if (messages == null) {
			messages = new ArrayList<>();
		}
		model.addAttribute("sessionMessages", messages);
		return "pregunta2";
	}

	@PostMapping("/pregunta2")
	public String persistMessage2(@RequestParam("pregunta2") String pregunta2, HttpServletRequest request) {
		@SuppressWarnings("unchecked")
		List<String> messages = (List<String>) request.getSession().getAttribute("MY_SESSION_MESSAGES");
		if (messages == null) {
			messages = new ArrayList<>();
			request.getSession().setAttribute("MY_SESSION_MESSAGES", messages);
		}
		messages.add(pregunta2);
		request.getSession().setAttribute("MY_SESSION_MESSAGES", messages);
		return "redirect:/pregunta3";
	}

//Pregunta 3
	@GetMapping("/pregunta3")
	public String process3(Model model, HttpSession session) {
		@SuppressWarnings("unchecked")
		List<String> messages = (List<String>) session.getAttribute("MY_SESSION_MESSAGES");
		if (messages == null) {
			messages = new ArrayList<>();
		}
		model.addAttribute("sessionMessages", messages);
		return "pregunta3";
	}

	@PostMapping("/pregunta3")
	public String persistMessage3(@RequestParam("pregunta3") String pregunta3, HttpServletRequest request) {
		@SuppressWarnings("unchecked")
		List<String> messages = (List<String>) request.getSession().getAttribute("MY_SESSION_MESSAGES");
		if (messages == null) {
			messages = new ArrayList<>();
			request.getSession().setAttribute("MY_SESSION_MESSAGES", messages);
		}
		messages.add(pregunta3);
		request.getSession().setAttribute("MY_SESSION_MESSAGES", messages);
		return "redirect:/pregunta4";
	}

//Pregunta 4
	@GetMapping("/pregunta4")
	public String process4(Model model, HttpSession session) {
		@SuppressWarnings("unchecked")
		List<String> messages = (List<String>) session.getAttribute("MY_SESSION_MESSAGES");
		if (messages == null) {
			messages = new ArrayList<>();
		}
		model.addAttribute("sessionMessages", messages);
		return "pregunta4";
	}

	@PostMapping("/pregunta4")
	public String persistMessage4(@RequestParam("pregunta4") String pregunta4, HttpServletRequest request) {
		@SuppressWarnings("unchecked")
		List<String> messages = (List<String>) request.getSession().getAttribute("MY_SESSION_MESSAGES");
		if (messages == null) {
			messages = new ArrayList<>();
			request.getSession().setAttribute("MY_SESSION_MESSAGES", messages);
		}
		messages.add(pregunta4);
		request.getSession().setAttribute("MY_SESSION_MESSAGES", messages);
		return "redirect:/pregunta5";
	}

//Pregunta 5
	@GetMapping("/pregunta5")
	public String process5(Model model, HttpSession session) {
		@SuppressWarnings("unchecked")
		List<String> messages = (List<String>) session.getAttribute("MY_SESSION_MESSAGES");
		if (messages == null) {
			messages = new ArrayList<>();
		}
		model.addAttribute("sessionMessages", messages);
		return "pregunta5";
	}

	@PostMapping("/pregunta5")
	public String persistMessage5(@RequestParam("pregunta5") String pregunta5, HttpServletRequest request) {
		@SuppressWarnings("unchecked")
		List<String> messages = (List<String>) request.getSession().getAttribute("MY_SESSION_MESSAGES");
		if (messages == null) {
			messages = new ArrayList<>();
			request.getSession().setAttribute("MY_SESSION_MESSAGES", messages);
		}
		messages.add(pregunta5);
		request.getSession().setAttribute("MY_SESSION_MESSAGES", messages);
		return "redirect:/pregunta6";
	}

//Pregunta 6
	@GetMapping("/pregunta6")
	public String process6(Model model, HttpSession session) {
		@SuppressWarnings("unchecked")
		List<String> messages = (List<String>) session.getAttribute("MY_SESSION_MESSAGES");
		if (messages == null) {
			messages = new ArrayList<>();
		}
		model.addAttribute("sessionMessages", messages);
		return "pregunta6";
	}

	@PostMapping("/pregunta6")
	public String persistMessage6(@RequestParam("pregunta6") String pregunta6, HttpServletRequest request) {
		@SuppressWarnings("unchecked")
		List<String> messages = (List<String>) request.getSession().getAttribute("MY_SESSION_MESSAGES");
		if (messages == null) {
			messages = new ArrayList<>();
			request.getSession().setAttribute("MY_SESSION_MESSAGES", messages);
		}
		messages.add(pregunta6);
		request.getSession().setAttribute("MY_SESSION_MESSAGES", messages);
		return "redirect:/pregunta7";
	}

//Pregunta 7
	@GetMapping("/pregunta7")
	public String process7(Model model, HttpSession session) {
		@SuppressWarnings("unchecked")
		List<String> messages = (List<String>) session.getAttribute("MY_SESSION_MESSAGES");
		if (messages == null) {
			messages = new ArrayList<>();
		}
		model.addAttribute("sessionMessages", messages);
		return "pregunta7";
	}

	@PostMapping("/pregunta7")
	public String persistMessage7(@RequestParam("pregunta7") String pregunta7, HttpServletRequest request) {
		@SuppressWarnings("unchecked")
		List<String> messages = (List<String>) request.getSession().getAttribute("MY_SESSION_MESSAGES");
		if (messages == null) {
			messages = new ArrayList<>();
			request.getSession().setAttribute("MY_SESSION_MESSAGES", messages);
		}
		messages.add(pregunta7);
		request.getSession().setAttribute("MY_SESSION_MESSAGES", messages);
		return "redirect:/pregunta8";
	}

//Pregunta 8
	@GetMapping("/pregunta8")
	public String process8(Model model, HttpSession session) {
		@SuppressWarnings("unchecked")
		List<String> messages = (List<String>) session.getAttribute("MY_SESSION_MESSAGES");
		if (messages == null) {
			messages = new ArrayList<>();
		}
		model.addAttribute("sessionMessages", messages);
		return "pregunta8";
	}

	@PostMapping("/pregunta8")
	public String persistMessage8(@RequestParam("pregunta8") String pregunta8, HttpServletRequest request) {
		@SuppressWarnings("unchecked")
		List<String> messages = (List<String>) request.getSession().getAttribute("MY_SESSION_MESSAGES");
		if (messages == null) {
			messages = new ArrayList<>();
			request.getSession().setAttribute("MY_SESSION_MESSAGES", messages);
		}
		messages.add(pregunta8);
		request.getSession().setAttribute("MY_SESSION_MESSAGES", messages);
		return "redirect:/pregunta9";
	}

//Pregunta 9
	@GetMapping("/pregunta9")
	public String process9(Model model, HttpSession session) {
		@SuppressWarnings("unchecked")
		List<String> messages = (List<String>) session.getAttribute("MY_SESSION_MESSAGES");
		if (messages == null) {
			messages = new ArrayList<>();
		}
		model.addAttribute("sessionMessages", messages);
		return "pregunta9";
	}

	@PostMapping("/pregunta9")
	public String persistMessage9(@RequestParam("pregunta9") String pregunta9, HttpServletRequest request) {
		@SuppressWarnings("unchecked")
		List<String> messages = (List<String>) request.getSession().getAttribute("MY_SESSION_MESSAGES");
		if (messages == null) {
			messages = new ArrayList<>();
			request.getSession().setAttribute("MY_SESSION_MESSAGES", messages);
		}
		messages.add(pregunta9);
		request.getSession().setAttribute("MY_SESSION_MESSAGES", messages);
		return "redirect:/pregunta10";
	}

	// Pregunta 10
	@GetMapping("/pregunta10")
	public String process10(Model model, HttpSession session) {
		@SuppressWarnings("unchecked")
		List<String> messages = (List<String>) session.getAttribute("MY_SESSION_MESSAGES");
		if (messages == null) {
			messages = new ArrayList<>();
		}
		model.addAttribute("sessionMessages", messages);
		return "pregunta10";
	}

	@PostMapping("/pregunta10")
	public String persistMessage10(@RequestParam("pregunta10") String pregunta10, HttpServletRequest request) {
		@SuppressWarnings("unchecked")
		List<String> messages = (List<String>) request.getSession().getAttribute("MY_SESSION_MESSAGES");
		if (messages == null) {
			messages = new ArrayList<>();
			request.getSession().setAttribute("MY_SESSION_MESSAGES", messages);
		}
		messages.add(pregunta10);
		request.getSession().setAttribute("MY_SESSION_MESSAGES", messages);
		return "redirect:/resultado";
	}

// resultado
	@GetMapping("/resultado")
	public String processR(Model model, HttpSession session) {
		@SuppressWarnings("unchecked")
		List<String> messages = (List<String>) session.getAttribute("MY_SESSION_MESSAGES");
		if (messages == null) {
			messages = new ArrayList<>();
		}

		int puntuacion = 0;
		for (int i = 0; i < messages.size(); i++) {
			
			String message = messages.get(i);
			
			if (message.equals("Correcto")|| message.equals("Correcta")) {
				puntuacion= puntuacion+1;
			} else {
				puntuacion=puntuacion+0;
			}
		}
		model.addAttribute("puntuacion", puntuacion);
		return "resultado";
	}

	@PostMapping("/resultado")
	public String destroySession(HttpServletRequest request) {
		request.getSession().invalidate();
		return "redirect:/inicio";
	}

}
