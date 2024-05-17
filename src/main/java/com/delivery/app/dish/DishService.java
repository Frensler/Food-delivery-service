package com.delivery.app.dish;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DishService {

    @Autowired
    private DishRepository dishesRepository;
}
