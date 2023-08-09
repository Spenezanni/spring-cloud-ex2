package producer.com.br.config;

import java.util.HashMap;
import java.util.Map;

import org.apache.kafka.clients.admin.AdminClientConfig;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;
import org.springframework.kafka.core.KafkaAdmin;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Configuration
public class kafkaAdminConfig {
	
	public final KafkaProperties properties;
	
	@Bean
	public KafkaAdmin KafkaAdmin() {
		Map<String, Object> configs = new HashMap<>();
		configs.put(AdminClientConfig.BOOTSTRAP_SERVERS_CONFIG, properties.getBootstrapServers());
		return new KafkaAdmin(configs);
	}
	
	@Bean
	public KafkaAdmin.NewTopics topics() {
		return new KafkaAdmin.NewTopics(
				TopicBuilder.name("ms-kafka-producer")
				.partitions(2)
				.replicas(1)
				.build());
	}
	

}
