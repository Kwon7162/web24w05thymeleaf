package kr.ac.kumoh.s20210084.web24w05thymeleaf.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

@Controller
class SongController {
    @GetMapping("/song/random")
    fun getRandomSong(): String {
        return "random"
    }
}