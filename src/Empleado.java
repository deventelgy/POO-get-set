public class Empleado {
    private String nombre;
    private String apellido;
    private int edad;
    private double salario;

    //Metodos publicos
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
    public double getSalario() {
        return salario;
    }
    public boolean plus (double sueldoPlus){
        boolean aumento=false;
        if (edad>40 && compruebaNombre()){
            salario+=sueldoPlus;
            aumento=true;
        }
        return aumento;
    }

    //Metodos privados

    private boolean compruebaNombre(){
        if(nombre.equals("")){
            return false;
        }
        return true;
    }

    //Constructor
    /**
     * Constructor por defecto
     */
    public Empleado(){
        this.nombre="";
        this.apellido="";
        this.edad=0;
        this.salario=0;
    }
    public Empleado(String _nombre, String _apellido, int _edad, double _salario) {
        this.nombre = _nombre;
        this.apellido = _apellido;
        this.edad = _edad;
        this.salario = _salario;
    }
}
