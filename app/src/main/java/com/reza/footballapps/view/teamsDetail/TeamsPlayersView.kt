package com.reza.footballapps.view.teamsDetail

import com.reza.footballapps.model.PlayersItem

interface TeamsPlayersView {

    fun showLoading()
    fun hideLoading()
    fun showEmptyData()
    fun showPlayerList(data: MutableList<PlayersItem>)
}
