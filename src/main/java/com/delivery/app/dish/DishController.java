package com.delivery.app.dish;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/dishes")
public class DishController {

    @Autowired
    private DishService dishesService;
}
