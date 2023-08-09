package producer.com.br.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import producer.com.br.services.SpringProducerService;

@RequiredArgsConstructor
@RestController
@RequestMapping("/producer")
public class StringProducerController {
	
	private final SpringProducerService producerService;
	
	@PostMapping
	public ResponseEntity<?> sendMessage(@RequestBody String message) {
		producerService.sendMessage(message);
		return ResponseEntity.status(HttpStatus.CREATED).build();
	}

}
