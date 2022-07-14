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
        } else if (query.contains("name")) {
            return "G10-Demo";
        } else if (query.contains("tum")) {
            return "Technische Universität München";
        } else if (query.contains("eist")) {
            return "Course at Technische Universität München";
        } else {
            return "";
        }
    }
}
