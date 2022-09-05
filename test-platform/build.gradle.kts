plugins {
  `java-platform`
}

description = "Dependency constraints for tests"

dependencies {
  constraints {
    api("junit:junit:[4.12,5)")
    api("org.mockito:mockito-core:[2.27.0,3)")
    api("org.scalacheck:scalacheck_2.13:[1.14.0,2)")
    api("org.scalatest:scalatest_2.13:[3.0.8,3.1)")
    api("uk.org.lidalia:slf4j-test:[1.1.0,2)")
  }
}