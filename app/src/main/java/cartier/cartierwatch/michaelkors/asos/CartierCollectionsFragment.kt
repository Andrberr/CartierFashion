package cartier.cartierwatch.michaelkors.asos

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
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

    }

    override fun onDestroyView() {
        _binding = null
        super.onDestroyView()
    }
}