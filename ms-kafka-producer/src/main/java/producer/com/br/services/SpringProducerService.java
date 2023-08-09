package producer.com.br.services;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Log4j2
@RequiredArgsConstructor
@Service
public class SpringProducerService {
	
	private final KafkaTemplate<String, String> kafkaTemplate;
	
	public void sendMessage(String message) {
		log.info("Send Message {}", message);
		kafkaTemplate.send("ms-kafka-producer", message);
	}

}
