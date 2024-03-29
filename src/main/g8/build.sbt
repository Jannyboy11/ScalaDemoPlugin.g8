val Name = "$name$"
val Version = "$version$"
val GroupId = "$groupId$"

name := Name
version := Version
organization := GroupId

scalaVersion := "$scalaVersion$"

packageOptions in (Compile, packageBin) +=
    Package.ManifestAttributes("Automatic-Module-Name" -> (GroupId + "." + Name.toLowerCase))

/* uncomment if you need more dependencies
resolvers += Resolver.mavenCentral
*/
resolvers += "jannyboy11-minecraft-repo" at "https://repo.repsy.io/mvn/jannyboy11/minecraft"
resolvers += "spigot-repo" at "https://hub.spigotmc.org/nexus/content/repositories/snapshots/"

libraryDependencies += "org.spigotmc" % "spigot-api" % "$minecraftVersion$-R0.1-SNAPSHOT" % "provided"
libraryDependencies += "com.janboerman.scalaloader" % "ScalaLoader" % "$scalaLoaderVersion$" % "provided"

/* uncomment if you need to shade dependencies - see https://github.com/sbt/sbt-assembly#shading
assembly / assemblyShadeRules := Seq(
    ShadeRule.rename("xyz.janboerman.guilib.**" -> "$package$.guilib.@1").inAll,
)
*/
assembly / assemblyOption ~= { _.withIncludeScala(false).withIncludeDependency(false) }
assembly / assemblyMergeStrategy := {
    case "plugin.yml"       => MergeStrategy.first /* always choose our own plugin.yml if we shade other plugins */
    case "paper-plugin.yml" => MergeStrategy.first /* idem */
    case x                  =>
        val oldStrategy = (assembly / assemblyMergeStrategy).value
        oldStrategy(x)
}
assembly / assemblyJarName := Name + "-" + Version + ".jar"
