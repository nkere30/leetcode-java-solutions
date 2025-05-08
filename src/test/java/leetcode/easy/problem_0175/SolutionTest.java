package leetcode.easy.problem_0175;

import org.junit.jupiter.api.Test;

import java.io.InputStream;
import java.sql.*;
import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    // ✅ Use fileName argument correctly with full path prefix
    private String readSqlFile(String fileName) throws Exception {
        try (InputStream in = getClass().getClassLoader().getResourceAsStream("sql/problem_0175/" + fileName)) {
            if (in == null) throw new IllegalArgumentException("File not found: " + fileName);
            return new String(in.readAllBytes());
        }
    }

    @Test
    void testQueryFromSolution() throws Exception {
        try (Connection conn = DriverManager.getConnection("jdbc:h2:mem:testdb", "sa", "");
             Statement stmt = conn.createStatement()) {

            // ✅ Load schema and data from resource files
            stmt.execute(readSqlFile("create_tables.sql"));

            stmt.execute(readSqlFile("insert_data.sql"));

            // ✅ Run query
            ResultSet rs = stmt.executeQuery(Solution.QUERY);

            // ✅ Collect actual output
            List<List<String>> actual = new ArrayList<>();
            while (rs.next()) {
                actual.add(List.of(
                        rs.getString("firstName"),
                        rs.getString("lastName"),
                        rs.getString("city"),
                        rs.getString("state")
                ));
            }

            // ✅ Expected result
            List<List<String>> expected = List.of(
                    List.of("Allen", "Wang", null, null),
                    List.of("Bob", "Alice", "New York", "NY")
            );

            // ✅ Compare
            assertEquals(expected, actual);
        }
    }
}
