package com.apple.develop.Logger;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class SingletonLogger {
    private String basePath = "/Users/swift/IdeaProjects/code_design_model/singleton/src/info.log";
    private FileWriter writer;
    private static SingletonLogger instance = new SingletonLogger();

    private SingletonLogger() {
        File file = new File(basePath);
        try {
            writer = new FileWriter(file, true); //true表示追加写入
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static SingletonLogger getInstance() {
        return instance;
    }

    public void log(String message) {
        try {
            writer.write(message);
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void setBasePath(String basePath) {
        this.basePath = basePath;
    }
}
