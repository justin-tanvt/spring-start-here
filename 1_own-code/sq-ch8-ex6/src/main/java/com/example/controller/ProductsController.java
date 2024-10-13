package com.example.controller;

import com.example.model.Product;
import com.example.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class ProductsController {

    private ProductService productService;

    public ProductsController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/products")
    public String viewProducts(Model model) {
        List<Product> listOfProducts = this.productService.findAll();
        model.addAttribute("listOfProductsAttr", listOfProducts);
        return "products.html";
    }

    @PostMapping("/products")
    public String addProduct(
        Product newProduct,
        Model model) {
        this.productService.addProduct(newProduct);

        List<Product> listOfProducts = this.productService.findAll();
        model.addAttribute("listOfProductsAttr", listOfProducts);

        return "products.html";
    }
}
