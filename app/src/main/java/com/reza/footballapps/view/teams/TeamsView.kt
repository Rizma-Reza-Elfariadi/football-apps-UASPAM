package com.reza.footballapps.view.teams

import com.reza.footballapps.model.LeagueResponse
import com.reza.footballapps.model.TeamsItem

interface TeamsView {

    fun showLoading()
    fun hideLoading()
    fun showEmptyData()
    fun showLeagueList(data: LeagueResponse)
    fun showTeamList(data: MutableList<TeamsItem>)
}
