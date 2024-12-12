package jay.springboot_web_applications;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ApplicationController {

    @GetMapping("/")
    public String getDashboard() {
        return "views/backend/dashboard/index";
    }

    @GetMapping("/create-product")
    public String getCreateProduct() {
        return "views/backend/product/create";
    }

    @GetMapping("/update-product")
    public String getUpdateProduct() {
        return "views/backend/product/update";
    }

    @GetMapping("/list-product")
    public String getListProduct() {
        return "views/backend/product/index";
    }
}
