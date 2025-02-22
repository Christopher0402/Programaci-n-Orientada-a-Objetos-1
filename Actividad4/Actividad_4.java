public class Actividad_4 {

    // Clase Profesor
    public static class Profesor {
        private String nombre;
        private String numeroNomina;
        private double sueldoPorHora;
        private Materia materiaImpartida;

        // Constructor por defecto
        public Profesor() {
            this.nombre = "";
            this.numeroNomina = "";
            this.sueldoPorHora = 0.0;
            this.materiaImpartida = null;
        }

        // Constructor con parámetros
        public Profesor(String nombre, String numeroNomina, double sueldoPorHora, Materia materiaImpartida) {
            this.nombre = nombre;
            this.numeroNomina = numeroNomina;
            this.sueldoPorHora = sueldoPorHora;
            this.materiaImpartida = materiaImpartida;
        }

        // Constructor de copia
        public Profesor(Profesor otroProfesor) {
            this.nombre = otroProfesor.nombre;
            this.numeroNomina = otroProfesor.numeroNomina;
            this.sueldoPorHora = otroProfesor.sueldoPorHora;
            this.materiaImpartida = otroProfesor.materiaImpartida;
        }

        // Métodos getters y setters
        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getNumeroNomina() {
            return numeroNomina;
        }

        public void setNumeroNomina(String numeroNomina) {
            this.numeroNomina = numeroNomina;
        }

        public double getSueldoPorHora() {
            return sueldoPorHora;
        }

        public void setSueldoPorHora(double sueldoPorHora) {
            this.sueldoPorHora = sueldoPorHora;
        }

        public Materia getMateriaImpartida() {
            return materiaImpartida;
        }

        public void setMateriaImpartida(Materia materiaImpartida) {
            this.materiaImpartida = materiaImpartida;
        }

        // Método para calcular el sueldo semanal
        public double calcularSueldoSemanal() {
            if (materiaImpartida != null) {
                return materiaImpartida.getHorasSemanales() * sueldoPorHora;
            }
            return 0.0;
        }
    }

    // Clase Alumno
    public static class Alumno {
        private String matricula;
        private String nombre;
        private int edad;
        private Curso curso;

        // Constructor por defecto
        public Alumno() {
            this.matricula = "";
            this.nombre = "";
            this.edad = 0;
            this.curso = null;
        }

        // Constructor con parámetros
        public Alumno(String matricula, String nombre, int edad, Curso curso) {
            this.matricula = matricula;
            this.nombre = nombre;
            this.edad = edad;
            this.curso = curso;
        }

        // Constructor de copia
        public Alumno(Alumno otroAlumno) {
            this.matricula = otroAlumno.matricula;
            this.nombre = otroAlumno.nombre;
            this.edad = otroAlumno.edad;
            this.curso = otroAlumno.curso;
        }

        // Métodos getters y setters
        public String getMatricula() {
            return matricula;
        }

        public void setMatricula(String matricula) {
            this.matricula = matricula;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public int getEdad() {
            return edad;
        }

        public void setEdad(int edad) {
            this.edad = edad;
        }

        public Curso getCurso() {
            return curso;
        }

        public void setCurso(Curso curso) {
            this.curso = curso;
        }
    }

    // Clase Materia
    public static class Materia {
        private String nombre;
        private String clave;
        private int creditos;
        private int horasSemanales;

        // Constructor por defecto
        public Materia() {
            this.nombre = "";
            this.clave = "";
            this.creditos = 0;
            this.horasSemanales = 0;
        }

        // Constructor con parámetros
        public Materia(String nombre, String clave, int creditos, int horasSemanales) {
            this.nombre = nombre;
            this.clave = clave;
            this.creditos = creditos;
            this.horasSemanales = horasSemanales;
        }

        // Constructor de copia
        public Materia(Materia otraMateria) {
            this.nombre = otraMateria.nombre;
            this.clave = otraMateria.clave;
            this.creditos = otraMateria.creditos;
            this.horasSemanales = otraMateria.horasSemanales;
        }

        // Métodos getters y setters
        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getClave() {
            return clave;
        }

        public void setClave(String clave) {
            this.clave = clave;
        }

        public int getCreditos() {
            return creditos;
        }

        public void setCreditos(int creditos) {
            this.creditos = creditos;
        }

        public int getHorasSemanales() {
            return horasSemanales;
        }

        public void setHorasSemanales(int horasSemanales) {
            this.horasSemanales = horasSemanales;
        }
    }

    // Clase Curso
    public static class Curso {
        private String nombre;
        private Materia materia1;
        private Materia materia2;
        private Materia materia3;

        // Constructor por defecto
        public Curso() {
            this.nombre = "";
            this.materia1 = null;
            this.materia2 = null;
            this.materia3 = null;
        }

        // Constructor con parámetros
        public Curso(String nombre, Materia materia1, Materia materia2, Materia materia3) {
            this.nombre = nombre;
            this.materia1 = materia1;
            this.materia2 = materia2;
            this.materia3 = materia3;
        }

        // Constructor de copia
        public Curso(Curso otroCurso) {
            this.nombre = otroCurso.nombre;
            this.materia1 = otroCurso.materia1;
            this.materia2 = otroCurso.materia2;
            this.materia3 = otroCurso.materia3;
        }

        // Métodos getters y setters
        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public Materia getMateria1() {
            return materia1;
        }

        public void setMateria1(Materia materia1) {
            this.materia1 = materia1;
        }

        public Materia getMateria2() {
            return materia2;
        }

        public void setMateria2(Materia materia2) {
            this.materia2 = materia2;
        }

        public Materia getMateria3() {
            return materia3;
        }

        public void setMateria3(Materia materia3) {
            this.materia3 = materia3;
        }

        // Método para obtener los créditos del curso
        public int obtenerCreditosCurso() {
            return materia1.getCreditos() + materia2.getCreditos() + materia3.getCreditos();
        }
    }

    // Método principal
    public static void main(String[] args) {
        // Creación de materias
        Materia materia1 = new Materia("Animacion", "ANI101", 8, 3);
        Materia materia2 = new Materia("Ingles", "ING101", 5, 5);
        Materia materia3 = new Materia("Español", "ESP101", 9, 7);

        // Creación de curso
        Curso curso = new Curso("Programacion a objetos", materia1, materia2, materia3);

        // Creación de profesor
        Profesor profesor = new Profesor("Hector Antonio", "7324", 500, materia1);

        // Creación de alumno
        Alumno alumno = new Alumno("A1234", "Critobal", 24, curso);

        // Mostrar datos
        System.out.println("Alumno: " + alumno.getNombre());
        System.out.println("Curso: " + alumno.getCurso().getNombre());
        System.out.println("Profesor: " + profesor.getNombre());
        System.out.println("Sueldo semanal del profesor: " + profesor.calcularSueldoSemanal());
        System.out.println("Créditos del curso: " + curso.obtenerCreditosCurso());
    }
}
