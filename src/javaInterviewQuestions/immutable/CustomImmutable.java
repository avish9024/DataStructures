package javaInterviewQuestions.immutable;

import java.util.ArrayList;
import java.util.List;

public final class CustomImmutable {
    private final int id;
    private final String name;
    private final List<String> skills;

    public CustomImmutable(int id, String name, List<String> skills) {
        this.id = id;
        this.name = name;
        List<String> tempSkills = new ArrayList<>();
        for (String sk : skills) {
            tempSkills.add(sk);
        }
        this.skills = tempSkills;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<String> getSkills() {
        return skills;
    }
}
