package com.github.satoshun.example

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.github.satoshun.example.databinding.MainActBinding
import com.github.satoshun.lib1.Hoge2

class MainActivity : AppCompatActivity() {
  private lateinit var binding: MainActBinding

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    binding = DataBindingUtil.setContentView(this, R.layout.main_act)

    Hoge.library()
    Hoge.libraryGroup()
    Hoge.libraryGroupPrefix()
    Hoge.subclasses()
    Hoge.tests()

    Hoge2.library()
    Hoge2.libraryGroup()
    Hoge2.libraryGroupPrefix()
    Hoge2.subclasses()
    Hoge2.tests()
  }
}
