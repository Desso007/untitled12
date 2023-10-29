package edu;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import edu.hw3.Task2;
public class Task2test {
    @Test
    public void testClusterizeWithEmptyInput() {
        String input = "";
        List<String> clusters = Task2.clusterize(input);
        assertEquals(0, clusters.size());
    }

    @Test
    public void testClusterizeWithNoClusters() {
        String input = "abcdefg";
        List<String> clusters = Task2.clusterize(input);
        assertEquals(0, clusters.size());
    }

    @Test
    public void testClusterizeWithSingleCluster() {
        String input = "(((())))";
        List<String> clusters = Task2.clusterize(input);
        assertEquals(1, clusters.size());
        assertEquals("(((())))", clusters.get(0));
    }

}
