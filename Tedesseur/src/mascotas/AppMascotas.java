package mascotas;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class AppMascotas {
    private ArrayList<Mascota> mascotas;

    public AppMascotas(ArrayList<Mascota> mascotas) {
        this.mascotas = mascotas;
    }

    public AppMascotas(){
        this.mascotas = new ArrayList<>();
    }

    public ArrayList<Mascota> getMascotas() {
        return mascotas;
    }

    public void setMascotas(ArrayList<Mascota> mascotas) {
        this.mascotas = mascotas;
    }

    public void agregarMascota(Mascota mascota){
        if(estaDisponibleNombre(mascota.getNombre())){
            mascotas.add(mascota);
            System.out.println("Se ha agregado correctamente a " + mascota.getNombre());
        }
        else{
            Scanner entrada = new Scanner(System.in);
            System.out.print("ingrese aqui nuevo nombre: ");
            String nuevoNombre = entrada.nextLine();
            mascota.setNombre(nuevoNombre);
            agregarMascota(mascota);
        }
    }

    public void borrarMascota(Mascota mascota){
        mascotas.remove(mascota);
    }


    public void modificarMascota(Mascota mascotaNueva, Mascota mascotaVieja){
        agregarMascota(mascotaNueva);
        borrarMascota(mascotaVieja);
    }

   public boolean estaDisponibleNombre(String nombreNuevaMascota){
        for(Mascota mascota : mascotas){
            if(Objects.equals(mascota.getNombre(), nombreNuevaMascota)){
                System.out.println("no puede ingresar con " + mascota.getNombre() + " intente con uno nuevo");
                return false;
            }
        }
        return true;
   }

    public Mascota mascotaConEseNombre(String nombreBuscado){
        for(Mascota mascota : this.mascotas){
            if (mascota.getNombre() == nombreBuscado){
                return mascota;
            }
        }
        return null;
    }

    public boolean existeDueñoConEseUsername(String userBuscado){
        for(Mascota mascota : this.mascotas){
            if (mascota.getDueño().getNombreUsuario() == userBuscado){
                return true;
            }
        }
        return false;
    }

    public boolean esPez(Tipo tipo){
        if(tipo.toString() == "PEZ"){
            return true;
        }
        return false;
    }

    public void saludarMascota(String nombreUsuario, String nombreMascota){
        if(mascotaConEseNombre(nombreMascota).getDueño().getNombreUsuario() == nombreUsuario){
            mascotaConEseNombre(nombreMascota).saludo(true);
        }
        else if (mascotaConEseNombre(nombreMascota) == null){
            System.out.println("no existe registro de mascotas con ese nombre, volver a intentar");
        }
        else if(!existeDueñoConEseUsername(nombreUsuario)){
            System.out.println("no se encontro ese nombre de usuario");
        }
        else{
            mascotaConEseNombre(nombreMascota).saludo(false);
        }

        if( esPez(mascotaConEseNombre(nombreMascota).getTipo()) ){
           Pez pez = (Pez) mascotaConEseNombre(nombreMascota);
           if(pez.getVidas()== 0){
               borrarMascota(mascotaConEseNombre(nombreMascota));
               System.out.println("El pez " + pez.getNombre() + " ha muerto :(");
           }
        }
    }

    public static void main(String[] args) {
        Perro perro1 = new Perro("kiki", new Dueño("ezequiel tenna", "ezeTenna123"), Tipo.PERRO, 4);
        Perro perro2 = new Perro("paquito", new Dueño("mia eilish", "eilishMia"), Tipo.PERRO, 2);
        Gato gato1 = new Gato("lulu", new Dueño("maria jose lopez", "majo_lopez"), Tipo.GATO, 5);
        Gato gato2 = new Gato("lulu", new Dueño("shakira", "la_real_shaki"), Tipo.GATO, 3);
        Pajaro pajaro1 = new Pajaro("lilo", new Dueño("fernanda flor", "flornanda"), Tipo.PAJARO, 2, true);
        Pajaro pajaro2 = new Pajaro("stitch", new Dueño("florencia peña", "flor_peña_222"), Tipo.PAJARO, 1, false);
        Pez pez = new Pez("dory", new Dueño("patrick smith", "patrickS"), Tipo.PEZ, 3);

        ArrayList<Mascota> mascotas = new ArrayList<>();
        mascotas.add(perro1);

        AppMascotas aplicacion = new AppMascotas(mascotas);
        aplicacion.agregarMascota(perro2);
        aplicacion.agregarMascota(gato1);
        aplicacion.agregarMascota(gato2);
        aplicacion.agregarMascota(pajaro1);
        aplicacion.agregarMascota(pajaro2);
        aplicacion.agregarMascota(pez);

        System.out.println("saludo 1: ");
       aplicacion.saludarMascota("patrickS", "dory");
        System.out.println("saludo 2: ");
       aplicacion.saludarMascota("ezeTenna123", "dory");
        System.out.println("saludo 3: ");
       aplicacion.saludarMascota("eilishMia", "paquito");
        System.out.println();
        System.out.println("saludo 4: ");
       aplicacion.saludarMascota("la_real_shaki", "lulu");
        System.out.println();
        System.out.println("saludo 5: ");
       aplicacion.saludarMascota("nose12345", "stitch");

    }
}
