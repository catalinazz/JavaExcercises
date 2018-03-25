/*
 * TestSystem.java
 *
 *
 */
package ar.com.educacionit.lab3.ejercicio1;

/**
 *
 * @author Sebastián S. Sanga <SebastianSanga@gmail.com>
 *
 */
public class TestSystem {

    /**
     * Creates a new instance of TestSystem
     */
    public TestSystem() {
    }

    public static void main(String[] args) {
        // Obtiene las propiedades del sistema donde se encuentra la JVM
        String javahome = "java.home --> " + System.getProperty("java.home");
        String classpath = "java.class.path --> " + System.getProperty("java.class.path");
        String osname = "os.name --> " + System.getProperty("os.name");

        // Imprime las propiedades obtenidas
        System.out.println("[Propiedades obtenidas]");
        System.out.println("\t" + javahome);
        System.out.println("\t" + classpath);
        System.out.println("\t" + osname);

        // Llama al garbage collector
        System.gc();

        // Termina la ejecución
        System.exit(0);
    }
}
