package com.github.satoshun.lib2

import androidx.annotation.RestrictTo

object Hoge3 {
  @RestrictTo(RestrictTo.Scope.LIBRARY)
  fun library() {}

  @RestrictTo(RestrictTo.Scope.LIBRARY_GROUP)
  fun libraryGroup() {}

  @RestrictTo(RestrictTo.Scope.LIBRARY_GROUP_PREFIX)
  fun libraryGroupPrefix() {}

  @RestrictTo(RestrictTo.Scope.SUBCLASSES)
  fun subclasses() {}

  @RestrictTo(RestrictTo.Scope.TESTS)
  fun tests() {}
}
