
package stw.springframework.stwjms.model;

import java.io.Serializable;
import java.util.UUID;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *          ScienceTechWorks
 * @author Ramon.Talavera@gmail.com 
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class HelloWorldMessage implements Serializable {
    
    private static final long serialVersionUID=4656577865342L;
    
    private UUID id;
    private String message;
}
