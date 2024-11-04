package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/path")
public class ApiController {

    @Autowired
    ProductRepo productRepo;


    @GetMapping("/getProduct")
    public List<Product> abc() {
        return productRepo.findAll();
    }


    @GetMapping("/{id}")
    public Product getProductById(@PathVariable("id") int id) {
        return productRepo.findById(id).orElse(new Product());
    }

    @PostMapping("/addProduct")
    public Product addProduct(@RequestBody Product product) {
        return productRepo.save(product);
    }

    @PutMapping("/update")
    public Product updateProduct(@RequestBody Product product) {
        return productRepo.save(product);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteProductById(@PathVariable int id) {
        productRepo.deleteById(id);
        return new ResponseEntity<>("success", HttpStatus.OK);
    }
}
