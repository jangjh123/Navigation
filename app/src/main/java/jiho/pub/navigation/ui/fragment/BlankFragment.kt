package jiho.pub.navigation.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import jiho.pub.navigation.R
import jiho.pub.navigation.base.BaseFragment
import jiho.pub.navigation.databinding.FragmentBlankBinding

class BlankFragment : BaseFragment<FragmentBlankBinding>(R.layout.fragment_blank) {
    override fun onResume() {
        super.onResume()

        binding.textView.text = "a"
    }
}