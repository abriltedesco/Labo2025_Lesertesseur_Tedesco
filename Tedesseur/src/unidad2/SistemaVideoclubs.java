import java.util.ArrayList;

public class SistemaVideoclubs {
    ArrayList<Videoclub> videoclubs;

    public SistemaVideoclubs() {
        videoclubs = new ArrayList<>();
    }

    public ArrayList<Videoclub> getVideoclubs() {
        return videoclubs;
    }

    public void setVideoclubs(ArrayList<Videoclub> videoclubs) {
        this.videoclubs = videoclubs;
    }

    // G)
    public Videoclub videoclubMasPelis(){
        Videoclub vAux = new Videoclub();
        Videoclub vMayor = new Videoclub();
        int suma = 0, suma2 = 0;
        int numMayor = 0;
        for (int i = 0; i < videoclubs.size(); i++) {
            vAux = videoclubs.get(i + 1);
            for(Estante e : videoclubs.get(i).getEstanteria()){
                suma += e.getPeliculas().size();
                numMayor += suma;
                vMayor = videoclubs.get(i);
            }
            for(Estante e : vAux.getEstanteria()){
                suma2 += e.getPeliculas().size();
            }
            if(suma2 > numMayor){
                vMayor = vAux;
            }
        }
        return vMayor;
    }
    
    // H
    public void mostrarPelisGenero(String genero){
        for(Videoclub v : videoclubs){
            for(Estante e : v.getEstanteria()){
                for (Pelicula p : e.getPeliculas()) {
                    if(p.getGenero().equals(genero)){
                        System.out.println("Pelis del genero: " + genero + "en el videoclub de: " + v.getDireccion());
                        System.out.println(p.getTitulo());
                        System.out.println("----------");
                    }
                }
            }
        }
    }

    // F)
    public void pelisMenos90min (){
        for(Videoclub v : videoclubs){
            for(Estante e : v.getEstanteria()){
                for (Pelicula p : e.getPeliculas()) {
                    if(p.getDuracion() <= 90){
                        System.out.println("Peli:" + p.getTitulo() + "en el videoclub de: " + v.getDireccion());
                        System.out.println("----------");
                    }
                }
            }
        }
    }

    //E
    public ArrayList<String> direccionesPorComuna(int comuna){ 
        ArrayList <String> direcciones = new ArrayList<>();

        for (Videoclub videoclub : videoclubs) {
            if (comuna == videoclub.getComuna()) {
                direcciones.add(videoclub.getDireccion());                
            }
        }
        return direcciones;
    }

    public static void main(String[] args) {
        SistemaVideoclubs s = new SistemaVideoclubs();
        ArrayList<Videoclub> videoclubs = new ArrayList<Videoclub>();
        Videoclub videoclub1 = new Videoclub();
        Videoclub videoclub2 = new Videoclub();
        videoclubs.add(videoclub1);
        videoclubs.add(videoclub2);


        s.videoclubMasPelis();
        s.mostrarPelisGenero("romance");
        s.pelisMenos90min();
    }
}