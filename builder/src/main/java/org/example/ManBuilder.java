package org.example;

import lombok.Data;
import org.example.entity.Man;

@Data
public abstract class ManBuilder {
    protected Man man;

    abstract void setSelfInfo();
    abstract void setFatherInfo();
    abstract void setMotherInfo();
}
