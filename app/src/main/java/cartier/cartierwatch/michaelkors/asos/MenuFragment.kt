package cartier.cartierwatch.michaelkors.asos

import android.content.Intent
import android.net.Uri
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
                openPrivacyPolicy()
            }
        }
    }

    private fun openPrivacyPolicy() {
        val intent = Intent(
            Intent.ACTION_VIEW,
            Uri.parse("https://telegra.ph/Privacy-Policy-for-Cartier--Fashion-01-10")
        )
        startActivity(intent)
    }

    override fun onDestroyView() {
        _binding = null
        super.onDestroyView()
    }
}