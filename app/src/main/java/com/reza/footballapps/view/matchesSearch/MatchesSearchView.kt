package com.reza.footballapps.view.matchesSearch

import com.reza.footballapps.model.EventsItem

interface MatchesSearchView {

    fun showLoading()
    fun hideLoading()
    fun showEmptyData()
    fun showEventList(data: MutableList<EventsItem>)
}
