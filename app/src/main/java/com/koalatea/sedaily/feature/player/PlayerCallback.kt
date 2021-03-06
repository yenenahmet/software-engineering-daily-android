package com.koalatea.sedaily.feature.player

import androidx.lifecycle.LiveData
import com.koalatea.sedaily.database.model.Episode

interface PlayerCallback {

    val playerStatusLiveData: LiveData<PlayerStatus>

    fun play(episode: Episode)
    fun stop()

}