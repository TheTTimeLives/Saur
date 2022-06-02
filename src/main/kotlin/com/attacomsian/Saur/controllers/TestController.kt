package com.attacomsian.Saur.controllers

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("api")
class TestController {

    @GetMapping("/test")
    fun test(): String = "This is the test controller"
}