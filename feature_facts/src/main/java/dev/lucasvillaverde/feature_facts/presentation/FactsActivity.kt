package dev.lucasvillaverde.feature_facts.presentation

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.squareup.picasso.Picasso
import dev.lucasvillaverde.feature_facts.databinding.ActivityFactsBinding
import org.kodein.di.DI
import org.kodein.di.DIAware
import org.kodein.di.instance

class FactsActivity : AppCompatActivity(), DIAware {
    override val di: DI by lazy { (applicationContext as DIAware).di }

    private lateinit var binding: ActivityFactsBinding

    private val picasso: Picasso by instance()
    private val viewModelFactory: ViewModelProvider.Factory by instance()
    private val factsViewModel: FactsViewModel by viewModels { viewModelFactory }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFactsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupClickListeners()
        setupDogFactObserver()
        setupDogPictureObserver()
    }

    private fun setupClickListeners() {
        binding.btnGetRandomFact.setOnClickListener {
            factsViewModel.fetchDogPicture()
            factsViewModel.fetchDogFacts()
        }
    }

    private fun setupDogFactObserver() {
        factsViewModel.dogFacts.observe(this) { dogFactModelList ->
            if (dogFactModelList.isEmpty())
                return@observe

            binding.tvFacts.text = dogFactModelList.random().fact
        }
    }

    private fun setupDogPictureObserver() {
        factsViewModel.dogPicture.observe(this) { dogPicture ->
            picasso
                .load(dogPicture.pictureUrl)
                .into(binding.ivDogPicture)
        }
    }
}