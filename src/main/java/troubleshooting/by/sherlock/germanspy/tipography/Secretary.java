package troubleshooting.by.sherlock.germanspy.tipography;

import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Evgeny Borisov
 */
@Component
@RequiredArgsConstructor
public final class Secretary {
    private final Mashinistka mashinistka;
    private final PrintеrStation printer;

    @Scheduled(fixedDelay = 10000)
    @SneakyThrows
    public void handle() {
        List<String> lines = Files.lines(Paths.get("postbox/envelop.txt")).collect(Collectors.toList());
        String text = mashinistka.imprint(lines);
        Order order = Order.builder().title(lines.get(0)).amount(Integer.parseInt(lines.get(1))).body(text).build();
        printer.print(order);
    }
}










