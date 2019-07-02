package com.github.satoshun.lib1

import androidx.annotation.RestrictTo

object Hoge2 {
  @RestrictTo(RestrictTo.Scope.LIBRARY)
  fun library() {
    println("i'm hoge")
  }

  @RestrictTo(RestrictTo.Scope.LIBRARY_GROUP)
  fun libraryGroup() {
    println("i'm hoge")
  }

  @RestrictTo(RestrictTo.Scope.LIBRARY_GROUP_PREFIX)
  fun libraryGroupPrefix() {
    println("i'm hoge")
  }

  @RestrictTo(RestrictTo.Scope.SUBCLASSES)
  fun subclasses() {
    println("i'm hoge")
  }

  @RestrictTo(RestrictTo.Scope.TESTS)
  fun tests() {
    println("i'm hoge")
  }
}
