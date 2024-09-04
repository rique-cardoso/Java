package model;

public class ConversorUnidadeTempo {
    public static void minutoParaSegundo(int min){
        int seg = 60 * min;
        System.out.println(min + " minuto(s) equivale a " + seg + " segundo(s)");
    }
    public static void horaParaMinuto(int hora){
        int min = 60 * hora;
        System.out.println(hora + " hora(s) equivale a " + min + " minuto(s)");
    }
    public static void diaParaHora(int dia){
        int hora = 24 * dia;
        System.out.println(dia + " dia(s) equivale a " + hora + " hora(s)");
    }
    public static void semanaParaDia(int sem){
        int dia = 7 * sem;
        System.out.println(sem + " semana(s) equivale a " + dia + " dia(s)");
    }
    public static void mesParaDia(int mes){
        int dia = 30 * mes;
        System.out.println(mes + " mês(es) equivale a " + dia + " dia(s)");
    }
    public static void anoParaDia(int ano){
        int dia = 365 * ano;
        System.out.println(ano + " ano(s) equivale a " + dia + " dia(s)");
    }
}
