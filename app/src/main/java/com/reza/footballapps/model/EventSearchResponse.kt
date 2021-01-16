package com.reza.footballapps.model

import com.google.gson.annotations.SerializedName

data class EventSearchResponse(

        @field:SerializedName("event")
        val events: MutableList<EventsItem>
)
