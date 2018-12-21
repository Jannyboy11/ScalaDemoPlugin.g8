# ScalaDemoPlugin

A [Giter8][g8] template for developing Bukkit plugins in Scala.

## Usage

Before running, make sure you have the following prerequisites installed:
- [JDK 8](http://openjdk.java.net/install/) or higher
- [SBT 1.2.7](https://www.scala-sbt.org/download.html) or higher

Then, run ```sbt new Jannyboy11/ScalaDemoPlugin.g8``` which generates a new SBT project using this template.

## Compiling the Scala plugin
Simply run ```sbt assembly``` in your project's root folder and your plugin jar will be generated in the /target/scala-<version> folder.

The plugin will depend on [ScalaLoader](https://github.com/Jannyboy11/ScalaPluginLoader), which will provide the Scala classes at runtime. No need to bundle the Scala library into the plugin's jar!

## Deploying the Scala plugin
Now that the jar is generated, drop [ScalaLoader](https://www.spigotmc.org/resources/scalaloader.59568/) into the <server_root>/plugins folder, and drop the Scala plugin in the <server_root>/plugins/ScalaLoader/scalaplugins folder.


Template license
----------------
Written in 2018 by Jan Boerman janboerman95@gmail.com
[other author/contributor lines as appropriate]

To the extent possible under law, the author(s) have dedicated all copyright and related
and neighboring rights to this template to the public domain worldwide.
This template is distributed without any warranty. See <http://creativecommons.org/publicdomain/zero/1.0/>.

[g8]: http://www.foundweekends.org/giter8/
