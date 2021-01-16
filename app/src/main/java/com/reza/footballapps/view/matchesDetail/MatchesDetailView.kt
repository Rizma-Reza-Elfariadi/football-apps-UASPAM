package com.reza.footballapps.view.matchesDetail

import com.reza.footballapps.model.TeamsItem

interface MatchesDetailView {

    fun showLoading()
    fun hideLoading()
    fun showTeamDetail(dataHomeTeam: MutableList<TeamsItem>, dataAwayTeam: MutableList<TeamsItem>)
}
