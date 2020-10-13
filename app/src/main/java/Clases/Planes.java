package Clases;


public class Planes
{

    // Declaración de datos.

    private int farenheith;
    private int revival;
    private int elAlquimista;
    private int elPoder;
    private int elDespertar;


    // Constructor

    public Planes()
    {
        elAlquimista = 45000;
        revival = 22000;
        farenheith = 7000;
        elPoder = 88000;
        elDespertar = 156000;
    }

    // Accesadores

    public int getFarenheith()
    {
        return farenheith;
    }

    public int getRevival()
    {
        return revival;
    }

    public int getElAlquimista() { return elAlquimista; }

    public int getElPoder() { return elPoder; }

    public int getElDespertar() { return elDespertar; }

}
