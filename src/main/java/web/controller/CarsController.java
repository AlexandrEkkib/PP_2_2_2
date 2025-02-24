package web.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Cars;
import web.model.CarsService;
import web.model.CarsServiceImpl;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarsController {
    CarsService carsService = new CarsServiceImpl();
    @GetMapping("/cars")
    public String getCars(@RequestParam(value = "count", required = false) Integer n
            ,Model model){

        model.addAttribute("carsList", carsService.carsCount(n));

        return "cars";
    }
}
