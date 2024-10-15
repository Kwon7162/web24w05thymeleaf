package kr.ac.kumoh.s20210084.web24w05thymeleaf.repository

import kr.ac.kumoh.s20210084.web24w05thymeleaf.model.song
import org.springframework.stereotype.Repository

@Repository
class SongRepository {
    protected val songs = listOf(
        song(1, "Supernova", "aespa"),
        song(2, "별별별", "NMIXX"),
        song(3, "odoriko", "vaundy"),
    )

    val songSize: Int
        get() = songs.size;

    fun getSong(index: Int) = songs[index];

    fun fetchSong() = songs
}