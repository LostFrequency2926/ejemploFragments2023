package com.danielfmunoz.ejemplofragments2023.ui.main

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.danielfmunoz.ejemplofragments2023.*

private val TAB_TITLES = arrayOf(
    R.string.WonderwomanName,
    R.string.SupermanName,
    R.string.BatmanName,
    R.string.FlashName
)

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
class SectionsPagerAdapter(private val context: Context, fm: FragmentManager) :
    FragmentPagerAdapter(fm) {

    override fun getItem(position: Int): Fragment {
        return when (position){
            0 -> WonderWomanFragment()
            1 -> SupermanFragment()
            2 -> BatmanFragment()
            else -> FlashFragment()
        }
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return context.resources.getString(TAB_TITLES[position])
    }

    override fun getCount(): Int {
        // Show 2 total pages.
        return 4
    }
}