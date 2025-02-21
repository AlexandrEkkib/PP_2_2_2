package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Cars;
import web.model.CarsService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Controller
public class CarsController {

    @GetMapping("/cars")
    public String getCars(@RequestParam(value = "count", required = false) Integer n
            ,Model model){

        List<Cars> carsList = new ArrayList<>();
        carsList.add(new Cars(1000,"MB", 100));
        carsList.add(new Cars(1001,"MB", 100));
        carsList.add(new Cars(1002,"MB", 102));
        carsList.add(new Cars(1003,"MB", 104));
        carsList.add(new Cars(1004,"MB", 102));

        carsList = CarsService.carsCount(carsList, n);
        model.addAttribute("carsList", carsList);

        return "cars";
    }
}
