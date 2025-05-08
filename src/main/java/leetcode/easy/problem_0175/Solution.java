package leetcode.easy.problem_0175;

import java.time.LocalDateTime;

/**
 * Problem 0175: Combine Two Tables
 * <a href="https://leetcode.com/problems/combine-two-tables/">...</a>
 * This is a SQL-based problem. The goal is to perform a LEFT JOIN between Person and Address
 * tables on personId and return firstName, lastName, city, and state.
 * Since this is SQL, the actual solution is meant to be submitted as a query.
 */

public class Solution {
    public static final String QUERY = """
        SELECT p.firstName, p.lastName, a.city, a.state
        FROM Person p
        LEFT JOIN Address a ON p.personId = a.personId;
    """;

    public static void main(String[] args) {
        LocalDateTime date = LocalDateTime.now();
        Thread thread = new Thread(() -> System.out.println(date));
        thread.start();
    }
}
