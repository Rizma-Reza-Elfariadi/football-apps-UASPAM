package com.reza.footballapps.view.favorites

import com.reza.footballapps.model.EventsItem
import com.reza.footballapps.model.TeamsItem

interface FavoritesTabsView {

    fun showLoading()
    fun hideLoading()
    fun showEmptyData()
    fun showEventList(data: MutableList<EventsItem>)
    fun showTeamList(data: MutableList<TeamsItem>)
}
