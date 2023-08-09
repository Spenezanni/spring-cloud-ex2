package producer.com.br.services;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class SpringProducerService {
	
	private final KafkaTemplate<String, String> kafkaTemplate;
	
	public void sendMessage(String message) {
		kafkaTemplate.send("ms-kafka-producer", message);
	}

}
