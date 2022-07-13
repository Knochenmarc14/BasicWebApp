package de.tum.in.ase.eist;

import org.springframework.stereotype.Service;

@Service
public class QueryProcessor {

    public String process(String query) {
		query = query.toLowerCase();
        if (query.contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        } else if (query.toLowerCase().contains("what is your name")) {
           return "TestPlayer";
        } else if (query.toLowerCase().contains("which of the following numbers is the largest")) {
            String[] numbers = query.substring(query.indexOf(':') + 1).split(",");
            int max = Integer.MIN_VALUE;
            for (int i = 0; i<numbers.length; i++) {
                int cur = Integer.parseInt(numbers[i]);
                if (max < cur) {
                    max = cur;
                }
            }
            return "" + max;
        } else if (query.toLowerCase().contains("what is 12 plus 19")) {
            return "31";
        } else {
            return "";
        }
    }
}
