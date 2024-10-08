package kr.ac.kumoh.s20210084.web24w05thymeleaf.service

import kr.ac.kumoh.s20210084.web24w05thymeleaf.repository.SongRepository
import org.springframework.stereotype.Service
import kotlin.random.Random

@Service
class SongService(val repository: SongRepository) {

    fun getRandomSong() = repository.getSong(Random.nextInt(repository.songSize))

    fun getAllSongs() = repository.fetchSong()
}