package porg2_ss22.ha6kyrillPysarenko.controlers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import porg2_ss22.ha6kyrillPysarenko.services.CoronaVirusDataService;


@Controller
public class HomeController {

    @Autowired
    CoronaVirusDataService coronaVirusDataService;

    @GetMapping("/home")
    public String home(Model model) {
        model.addAttribute("testName",  coronaVirusDataService.getAllStats());
        return "home";
    }
}
