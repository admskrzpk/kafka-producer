import org.apache.kafka.clients.producer.{KafkaProducer, Producer, ProducerRecord}
import java.util.Properties

object KafkaProducerApp extends App {

  val props = new Properties()

  props.put("bootstrap.servers", "localhost:9092")
  props.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer")
  props.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer")

  val producer = new KafkaProducer[String, String](props)
  val i = for (i <- 0 until 100) {
    producer.send(new ProducerRecord[String, String]("janusz", Integer.toString(i), Integer.toString(i)))
  }
  producer.close()
}