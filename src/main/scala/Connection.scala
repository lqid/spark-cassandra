import com.datastax.spark.connector._
import org.apache.spark.{SparkConf, SparkContext}

object Connection extends App {
  val conf = new SparkConf()
    .set("spark.cassandra.connection.host", "127.0.0.1")
    .set("spark.cassandra.auth.username", "cassandra")
    .set("spark.cassandra.auth.password", "cassandra")
    .setMaster("local[*]")
    .setAppName("spark-cassandra")

  val sc = new SparkContext(conf)

  val rdd = sc.cassandraTable("killrvideo", "users")
  rdd.collect().foreach(println)
}