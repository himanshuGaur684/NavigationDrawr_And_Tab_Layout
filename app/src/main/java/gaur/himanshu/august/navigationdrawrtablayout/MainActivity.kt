package gaur.himanshu.august.navigationdrawrtablayout

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.navigation.NavigationView
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import gaur.himanshu.august.navigationdrawrtablayout.viewpageradapter.ViewPagerAdapter

class MainActivity : AppCompatActivity() {

    private lateinit var navigationView: NavigationView
    private lateinit var navController: NavController
    private lateinit var drawrLayout: DrawerLayout
    private lateinit var appBarConiguration: AppBarConfiguration

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        navigationView = findViewById(R.id.navigation_view)
        navController = findNavController(R.id.container_fragment)

        drawrLayout = findViewById(R.id.main_root)
        appBarConiguration = AppBarConfiguration(navController.graph, drawrLayout)

        navigationView.setupWithNavController(navController)

        setupActionBarWithNavController(navController, appBarConiguration)

    }



    override fun onSupportNavigateUp(): Boolean {
        navController = findNavController(R.id.container_fragment)
        return navController.navigateUp(appBarConiguration) || super.onSupportNavigateUp()
    }
}