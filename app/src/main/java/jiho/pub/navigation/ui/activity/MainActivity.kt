package jiho.pub.navigation.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.navigation.NavController
import androidx.navigation.NavHost
import androidx.navigation.Navigation
import androidx.navigation.compose.NavHost
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.setupWithNavController
import jiho.pub.navigation.R
import jiho.pub.navigation.base.BaseActivity
import jiho.pub.navigation.databinding.ActivityMainBinding

class MainActivity : BaseActivity<ActivityMainBinding>(R.layout.activity_main) {
    override fun init() {
        super.init()

        initNavigation()
    }

    private fun initNavigation() {
        val navController = findNavController(R.id.nav_host)
        binding.bottomNavigation.setupWithNavController(navController)
        
        binding.tabA.setOnClickListener {
            navController.navigate(R.id.action_global_blankFragment)
        }
        binding.tabB.setOnClickListener {
            navController.navigate(R.id.action_global_tab2Fragment)
        }
    }
}