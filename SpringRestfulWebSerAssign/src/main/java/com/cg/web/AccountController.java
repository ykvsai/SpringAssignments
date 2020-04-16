package com.cg.web;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.cg.entity.Account;

@Controller
public class AccountController {

	@Autowired
	private com.cg.service.AccountService service;

	@GetMapping("/viewall")
	public String viewAllAccounts(Model model) {
		model.addAttribute("alist", service.viewAccount());
		return "AccountViewPage";
	}

	@GetMapping("/showaddform")public String displayAddForm(Model model)
	{
		return "AddAccountPage";
	}

	@PostMapping("/add")
	public String addAccount(@Valid @ModelAttribute("abean") Account account , BindingResult br,Model model)
	{
		if (br.hasErrors())
			return "AddAccountPage";
		try {
			service.addAccount(account);
			model.addAttribute("msg","account added successfully");
			return "HomePage";
		} catch (Exception e) {
			model.addAttribute("msg","Id already exists");
			return "AddAccountPage";
		}
	}

	@GetMapping("/showtransfer")
	public String displayTransferFundPage(Model model)
	{
		return"TransferFormPage";

	}

	@PostMapping("/submittransfer")
	public String processTransferPage(@Valid @ModelAttribute("tbean") TransferBean tbean,BindingResult br, Model model)
	{
		if (br.hasErrors())
			return"TransferFormPage";
		try {
			service.transferFund(tbean.getFromAccountId(), tbean.getToAccountId(),tbean.getAmt());
			model.addAttribute("msg","FUnd transfered successfully");
			return"HomePage";
		} catch (Exception e) {
			model.addAttribute("msg",e.getMessage());
			return"TransferFormPage";
		}
	}


}
