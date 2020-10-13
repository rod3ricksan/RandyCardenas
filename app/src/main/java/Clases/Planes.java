package Clases;


public class Planes
{

    // Declaración de datos.

    private int farenheith;
    private int revival;
    private int elAlquimista;


    // Constructor

    public Planes()
    {
        elAlquimista = 45000;
        revival = 12000;
        farenheith = 5000;
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


}
