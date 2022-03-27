package com.example.lesson_41

import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.example.lesson_41.TabBarPage
import com.example.lesson_41.MainActivity
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith


@RunWith(AndroidJUnit4::class)
class TabBarTests {
    @get:Rule
    val activityRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun checkHome (){
    }
    @Test
    fun checkDashboard (){
    }
    @Test
    fun checkNotifications (){
    }

}