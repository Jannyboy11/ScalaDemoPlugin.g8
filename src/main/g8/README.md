# A Demo Scala Plugin

## Prerequisites

- [JDK 8](http://openjdk.java.net/install/) or higher
- [SBT 1.2.7](https://www.scala-sbt.org/download.html) or higher

## Compiling
Simply run ```sbt assembly``` in the project root and your plugin jar will be generated in the /target/scala-<version> folder.

The plugin will depend on [ScalaLoader](https://github.com/Jannyboy11/ScalaPluginLoader), which will provide the Scala classes at runtime. No need to bundle the Scala library into the plugin's jar!

## Deploying
Now that the jar is generated, drop [ScalaLoader](https://www.spigotmc.org/resources/scalaloader.59568/) into the <server_root>/plugins folder, and drop the Scala plugin in the <server_root>/plugins/ScalaLoader/scalaplugins folder.