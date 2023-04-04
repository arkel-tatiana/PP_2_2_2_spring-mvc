package web.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;

@Controller

public class CarController {

    private CarService carService;

    @Autowired
    public CarController(CarService carService) {
        this.carService = carService;
    }

    @RequestMapping(value = "/cars")
    public String printWelcome(ModelMap modelCar, @RequestParam(value = "count", defaultValue = "5") Integer count) {
        modelCar.addAttribute("carsList", carService.getCar().subList(0,count));
        return "cars";
    }
}
