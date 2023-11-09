package RequestMapping;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AmbiguousMap {

    @RequestMapping(value = "/writeArticles")
    public String writeArticles() {
        return "5 Articles written on GeeksForGeeks !";
    }

    @RequestMapping(value = "/doLaundry")
    public String doLaundry() {
        return "Laundry done at 5 PM !";
    }
}

