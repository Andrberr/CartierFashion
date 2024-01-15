package cartier.cartierwatch.michaelkors.asos

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import cartier.cartierwatch.michaelkors.asos.databinding.FragmentCollectionBinding

class CollectionFragment : Fragment() {
    private var _binding: FragmentCollectionBinding? = null
    private val binding get() = _binding!!

    private val collectionId by lazy {
        requireArguments().getInt(COLLECTION_ID)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentCollectionBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val adapter = CollectionAdapter()
        binding.recycler.apply {
            this.adapter = adapter
            this.layoutManager =
                LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)
        }
        val list = mutableListOf<Item>()
        with(binding) {
            when (collectionId) {
                1 -> {
                    titleView.text =
                        "Cartier Love Collection: A Timeless Embrace of Affection and Style"
                    descriptionView.text =
                        "The Cartier Love Collection stands as an enduring testament to timeless love and sophisticated style. Each piece within this iconic collection is a declaration of eternal commitment and refinement. Crafted with the utmost precision and adorned with the signature Love screw motifs, these exquisite creations have become synonymous with enduring bonds and devotion."
                    list.add(
                        Item(
                            title = "Love Bracelets:",
                            description = getString(R.string.cartier_love_1),
                            resId = R.drawable.item1
                        )
                    )
                    list.add(
                        Item(
                            title = "Love Rings:",
                            description = getString(R.string.cartier_love_2),
                            resId = R.drawable.item2
                        )
                    )
                    list.add(
                        Item(
                            title = "Love Necklaces:",
                            description = getString(R.string.cartier_love_3),
                            resId = R.drawable.item3
                        )
                    )
                    list.add(
                        Item(
                            title = "Love Earrings:",
                            description = "The Love Earrings are a harmonious blend of classic design and contemporary elegance. These earrings incorporate the iconic screw motifs, creating a visual representation of unity and lasting love. Whether in the form of hoops or studs, Love Earrings from Cartier are an expression of enduring style and commitment.\n" +
                                    "The Cartier Love Collection transcends the realm of jewelry, embodying a profound narrative of love, unity, and commitment. It has become a global symbol of enduring relationships and remains a sought-after choice for those who cherish the beauty of meaningful connections. Each piece in the Love Collection is a testament to Cartier's commitment to excellence, making it a treasured and timeless addition to the world of fine jewelry.",
                            resId = R.drawable.item4
                        )
                    )
                }

                2 -> {
                    titleView.text =
                        "Cartier Juste un Clou Collection: Redefining Elegance with Bold Modernity"
                    descriptionView.text =
                        "The Cartier Juste un Clou Collection is a daring reinterpretation of traditional jewelry, encapsulating a spirit of audacity and modernity. Translating to \"Just a Nail\" in French, this collection transforms everyday objects into extraordinary works of art, challenging conventions and celebrating the unconventional."
                    list.add(
                        Item(
                            title = "Clou Bracelets:",
                            description = "At the heart of the Juste un Clou Collection are the iconic Clou Bracelets, crafted to resemble a nail wrapped around the wrist. These bracelets exude an avant-garde vibe, pushing the boundaries of traditional jewelry design. Available in various materials such as yellow gold, white gold, and rose gold, the Clou Bracelet is a statement piece that defies expectations.",
                            resId = R.drawable.item5
                        )
                    )
                    list.add(
                        Item(
                            title = "Clou Rings:",
                            description = "The Clou Rings capture the essence of rebellious chic with a nail-shaped design encircling the finger. These rings embody a sense of spontaneity and unconventional elegance, making a bold statement. Whether worn individually or stacked, Clou Rings from Cartier add an edgy flair to any ensemble.",
                            resId = R.drawable.item6
                        )
                    )
                    list.add(
                        Item(
                            title = "Clou Necklaces:",
                            description = "Juste un Clou Necklaces showcase the collection's distinctive nail motif, reimagined as a pendant. The necklace design is sleek and minimalist, yet it carries a powerful impact. These necklaces effortlessly blend casual and chic elements, making them a perfect accessory for those who appreciate a contemporary and unconventional style.",
                            resId = R.drawable.item7
                        )
                    )
                    list.add(
                        Item(
                            title = "Clou Earrings:",
                            description = "Clou Earrings from Cartier embody a sense of rebellion and sophistication. With the nail motif elegantly incorporated into the design, these earrings are a symbol of fearless individuality. Whether in hoop or stud form, Clou Earrings offer a unique and captivating expression of modern glamour.\n" +
                                    "The Cartier Juste un Clou Collection challenges the norm, redefining the boundaries of traditional jewelry. Each piece is a fusion of elegance and bold modernity, capturing the spirit of those who dare to be different. Juste un Clou is more than a collection; it's a manifesto of individuality and a celebration of the extraordinary in the everyday. With its audacious designs, this collection continues to resonate with those who seek to make a statement and embrace the unconventional in the world of high-end jewelry.",
                            resId = R.drawable.item8
                        )
                    )
                }

                3 -> {
                    titleView.text =
                        "Cartier Panthère de Cartier Collection: The Majestic Spirit of the Panther"
                    descriptionView.text =
                        "The Panthère de Cartier Collection pays homage to the enigmatic and powerful spirit of the panther, an iconic symbol that has become synonymous with Cartier's heritage. This collection artfully captures the essence of this majestic creature, transforming it into a source of inspiration for exquisite jewelry that embodies strength, grace, and untamed beauty."
                    list.add(
                        Item(
                            title = "Panthère de Cartier Watches:",
                            description = "The Panthère de Cartier Watches are a true manifestation of the panther's spirit in horological form. With their distinctive panther-head motifs incorporated into the watch faces and bracelets, these timepieces are a fusion of function and artistry. The watches celebrate the panther's wild nature while maintaining the precision and elegance expected from Cartier.",
                            resId = R.drawable.item9
                        )
                    )
                    list.add(
                        Item(
                            title = "Panthère de Cartier Rings:",
                            description = "Panthère de Cartier Rings showcase the feline grace and power with panther-inspired designs. Rings often feature panther heads or silhouettes adorned with precious gemstones, creating a captivating blend of sophistication and ferocity. Each piece is a bold statement of individuality and style.",
                            resId = R.drawable.item5
                        )
                    )
                    list.add(
                        Item(
                            title = "Panthère de Cartier Necklaces:",
                            description = "Necklaces in the Panthère de Cartier Collection capture the fluidity of the panther's movement. The designs elegantly incorporate panther motifs into chains or pendants, creating a sense of strength and dynamism. These necklaces are a symbol of untamed beauty and refined craftsmanship.",
                            resId = R.drawable.item2
                        )
                    )
                    list.add(
                        Item(
                            title = "Panthère de Cartier Bracelets:",
                            description = "Panthère de Cartier Bracelets bring the panther to life with their sculptural representations of the feline form. Crafted with meticulous attention to detail, these bracelets feature panther heads, bodies, or abstract interpretations, resulting in pieces that exude both power and grace.\n" +
                                    "The Panthère de Cartier Collection is not just about jewelry; it's a celebration of the panther's role as a muse for Cartier. Each piece is an ode to the mysterious allure of this captivating creature, symbolizing the untamed spirit within us all. With a perfect balance of strength and elegance, this collection is a testament to Cartier's ability to transform inspiration into timeless works of art.",
                            resId = R.drawable.item7
                        )
                    )
                }

                4 -> {
                    titleView.text =
                        "Cartier Amulette de Cartier Collection: Mystical Elegance and Personal Empowerment"
                    descriptionView.text =
                        "The Amulette de Cartier Collection invites you into a world of enchantment, where each piece serves as a personal talisman, radiating a sense of mystique and empowerment. Inspired by the concept of protective amulets, this collection combines precious materials and intricate designs to create jewelry that goes beyond adornment, becoming a source of positive energy and self-expression."
                    list.add(
                        Item(
                            title = "Amulette de Cartier Necklaces:",
                            description = "At the heart of the collection are the Amulette de Cartier Necklaces, featuring delicate pendants that house a variety of precious stones. These stones are chosen not only for their beauty but also for their symbolic significance. The necklaces are designed to be more than just accessories; they are amulets that carry personal meaning and positive energy.",
                            resId = R.drawable.item8
                        )
                    )
                    list.add(
                        Item(
                            title = "Amulette de Cartier Rings:",
                            description = "The Amulette de Cartier Rings continue the theme of personal empowerment, with each ring featuring a carefully selected gemstone set in an exquisite design. Whether adorned with mother-of-pearl, onyx, or other vibrant stones, these rings are a statement of individuality and a celebration of the wearer's unique spirit.",
                            resId = R.drawable.item3
                        )
                    )
                    list.add(
                        Item(
                            title = "Amulette de Cartier Earrings:",
                            description = "Earrings in the Amulette de Cartier Collection capture the essence of mystical elegance. The designs feature gemstone accents, creating a harmonious balance between simplicity and sophistication. These earrings are a subtle yet powerful addition to any ensemble, reflecting the wearer's connection to the energies embodied in the collection.",
                            resId = R.drawable.item1
                        )
                    )
                    list.add(
                        Item(
                            title = "Amulette de Cartier Bracelets:",
                            description = "The Amulette de Cartier Bracelets showcase the collection's signature charm, incorporating meaningful gemstones into the bracelet's design. The result is a combination of style and spirituality, as each bracelet becomes a personal talisman that accompanies the wearer on their journey.",
                            resId = R.drawable.item6
                        )
                    )
                    list.add(
                        Item(
                            title = "Amulette de Cartier Watches:",
                            description = "The Amulette de Cartier Watches infuse the concept of protective amulets into timepieces. The watches feature delicate designs with gemstone accents, providing a touch of mystical elegance to the wearer. These watches are a fusion of functionality and symbolic significance." +
                                    "\n" +
                                    "The Amulette de Cartier Collection transcends traditional jewelry, offering pieces that resonate on a deeper level. Each item is a personal amulet, allowing the wearer to carry positive energies and meaningful symbolism with them. With a perfect blend of spirituality and style, this collection empowers individuals to express their unique identity and embrace the mystical allure of Cartier craftsmanship.",
                            resId = R.drawable.item4
                        )
                    )
                }

                else -> {
                    titleView.text =
                        "Cartier Clash de Cartier Collection: A Bold Fusion of Elegance and Rebellion"
                    descriptionView.text =
                        "The Clash de Cartier Collection represents a departure from convention, embodying a spirit of rebellion and audacity. Crafted with a daring and contemporary design approach, each piece in this collection juxtaposes opposing elements, creating a harmonious clash that defies traditional norms and celebrates the beauty of contradictions."
                    list.add(
                        Item(
                            title = "Clash de Cartier Rings:",
                            description = "At the core of the collection are the Clash de Cartier Rings, where traditional craftsmanship clashes with unconventional design. These rings feature stacked and overlapping elements, creating a sense of dynamic tension. With a mix of polished and studded textures, they become symbols of bold individuality and modern sophistication.",
                            resId = R.drawable.item2
                        )
                    )
                    list.add(
                        Item(
                            title = "Clash de Cartier Necklaces:",
                            description = "Clash de Cartier Necklaces continue the theme of unexpected elegance, with chain links that clash and intertwine. The necklaces feature a balance between structure and fluidity, resulting in pieces that make a statement while exuding an air of effortless coolness. This collection redefines the traditional idea of a necklace, offering a fresh and modern interpretation.",
                            resId = R.drawable.item8
                        )
                    )
                    list.add(
                        Item(
                            title = "Clash de Cartier Bracelets:",
                            description = "The Clash de Cartier Bracelets challenge conventional notions of wrist adornment. With their distinctive double C-shaped structure, these bracelets fuse opposites – curves and angles, polished and textured surfaces. The clash of elements in these bracelets reflects the wearer's rebellion against the ordinary, embracing a style that is both sophisticated and unapologetically bold.",
                            resId = R.drawable.item9
                        )
                    )
                    list.add(
                        Item(
                            title = "Clash de Cartier Earrings:",
                            description = "Earrings in the Clash de Cartier Collection elevate the clash of elements to new heights. Whether in the form of studs or dangling pieces, they play with asymmetry and unexpected combinations. These earrings are a testament to the beauty that emerges when opposing forces come together in perfect harmony." +
                                    "\n" +
                                    "The Clash de Cartier Collection stands as an invitation to embrace the clash of contradictions within ourselves and celebrate the beauty that emerges from the tension between opposites. Each piece is a bold expression of individuality, offering a contemporary and rebellious take on Cartier's legacy of elegance. With Clash de Cartier, the clash becomes a celebration of the unconventional, a fusion of rebellious spirit and timeless sophistication.",
                            resId = R.drawable.item6
                        )
                    )
                }
            }
        }
        adapter.setItems(list)
    }

    override fun onDestroyView() {
        _binding = null
        super.onDestroyView()
    }

    companion object {
        const val COLLECTION_ID = "collection_id"
    }
}