import java.util.*;

public class Colegio {

    private String Nombre;
    private HashMap<Integer,Alumno> estudiantes;

    public Colegio() {
    }

    public Colegio(String nombre) {
        Nombre = nombre;
        estudiantes = new HashMap<>();
    }

    public void agregarEstudiante(int legajo,Alumno alumno){
        estudiantes.put(legajo,alumno);
        System.out.println("Alumno agregado con exito\n");
    }

    public List<Alumno> listarAlumnos(){
        List<Alumno> alum = new ArrayList<>(estudiantes.values());
        return alum;
    }

    public List<Alumno> listarAlumnosAlf (){
        List<Alumno> alum = new ArrayList<>(estudiantes.values());

        Collections.sort(alum, new Comparator<Alumno>() {
            @Override
            public int compare(Alumno o1, Alumno o2) {
                return o1.getApellido().compareTo(o2.getApellido());
            }
        });

        return alum;
    }

    public List<Alumno> listarAlumnoEspecial(char letra){

        List<Alumno> alum = new ArrayList<>();

        for(Alumno alumno : estudiantes.values()){
            if(alumno.getApellido().charAt(0) == letra){
                alum.add(alumno);
            }
        }

        return alum;
    }


}