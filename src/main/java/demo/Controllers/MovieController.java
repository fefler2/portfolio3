package demo.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieController {
    @GetMapping("movies")
    public String returnMovie(){
        return "movies";
    }

    @GetMapping("movie2")
    public String returnMovie2(@RequestParam String s){
        return "movie name = " + s;
    }

    @GetMapping("error")
    public Exception returnError(String s){
        return new Exception();
    }


    @GetMapping("error2")
    public Exception returnError2(String s){
        return new ArrayIndexOutOfBoundsException("blad");
    }

    @GetMapping("error2")
    public Exception returnError3(String s){

        return new ArrayIndexOutOfBoundsException("blad");
    }

}
