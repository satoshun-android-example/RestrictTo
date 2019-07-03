package com.github.satoshun.lib1

import androidx.annotation.RestrictTo
import com.github.satoshun.lib2.Hoge3

object Hoge2 {
  @RestrictTo(RestrictTo.Scope.LIBRARY)
  fun library() {
  }

  @RestrictTo(RestrictTo.Scope.LIBRARY_GROUP)
  fun libraryGroup() {
  }

  @RestrictTo(RestrictTo.Scope.LIBRARY_GROUP_PREFIX)
  fun libraryGroupPrefix() {
  }

  @RestrictTo(RestrictTo.Scope.SUBCLASSES)
  fun subclasses() {
  }

  @RestrictTo(RestrictTo.Scope.TESTS)
  fun tests() {
  }

  fun hoge() {
    Hoge3.library()
    Hoge3.libraryGroup()
    Hoge3.libraryGroupPrefix()

    Hoge3.subclasses()
    Hoge3.tests()
  }
}
