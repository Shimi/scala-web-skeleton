libraryDependencies <+= sbtVersion(v => "com.github.siasia" %% "xsbt-web-plugin" % (v+"-0.2.9"))

addSbtPlugin("com.typesafe.sbteclipse" % "sbteclipse" % "1.4.0")

resolvers += Resolver.url("heikoseeberger", new java.net.URL("http://hseeberger.github.com/releases"))(Resolver.ivyStylePatterns)

addSbtPlugin("name.heikoseeberger.sbtsrc" % "sbtsrc" % "1.1.0")
