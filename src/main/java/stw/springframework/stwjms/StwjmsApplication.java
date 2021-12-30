package stw.springframework.stwjms;

import org.apache.activemq.artemis.core.config.impl.ConfigurationImpl;
import org.apache.activemq.artemis.core.server.ActiveMQServer;
import org.apache.activemq.artemis.core.server.ActiveMQServers;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StwjmsApplication {

	public static void main(String[] args) throws Exception {
                // Launch ActiveMQ Server
                ActiveMQServer server= ActiveMQServers.newActiveMQServer(
                        new ConfigurationImpl()
                                .setPersistenceEnabled(false)
                                .setJournalDirectory("target/data/journal")
                                .setSecurityEnabled(false));
                                //.addAcceptorConfiguration(
                                        //"tcp", "tcp://127.0.0.1:5678"));
                               //         "invm","vm://0"));
                
                server.start();
                
		SpringApplication.run(StwjmsApplication.class, args);
	}

}
