package edu.xatu.webqq.Controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Controller注解表示当前类交给spring管理
 *
 */
@Controller
public class HelloController {

    @GetMapping("/Hello")
    public String Hello(@RequestParam(name = "name")String name,Model model){
        model.addAttribute("name",name);
        //将哇美好也传过来的参数信息name传给model
        return "Hello";
        //return 后的字符串就是在资源文件里去找templates下的HTML文件名
    }
}
