package BackupSystem;

import java.nio.file.*;
import java.io.IOException;

public class DirectoryCopy {
    public void copyDirectory(Path sourceDir, Path targetDir) {
        try {
            Files.walk(sourceDir).forEach(sourcePath -> {
                Path targetPath = targetDir.resolve(sourceDir.relativize(sourcePath));
                try {
                    Files.copy(sourcePath, targetPath, StandardCopyOption.REPLACE_EXISTING);
                } catch (IOException e) {
                    System.out.println("An error occurred while copying the directory.");
                    e.printStackTrace();
                }
            });
        } catch (IOException e) {
            System.out.println("An error occurred while walking the file tree.");
            e.printStackTrace();
        }
    }
}
