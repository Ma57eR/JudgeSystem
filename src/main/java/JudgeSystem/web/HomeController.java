package JudgeSystem.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @GetMapping("/")
    /*
    Ако използваме ResponseBody, ИДЕто интерпретира
    кода в ретърн директно като ХТМЛ код, а не като връзка
    към файл.
    В сегашния случай, index води към templates/index.html
     */

    public String index() {
        return "index";
    }

}
