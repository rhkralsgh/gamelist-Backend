package kr.ac.kumoh.s20210053.gamelist_Backend.controller

import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@CrossOrigin(origins = ["https://gamelistfrontend.netlify.app/"])
class MessageController {

    @GetMapping
    fun getRoot() = mapOf("status" to "success")

    @GetMapping("/api/message")
    fun getMessage() = mapOf("status" to "success")
}