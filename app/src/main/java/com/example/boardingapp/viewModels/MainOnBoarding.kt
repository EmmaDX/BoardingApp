package com.example.boardingapp.viewModels

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController
import com.example.boardingapp.R
import com.example.boardingapp.data.PageData
import com.example.boardingapp.dataStore.StoreBoarding
import com.example.boardingapp.onBoardViews.OnBoardingPager
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.rememberPagerState

@OptIn(ExperimentalPagerApi::class,
    ExperimentalFoundationApi::class)
@Composable
fun MainOnBoarding(navController: NavController, store: StoreBoarding){
    val items = ArrayList<PageData>()

    items.add(
        PageData(
            R.raw.page1,
            "Bienvenido",
            "Bienvenido a la app de onBoarding"
        )
    )

    items.add(
        PageData(
            R.raw.page2,
            "Uso de onBoarding",
            "Mostrando una descripcion en la pagina 2"
        )
    )

    items.add(
        PageData(
            R.raw.page4,
            "Pantalla Extra",
            "Pantalla extra agregada para practica"
        )
    )

    items.add(
        PageData(
            R.raw.page3,
            "Despedida",
            "Pagina final del onBoarding"
        )
    )

    val pagerState = rememberPagerState(
        pageCount = items.size,
        initialOffscreenLimit = 2,
        infiniteLoop = false,
        initialPage = 0
    )

    OnBoardingPager(
        item = items,
        pagerState = pagerState,
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
        navController,
        store
    )
}