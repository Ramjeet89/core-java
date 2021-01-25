package interview_coding;

import java.nio.file.Files;
import java.util.List;
import java.util.stream.Stream;

import static java.nio.file.Paths.get;
import static java.util.stream.Collectors.*;

public class Example {
    public static void main(String[] args) throws Exception {
        List<String> fileLines = Files.readAllLines(get("C:\\Users\\USER\\OneDrive\\Desktop\\huge.txt"));
        String fileStats = fileLines.parallelStream()
                .flatMap(line -> Stream.of(line.split("\\s+")))
                .filter(word -> !"dumb".equalsIgnoreCase(word))
                .collect(groupingBy(word -> word.charAt(0), counting()))
                .entrySet().parallelStream()
                .map(letterStats -> letterStats.getKey() + ":" + letterStats.getValue())
                .collect(joining("\n"));
        System.out.println(fileStats);
    }
}