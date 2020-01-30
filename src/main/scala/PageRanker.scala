
import org.apache.spark.graphx.GraphLoader
import org.apache.spark.sql.SparkSession

object PageRanker {
  def main(args: Array[String]): Unit = {
    val spark = SparkSession
      .builder
      .appName("PageRanker")
      .getOrCreate()

    val sc = spark.sparkContext

    val g = GraphLoader.edgeListFile(sc, "hdfs:///user/maxwellrussek/twitter-2010.csv")

    val pr = g.pageRank(tol = 0.1)

    pr.vertices.saveAsTextFile("hdfs:///user/maxwellrussek/twitter-2010-vertices.txt")
    pr.edges.saveAsTextFile("hdfs:///user/maxwellrussek/twitter-2010-edges.csv")
  }
}
