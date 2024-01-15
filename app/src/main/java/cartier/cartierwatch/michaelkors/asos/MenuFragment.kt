package cartier.cartierwatch.michaelkors.asos

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import cartier.cartierwatch.michaelkors.asos.databinding.FragmentMenuBinding


class MenuFragment : Fragment() {

    private var _binding: FragmentMenuBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentMenuBinding.inflate(inflater, container, false)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        with(binding) {
            cartierCollections.setOnClickListener {
                findNavController().navigate(R.id.navigation_cartier_collections)
            }
            about.setOnClickListener {
                findNavController().navigate(R.id.navigation_about)
            }
            privacyPolicy.setOnClickListener {

            }
        }
    }

    override fun onDestroyView() {
        _binding = null
        super.onDestroyView()
    }
}