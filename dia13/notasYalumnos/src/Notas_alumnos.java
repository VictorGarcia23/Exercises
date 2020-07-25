import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;



public class Notas_alumnos {
    public String[] readStringFromFile(String path) {
        try {
            List<String> strings = Files.readAllLines(Paths.get(path));
            return strings.toArray(new String[strings.size()]);
        } catch (IOException e) {
            return null;
        }
    }

    public int[] readIntsFromFile(String path) {
        try {
            int[] ints = Files.lines(Paths.get(path))
                    .mapToInt(Integer::parseInt).toArray();
            return ints;
        } catch (IOException e) {
            return null;
        }
    }

    int[] notas;
    String[] alumnos;

    public Notas_alumnos() {
        notas = readIntsFromFile("notas");
        alumnos = readStringFromFile("alumnos");
    }

    public void aprobados() {
        for (int i = 0; i < alumnos.length; i++) {
            if (notas[i] > 5) {
                System.out.println("el alumno: " + alumnos[i] + "ha aprobado con un " + notas[i]);
            } else {
                System.out.println("el alumno" + alumnos[i] + "ha suspendido zoquete");
            }

        }
    }

    public float media () {
        int sumaDeNotas = 0;
        int totalAlumnos;
        int mediaTotal;

        for (int i = 0; i < notas.length; i++) {
            sumaDeNotas = sumaDeNotas + notas[i];
        }
        totalAlumnos = alumnos.length + 1;
        mediaTotal = sumaDeNotas / totalAlumnos;
        return mediaTotal;


    }
}








