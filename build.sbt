name := "spark-pagerank"

version := "0.1"

scalaVersion := "2.12.10"

libraryDependencies ++= Seq(
  "org.apache.spark" % "spark-core_2.12" % "2.4.4",
  "org.apache.spark" % "spark-sql_2.12" % "2.4.4",
  "org.apache.hadoop" % "hadoop-client" % "2.9.2",
  "org.apache.spark" %% "spark-graphx" % "2.4.4"
)
