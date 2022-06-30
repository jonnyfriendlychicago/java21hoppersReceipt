package com.jonfriend.java21hoppersreceipt;

import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
import org.springframework.stereotype.Controller; 
import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.PathVariable;

//@RestController
@Controller


public class HomeController {
	@RequestMapping("/")
	public String demo(Model model) {
		
//		String fruitx = "apple"; 
//		
//		model.addAttribute("fruity", fruitx); 
//		return "index.jsp"; 
		
		String customerName = "Buzz Aldrin"; 
		String itemName = "Rolled Flag"; 
		double itemPrice = 100000.00; 
		String itemDescription = "Symbol of freedom and prosperity"; 
		String vendorName = "Northrup Grummon"; 
		
		
		model.addAttribute("customerName", customerName); 
		model.addAttribute("itemName", itemName); 
		model.addAttribute("itemPrice", itemPrice); 
		model.addAttribute("itemDescription", itemDescription); 
		model.addAttribute("vendorName", vendorName); 
		return "index.jsp"; 
	}

//	@RequestMapping("")
//	public String hello() {
//		return "19 Welcome!"; 
//	}
	
//	@RequestMapping("/today")
//	public String today() {
//		return "19 Today you will find luck in all your endeavors!"; 
//	}
//	
//	@RequestMapping("/tomorrow")
//	public String tommy() {
//		return "19 Tomorrow, an opportunity will arise, so be sure to be open to new ideas!"; 
//	}
//	
//	@RequestMapping("/travel")
//	public String travvy0() {
//		return "19 You want to get away, I get it."; 
//	}
//	
//	@RequestMapping("/travel/{destination}")
//	public String travvy(@PathVariable("destination") String destination) {
//		return "19 Congrats!  You will soon travel to " + destination + "!" ; 
//	}
//	
//	@RequestMapping("/lotto")
//	public String lotty0() {
//		return "19 get some advice here, dude."; 
//	}
//	
//	@RequestMapping("/lotto/{intyInt}")
//	public String lotty(@PathVariable("intyInt") Integer intyInt) {
//		if (intyInt % 2 == 0) {
//			return "You will take a grand journey in the near future, but be weary of tempting offers."; 
//		} else {
//			return "You have enjoyed the fruits of your labor but now is a great time to spend time with family and friends."; 
//		}
//		
//		 
//	}
}
