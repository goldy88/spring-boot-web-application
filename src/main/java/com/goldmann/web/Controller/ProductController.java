package com.goldmann.web.Controller;


import com.goldmann.web.dto.ProductRepository;
import com.goldmann.web.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductController {

    @Autowired
    private ProductRepository productRepo;

    @GetMapping("/listProducts.html")
    public String showExample(Model model){

        Product p = new Product();
        Long id = (long) 1;
        p = productRepo.findById(id).get();
        model.addAttribute("product", p);
        return "/listProducts.html";
    }

    @GetMapping("/")
    public String showAddProduct(){
        return "/addProduct.html";
    }

}
