
resolvers ++= Seq(
  "twitter.com" at "http://maven.twttr.com/",
  "maven" at "http://repo1.maven.org/maven2/",
  "freemarker" at "http://freemarker.sourceforge.net/maven2/",
  Resolver.mavenLocal)

libraryDependencies ++= Seq(
    "com.google.collections" % "google-collections" % "0.8",
    "org.codehaus.plexus"    % "plexus-utils"       % "1.5.4",
    "org.slf4j"              % "slf4j-api"          % "1.6.1",
    "org.slf4j"              % "slf4j-simple"       % "1.6.1")

addSbtPlugin("com.typesafe.sbt" % "sbt-site" % "0.8.1")

addSbtPlugin("com.twitter" %% "scrooge-sbt-plugin" % "3.16.3")

addSbtPlugin("com.eed3si9n" % "sbt-assembly" % "0.9.2")
