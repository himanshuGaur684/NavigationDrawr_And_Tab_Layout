package gaur.himanshu.august.navigationdrawrtablayout.fragments.drawr

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import gaur.himanshu.august.navigationdrawrtablayout.R
import gaur.himanshu.august.navigationdrawrtablayout.viewpageradapter.ViewPagerAdapter

class ThirdFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
       val views=inflater.inflate(R.layout.fragment_third, container, false)
setUpTabLayout(views)

        return views
    }

    private fun setUpTabLayout(view:View) {
        val viewPage2 = view.findViewById<ViewPager2>(R.id.view_pager_2)
        val tabLayout = view.findViewById<TabLayout>(R.id.tab_layout)
        val viewPagerAdapter = ViewPagerAdapter(requireActivity().supportFragmentManager, lifecycle)
        viewPage2.adapter = viewPagerAdapter
        TabLayoutMediator(tabLayout, viewPage2) { tablayout, position ->
            when (position) {
                0 -> {
                    tablayout.text = "First"
                }
                1 -> {
                    tablayout.text = "Second"
                }
            }
        }.attach()

    }





}