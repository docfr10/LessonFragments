package com.example.lesson_fragments

import android.app.AlertDialog
import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.lesson_fragments.databinding.FragmentBlankBinding

class BlankFragment : Fragment() {
    private lateinit var binding: FragmentBlankBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentBlankBinding.inflate(inflater)
        // Inflate the layout for this fragment
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val sharedPrefs = this.activity?.getSharedPreferences("MyPrefs", Context.MODE_PRIVATE)

        sharedPrefs?.edit()?.putString("key", "value")?.apply()
        binding.textView.text = sharedPrefs?.getString("key", "")

        binding.button.setOnClickListener {
//            parentFragmentManager.beginTransaction()
//                .replace(R.id.constraint, BlankFragment()).commit()

//            sharedPrefs?.edit()?.putString("key", "123456787543234567")?.apply()
//            textView.text = sharedPrefs?.getString("key", "")

//            sharedPrefs?.edit()?.remove("key")?.apply()
//            sharedPrefs?.edit()?.clear()?.apply()

//            val url = Uri.parse("https://www.google.com")
//            val intent = Intent(Intent.ACTION_VIEW, url)
//            startActivity(intent)

//            val intent = Intent(Intent.ACTION_PICK, ContactsContract.Contacts.CONTENT_URI)
//            startActivity(intent)

//            val intent = Intent(Intent.ACTION_SEND)
//            intent.type = "text/plain"
//            intent.putExtra(Intent.EXTRA_TEXT, "Some message")
//            startActivity(Intent.createChooser(intent, "Выберите приложение"))

            showDialog()
        }
    }

    private fun showDialog() {
        val builder = AlertDialog.Builder(activity)

        builder.setTitle("Title")
        builder.setMessage("Message")

        builder.setPositiveButton("Yes") { _, _ ->
            Toast.makeText(activity, "YES", Toast.LENGTH_SHORT).show()
        }

        builder.setNegativeButton("No") { _, _ ->
            Toast.makeText(activity, "NO", Toast.LENGTH_SHORT).show()
        }

        builder.setNeutralButton("Cancel") { _, _ ->
            Toast.makeText(activity, "CANCEL", Toast.LENGTH_SHORT).show()
        }

        builder.create().show()
    }
}