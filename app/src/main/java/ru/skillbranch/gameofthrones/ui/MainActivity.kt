package ru.skillbranch.gameofthrones.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.google.android.material.snackbar.Snackbar
import ru.skillbranch.gameofthrones.R

class MainActivity : AppCompatActivity() {
    private lateinit var viewModel: MainViewModel
    lateinit var navController: NavController


    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(R.style.AppTheme)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initModel()
        savedInstanceState?: prepareData()
        navController = Navigation.findNavController(this, R.id.nav_host_fragment)
    }

    private fun prepareData() {
        viewModel.syncDataIfNeed().observe(this, Observer<LoadResult<Boolean>> {
            when (it) {
                is LoadResult.Loading -> {
                    navController.navigate(R.id.nav_splash)
                }
                is LoadResult.Success -> {
                    val action = SplashFragmentDirectons.actionNavsplashToNavHouses ()
                    navController.navigate(action)
                }
                is LoadResult.Error -> {
                    Snackbar.make(
                        root_contaner,
                        it.errorMessage.toString(),
                        Snackbar.LENGTH_INDEFINITE
                    ).show()
                }
            }
        })
    }
}