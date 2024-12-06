package ru.mtuci.rbpo_2024_praktika.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//TODO: 1. Контроллеров мало. Нужно обеспечить больше возможностей для управления сущностями (CRUD)

@RestController
@RequiredArgsConstructor
public class HomeController {
    @GetMapping("/home")
    public String home(){
        return "home";
    }
}
