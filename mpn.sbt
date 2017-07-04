enablePlugins(MediativeBintrayPlugin, MediativeReleasePlugin)
sparkVersion := "2.1.1"
crossScalaVersions := Seq("2.10.6", "2.11.11")
organization := "com.mediative"
scalacOptions := scalacOptions.value.filter(_ != "-Xfatal-warnings")
publishTo := (publishTo in bintray).value
