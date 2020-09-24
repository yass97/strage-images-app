package com.yass.strageimagesapp.ui

import android.Manifest
import android.content.pm.PackageManager
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import com.yass.strageimagesapp.databinding.FragmentStrageImagesBinding
import com.yass.strageimagesapp.view_model.StrageImagesViewModel
import org.koin.android.ext.android.inject

class StrageImagesFragment : Fragment() {

    private val strageImagesViewModel by inject<StrageImagesViewModel>()

    private val strageImagesAdapter by inject<StrageImagesAdapter>()

    private lateinit var binding: FragmentStrageImagesBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentStrageImagesBinding.inflate(inflater, container, false).apply {
            lifecycleOwner = this@StrageImagesFragment
            viewModel = strageImagesViewModel
        }

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setUpRecyclerView()
    }

    override fun onResume() {
        super.onResume()

        if (allPermissionGranted()) {
            loadImages()
        } else {
            requestPermissions(PERMISSIONS, REQUEST_CODE_PERMISSION)
        }
    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)

        if (requestCode == REQUEST_CODE_PERMISSION) {

            if (grantResults.isNotEmpty() && (grantResults.first() == PackageManager.PERMISSION_GRANTED)) {
                loadImages()
            }
        }
    }

    private fun setUpRecyclerView() {

        binding.recyclerView.apply {
            layoutManager = GridLayoutManager(requireActivity(), 3)
            adapter = strageImagesAdapter
        }
    }

    private fun loadImages() = strageImagesViewModel.loadImagesFromStrage()

    private fun allPermissionGranted(): Boolean {

        return PERMISSIONS.all {
            return ContextCompat.checkSelfPermission(
                requireActivity(),
                it
            ) == PackageManager.PERMISSION_GRANTED
        }
    }

    companion object {
        private val PERMISSIONS = arrayOf(Manifest.permission.READ_EXTERNAL_STORAGE)
        private const val REQUEST_CODE_PERMISSION = 100
    }
}