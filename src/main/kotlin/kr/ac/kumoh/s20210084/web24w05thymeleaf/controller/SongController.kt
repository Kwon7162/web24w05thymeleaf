package kr.ac.kumoh.s20210084.web24w05thymeleaf.controller

import kr.ac.kumoh.s20210084.web24w05thymeleaf.service.SongService
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping

@Controller
class SongController(val songService: SongService) {
    @GetMapping("/song/random")
    fun getRandomSong(model: Model): String {
        model.addAttribute("Song",
            songService.getRandomSong())
        return "random"
    }
}