package com.example.lesson_fragments

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction

class BlankFragment2 : Fragment() {
    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.i("FRAGMENT 2", "onAttach")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i("FRAGMENT 2", "onCreate")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.i("FRAGMENT 2", "onCreateView")
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_blank2, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        Log.i("FRAGMENT 2", "onViewCreated")

        view.findViewById<TextView>(R.id.textView3)?.setOnClickListener {
            // Заменяем текущий фрагмент на новый
            val newFragment = BlankFragment()  // Новый фрагмент, который мы будем показывать
            val fragmentTransaction: FragmentTransaction = parentFragmentManager.beginTransaction()

            // Применяем замену фрагмента
            fragmentTransaction.replace(R.id.fragmentContainerView2, newFragment)
            fragmentTransaction.addToBackStack(null)  // Добавляем в стек, чтобы можно было вернуться
            fragmentTransaction.commit()
        }
    }

    override fun onStart() {
        super.onStart()
        Log.i("FRAGMENT 2", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i("FRAGMENT 2", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.i("FRAGMENT 2", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i("FRAGMENT 2", "onStop")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.i("FRAGMENT 2", "onDestroyView")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("FRAGMENT 2", "onDestroy")
    }
}