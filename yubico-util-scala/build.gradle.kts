plugins {
  scala
  id("com.diffplug.spotless")
  id("io.github.cosmicsilence.scalafix")
}

description = "Yubico internal Scala utilities"

java {
  targetCompatibility = JavaVersion.VERSION_1_8
}

dependencies {
  implementation(platform(rootProject))
  implementation(platform(project(":test-platform")))

  implementation("org.scala-lang:scala-library")
  implementation("org.scalacheck:scalacheck_2.13")

  testImplementation( "org.scalatest:scalatest_2.13")
}
