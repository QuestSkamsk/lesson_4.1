package com.example.lesson_41

import androidx.test.espresso.Espresso
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.espresso.matcher.ViewMatchers.withId


class TabBarPage {
    fun checkHome(): TabBarPage{
    Espresso.onView(withId(R.id.navigation_home)).check(matches(isDisplayed()))
        return this
    }
    fun checkDashboard(): TabBarPage {
        Espresso.onView(withId(R.id.navigation_dashboard)).check(matches(isDisplayed()))
        return this
    }
    fun checkNotifications(): TabBarPage {
        Espresso.onView(withId(R.id.navigation_notifications)).check(matches(isDisplayed()))
        return this
    }

}