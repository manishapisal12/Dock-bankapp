package com.mastek.app.controller;


	import java.util.List;

	//import javax.websocket.server.PathParam;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.ModelAttribute;
	import org.springframework.web.bind.annotation.PathVariable;
	import org.springframework.web.bind.annotation.PostMapping;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RestController;
	import org.springframework.web.servlet.ModelAndView;

	import com.mastek.app.model.BankAccount;
	import com.mastek.app.service.BankAccountService;

	@RestController
	@RequestMapping("/bank")
	public class BankAccountController {
		@Autowired
		private BankAccountService service;
		private ModelAndView andView;

		@GetMapping
		public String test() {
			return "account";
		}

		@GetMapping("/account/{id}")
		public ModelAndView findById(@PathVariable("id") String id) {
			
			return new ModelAndView("account","account", service.findById(Integer.parseInt(id)));
		}

		@GetMapping("/accounts")
		public ModelAndView findAll() {
			return new ModelAndView("accounts", "accounts", service.findAll());
		}

		@PostMapping("/save")
		public ModelAndView save(@ModelAttribute BankAccount account) {
			andView = new ModelAndView("account");
			if (service.save(account)) {
				andView.addObject("account", account);
			} else {
				andView.addObject("error", "Account is not created.");
			}
			return andView;
		}
	}



