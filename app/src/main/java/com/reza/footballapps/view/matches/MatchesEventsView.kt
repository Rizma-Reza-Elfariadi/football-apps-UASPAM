package com.reza.footballapps.view.matches

import com.reza.footballapps.model.EventsItem
import com.reza.footballapps.model.LeagueResponse

interface MatchesEventsView {

    fun showLoading()
    fun hideLoading()
    fun showEmptyData()
    fun showLeagueList(data: LeagueResponse)
    fun showEventList(data: MutableList<EventsItem>)
}
