package online.cafeteria.online.cafeteria.Food;

import online.cafeteria.online.cafeteria.student.Student;
import online.cafeteria.online.cafeteria.student.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "api/cafe/student/food")
public class FoodController {

    private final  FoodService foodService;

    @Autowired
    public FoodController(FoodService foodService) {
        this.foodService = foodService;
    }

    @GetMapping
    public List<Food> getFood() {
        return  foodService.getfoodlist();
    }
}
