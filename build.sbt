name := "spark-cassandra"

version := "1.0"

scalaVersion := "2.11.8"

libraryDependencies += "com.datastax.spark" %% "spark-cassandra-connector" % "2.0.0-M3"
libraryDependencies += "org.apache.spark" %% "spark-core" % "2.0.1"
libraryDependencies += "org.apache.spark" %% "spark-sql" % "2.0.1"

