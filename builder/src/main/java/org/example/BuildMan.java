package org.example;

public class BuildMan extends ManBuilder{

    @Override
    void setSelfInfo() {
        super.man.setId("1");

    }

    @Override
    void setFatherInfo() {
        super.man.setFatherName("fatherName");
        super.man.setfGrandFatherName("爷爷");
    }

    @Override
    void setMotherInfo() {
        super.man.setMotherName("motherName");
        super.man.setmGrandMotherName("外婆");
    }
}
