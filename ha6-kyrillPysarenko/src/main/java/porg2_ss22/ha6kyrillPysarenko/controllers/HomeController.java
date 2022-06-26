package porg2_ss22.ha6kyrillPysarenko.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import porg2_ss22.ha6kyrillPysarenko.models.LocationStats;
import porg2_ss22.ha6kyrillPysarenko.services.CoronaVirusDataService;

import javax.xml.stream.Location;
import java.util.List;


@Controller
public class HomeController {

    @Autowired
    CoronaVirusDataService coronaVirusDataService;

    @GetMapping("/")
    public String home(Model model) {
        List<LocationStats> allStats = coronaVirusDataService.getAllStats();
        int totalCases = allStats.stream().mapToInt(stat -> stat.getLatestTotalCases()).sum();
        model.addAttribute("locationStats", allStats);
        model.addAttribute("totalReportedCases", totalCases);

        return "home";
    }
}
