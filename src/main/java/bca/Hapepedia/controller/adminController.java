package bca.Hapepedia.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class adminController {
   	
	@GetMapping
	public String index(Model model) {
		return "admins/index";
	}

	@RequestMapping("/detailTransaction")
	public String detailTransaction(Model model) {
		return "admins/detailTransaction";
	}

	@RequestMapping("/product")
	public String product(Model model) {
		return "admins/product";
	}

	@RequestMapping("/detailProduct")
	public String detailProduct(Model model) {
		return "admins/detailProduct";
	}

	@RequestMapping("/addProduct")
	public String addProduct(Model model) {
		return "admins/detailProduct";
	}

	@RequestMapping("/listadmin")
	public String listadmin(Model model) {
		return "admins/admin";
	}

	@RequestMapping("/addAdmin")
	public String addAdmin(Model model) {
		return "admins/addAdmin";
	}

	@RequestMapping("/setting")
	public String setting(Model model) {
		return "admins/setting";
	}
}
