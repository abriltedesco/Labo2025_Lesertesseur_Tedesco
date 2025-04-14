package unidad1;

public class Fecha {
    private int dia;
    private int mes;
    private int anio;

    public Fecha(int dia, int mes, int anio){
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    public Fecha() {
        this.dia = 2;
        this.mes = 11;
        this.anio = 2007;
    }

    public void valida(){
        boolean fechaV = false,fechaM = false;
        if(dia >= 1 && dia <= 31){
            fechaV = true;
        }
        else{
            System.out.println("fecha invalida, se modificara a 31");
            dia = 31;
        }
        if(mes >= 1 && mes <= 12){
            fechaM = true;
        }
        else{
            System.out.println("fecha invalida, se modificara a 12");
            mes = 12;
        }
        if (fechaV && fechaM){
            System.out.println("Fecha ingresada es valida. ");
        }
    }

    public int diasMes(){
        int dias = 0;
        if(mes == 2){
            dias = 28;
        }
        else if(mes == 4 || mes == 9 || mes == 6 || mes == 11){
            dias = 30;
        }
        else{
            dias = 31;
        }
        return dias;
    }

    public void corta(){
        System.out.println(dia + " / " + mes + " / " + anio);
    }

    public void larga(){
        System.out.println("dia de semana " +  dia + " / " + mes + " / " + anio);
    }

    public void siguiente(){
        dia ++;
        System.out.println("siguiente: " + dia);
    }

    public void anterior(){
        dia--;
        dia--;
        System.out.println("anterior: " + dia);
    }

    public void igualQue(Fecha fecha, Fecha fecha2){
        boolean igualdad = fecha.dia == fecha2.dia && fecha.mes == fecha2.mes && fecha.anio == fecha2.anio;
        if(igualdad) {
            System.out.println("son iguales");
        }
        else{
            System.out.println("no son iguales");
        };
    }

    public void menorQue(Fecha fecha, Fecha fecha2){
        boolean menor = fecha.dia < fecha2.dia || fecha.mes < fecha2.mes || fecha.anio < fecha2.anio;
        if(menor){
            System.out.println("es menor");
        }else{
            System.out.println("no es menor");
        };
    }


    public void mayorQue(Fecha fecha, Fecha fecha2){
        boolean mayor= fecha.dia > fecha2.dia || fecha.mes > fecha2.mes || fecha.anio > fecha2.anio;
        if(mayor){
            System.out.println("es mayor");
        }else{
            System.out.println("no es mayor");
        }
    }

    public static void main(String[] args) {
        Fecha fecha = new Fecha(20,12,2007) ;
        Fecha fecha2 = new Fecha();
        fecha.valida();
        fecha2.valida();
        System.out.println(fecha.diasMes());
        System.out.println(fecha2.diasMes());
        System.out.print("cortas: ");
        fecha.corta();
        fecha2.corta();
        System.out.print("largas: ");
        fecha.larga();
        fecha2.larga();

        fecha.siguiente();
        fecha2.siguiente();

        fecha.anterior();
        fecha2.anterior();

        fecha.igualQue(fecha, fecha2);
        fecha.menorQue(fecha, fecha2);
        fecha.mayorQue(fecha, fecha2);
    }

}
