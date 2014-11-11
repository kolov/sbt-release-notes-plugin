import sbt._
import si.urbas.sbt.releasenotes._
import si.urbas.sbt.releasenotes.formats.MdReleaseNotesFormat

object BuildConfiguration extends Build {
  val root = project.in(file("."))
    .enablePlugins(MdReleaseNotesFormat)
}