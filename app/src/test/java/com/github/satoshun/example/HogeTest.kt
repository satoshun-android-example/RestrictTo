package com.github.satoshun.example

import org.junit.Test

class HogeTest {
  @Test
  fun hoge() {
    Hoge.library()
    Hoge.libraryGroup()
    Hoge.libraryGroupPrefix()

    Hoge.subclasses()
    Hoge.tests()
  }
}
