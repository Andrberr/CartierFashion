package cartier.cartierwatch.michaelkors.asos

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.fragment.findNavController
import cartier.cartierwatch.michaelkors.asos.databinding.FragmentCartierCollectionsBinding

class CartierCollectionsFragment : Fragment() {
    private var _binding: FragmentCartierCollectionsBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentCartierCollectionsBinding.inflate(inflater, container, false)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        with(binding) {
            cartierLoveBtn.setOnClickListener {
                navigateToCollectionFragment(1)
            }
            justeUnClouBtn.setOnClickListener {
                navigateToCollectionFragment(2)
            }
            panthereBtn.setOnClickListener {
                navigateToCollectionFragment(3)
            }
            amuletteBtn.setOnClickListener {
                navigateToCollectionFragment(4)
            }
            clashBtn.setOnClickListener {
                navigateToCollectionFragment(5)
            }
        }
    }

    private fun navigateToCollectionFragment(id: Int) {
        val bundle = bundleOf(CollectionFragment.COLLECTION_ID to id)
        findNavController().navigate(R.id.navigation_collection, bundle)
    }

    override fun onDestroyView() {
        _binding = null
        super.onDestroyView()
    }
}