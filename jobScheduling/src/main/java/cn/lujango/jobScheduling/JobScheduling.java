package cn.lujango.jobScheduling;

import java.nio.file.Path;
import java.nio.file.Paths;


/**
 * @Author: Lujango
 * @Date: 2021/5/10 1:25 下午
 */
public class JobScheduling {

  public static void main(String[] args) {
    Path inputFile = Paths.get("tweets.csv");
    Path outputFile = Paths.get("tweets.xml");
  /*  Job job = new JobBuilder<String, String>()
        .reader(new FlatFileRecordReader(inputFile))
        .filter(new HeaderRecordFilter<>())
        .mapper(new DelimitedRecordMapper<>(Tweet.class, "id", "user", "message"))
        .marshaller(new XmlRecordMarshaller<>(Tweet.class))
        .writer(new FileRecordWriter(outputFile))
        .batchSize(10)
        .build();

    JobExecutor jobExecutor = new JobExecutor();
    JobReport report = jobExecutor.execute(job);
    jobExecutor.shutdown();*/
  }
}
