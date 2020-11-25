package ravenetics.test;

import org.junit.Test;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import static org.junit.Assert.assertTrue;

public class CycleDetectorTestJava {

    @Test
    public void findCycles() {
        // klasa CycleDetector zawiera krótką specyfikację działania algorytmu
        List<Character> chars = "abab"
                .chars()
                .mapToObj(e -> (char) e)
                .collect(Collectors.toList());
        Optional<CycleDetectorJava.CycleDefinitionJava<Character>> cycles = CycleDetectorJava.findCycles(chars, 2);

        //todo impl

        assertTrue(false);
    }
}