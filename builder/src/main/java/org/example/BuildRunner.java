package org.example;

import org.example.entity.Man;

public class BuildRunner {
    private ManBuilder builder;

    public BuildRunner(ManBuilder builder) {
        this.builder = builder;
    }

    public Man build() {
        Man man = Man.builder().build();
        builder.setMan(man);
        builder.setSelfInfo();
        builder.setFatherInfo();
        builder.setMotherInfo();

        return builder.getMan();
    }


    public static void main(String[] args) {
        ManBuilder builder = new BuildMan();
        BuildRunner runner = new BuildRunner(builder);
        Man man = runner.build();
        System.out.println(man);
    }
}
