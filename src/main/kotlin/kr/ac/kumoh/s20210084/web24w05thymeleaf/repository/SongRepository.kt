package kr.ac.kumoh.s20210084.web24w05thymeleaf.repository

import kr.ac.kumoh.s20210084.web24w05thymeleaf.model.Song
import org.springframework.stereotype.Repository

@Repository
class SongRepository {
    protected val songs = listOf(
        Song(1, "Supernova", "aespa"),
        Song(2, "별별별", "NMIXX"),
        Song(3, "odoriko", "vaundy"),
    )

    val songSize: Int
        get() = songs.size;

    fun getSong(index: Int) = songs[index];

    fun fetchSong() = songs
}