
package stw.springframework.stwjms.sender;

import java.util.UUID;
import lombok.RequiredArgsConstructor;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import stw.springframework.stwjms.config.JmsConfig;
import stw.springframework.stwjms.model.HelloWorldMessage;

/**
 *          ScienceTechWorks
 * @author Ramon.Talavera@gmail.com 
 */
@RequiredArgsConstructor
@Component
public class HelloSender {

    private final JmsTemplate jmsTemplate;
    
    @Scheduled(fixedRate = 2000)
    public void sendMessage(){
        System.out.println("I'm Sending a message");
        
        HelloWorldMessage message = HelloWorldMessage
                .builder()
                .id(UUID.randomUUID())
                .message("Hello World!")
                .build();
        jmsTemplate.convertAndSend(JmsConfig.MY_QUEUE,message);
        System.out.println("Message sent!");
    }
}
