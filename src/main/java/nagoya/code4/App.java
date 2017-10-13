package nagoya.code4;

import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaSparkContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		String master ="local";
		SparkConf conf = new SparkConf().setAppName("sample noby " ).setMaster(master);
		JavaSparkContext sc = new JavaSparkContext(conf);
	}
}
