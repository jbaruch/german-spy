package troubleshooting.by.sherlock.germanspy.tipography;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Evgeny Borisov
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Order {
    private String title;
    private String body;
    private int amount;
}
