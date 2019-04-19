package demo.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

    int a = 4;

    @GetMapping
    public String returnS(){
        System.out.println("page reload");
        a++;
        System.out.println(a);
        return "s";
    }

    public int add(int a, int b) {
         return a+b;
    }
    public static void main(String[] args) {

    }

}
