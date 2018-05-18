package todos;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TodosController {

    @GetMapping("/")
    public String todos(@RequestParam(name="name", required=false, defaultValue="asd") String name, Model model) {
        model.addAttribute("name", name);
        return "todos";
    }

}
