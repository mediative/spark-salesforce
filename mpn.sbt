enablePlugins(MediativeBintrayPlugin, MediativeReleasePlugin)
sparkVersion := "2.0.0"
organization := "com.mediative"
scalacOptions := scalacOptions.value.filter(_ != "-Xfatal-warnings")
publishTo := (publishTo in bintray).value
