package BackupSystem;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class BackupApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DirectoryCopy directoryCopy = new DirectoryCopy();

        System.out.print("Enter the source directory: ");
        Path sourceDir = Paths.get(scanner.nextLine());

        System.out.print("Enter the target directory: ");
        Path targetDir = Paths.get(scanner.nextLine());

        directoryCopy.copyDirectory(sourceDir, targetDir);

        System.out.println("Backup completed.");

        // Demonstrate error handling
        System.out.println("Attempting to copy to a read-only directory:");
        Path readOnlyTargetDir = Paths.get("/read-only-directory");
        directoryCopy.copyDirectory(sourceDir, readOnlyTargetDir);
    }
}
