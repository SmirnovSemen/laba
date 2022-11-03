import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
// InputStreamReader преобразует набор байтов в символ(как говорит интернет)
// Класс BufferedReader как я понял нужен для ввода(главное, что все работает)
interface interfac {

    public String getName();
    public Integer getKol_vo();
    public String getSrok_godn();
    public String getStrana();
    public void info();
    public void destructor();

}

class ovoshi implements interfac {
    public  String name, srok_godn, strana;
    public  Integer  kol_vo;


    public ovoshi(){//конструктор без параметров
        this.name = "Kartoshechka";
        this.kol_vo = 103;
        this.srok_godn = "34";
        this.strana = "Yganda";
    }

    public ovoshi(String name, String srok_godn, String strana, Integer  kol_vo){//конструктор с параметрами

        this.name = name;
        this.kol_vo = kol_vo;
        this.srok_godn = srok_godn;
        this.strana = strana;

    }
    public ovoshi(ovoshi ficus, String name, String srok_godn, String strana, Integer  kol_vo){//и копирование
        // причем для остальных фруктов и ягод тоже самое

        this.name = ficus.name;
        this.kol_vo = ficus.kol_vo;
        this.srok_godn = ficus.srok_godn;
        this.strana = ficus.strana;
    }
    @Override
    public String getName() { return name; }
    @Override
    public Integer getKol_vo(){ return kol_vo; }
    @Override
    public String getSrok_godn(){ return srok_godn; }
    @Override
    public String getStrana(){ return strana; }
    @Override
    public void info() {
        System.out.println("Ovosh: " + getName()); //чтение и запись как я понял
        System.out.println("Kol_vo: " + getKol_vo());
        System.out.println("Vremia_Godnota: " + getSrok_godn());
        System.out.println("Strana: " + getStrana());}
    @Override
    public void destructor() {
        System.gc();
    }

}

class fruct implements interfac {

    public  String name, srok_godn, strana;
    public  Integer  kol_vo;

    public fruct(){
        this.name = "limon";
        this.kol_vo = 23;
        this.srok_godn = "10";
        this.strana = "Vatican";
    }

    public fruct(String name, String srok_godn, String strana, Integer  kol_vo){

        this.name = name;
        this.kol_vo = kol_vo;
        this.srok_godn = srok_godn;
        this.strana = strana;

    }
    public fruct(ovoshi ficus, String name, String srok_godn, String strana, Integer  kol_vo){

        this.name = ficus.name;
        this.kol_vo = ficus.kol_vo;
        this.srok_godn = ficus.srok_godn;
        this.strana = ficus.strana;
    }
    @Override
    public String getName() { return name; }
    @Override
    public Integer getKol_vo(){ return kol_vo; }
    @Override
    public String getSrok_godn(){ return srok_godn; }
    @Override
    public String getStrana(){ return strana; }
    @Override
    public void info() {
        System.out.println("Fruct: " + getName());
        System.out.println("Kol_vo: " + getKol_vo());
        System.out.println("Vremia_Godnota: " + getSrok_godn());
        System.out.println("Strana: " + getStrana());}
    @Override
    public void destructor() {
        System.gc();
    }

}

class iagoda implements interfac {

    public  String name, srok_godn, strana;
    public  Integer  kol_vo;

    public iagoda(){
        this.name = "arbus";
        this.kol_vo = 2;
        this.srok_godn = "9";
        this.strana = "Russia";
    }

    public iagoda(String name, String srok_godn, String strana, Integer  kol_vo){

        this.name = name;
        this.kol_vo = kol_vo;
        this.srok_godn = srok_godn;
        this.strana = strana;

    }
    public iagoda(ovoshi ficus, String name, String srok_godn, String strana, Integer  kol_vo){

        this.name = ficus.name;
        this.kol_vo = ficus.kol_vo;
        this.srok_godn = ficus.srok_godn;
        this.strana = ficus.strana;
    }
    @Override
    public String getName() { return name; }
    @Override
    public Integer getKol_vo(){ return kol_vo; }
    @Override
    public String getSrok_godn(){ return srok_godn; }
    @Override
    public String getStrana(){ return strana; }
    @Override
    public void info() {
        System.out.println("Iagoda: " + getName());
        System.out.println("Kol_vo: " + getKol_vo());
        System.out.println("Vremia_Godnota: " + getSrok_godn());
        System.out.println("Strana: " + getStrana());}
    @Override
    public void destructor() {
        System.gc();
    }


}

public class Main {
    public static void main(String[] args) throws IOException {

        String new_name, new_srok_godn, new_strana;
        Integer new_kol_vo;
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));
//проверка роботоспособности
        System.out.println("Информация об овоще");
        ovoshi  Kartoshechka = new ovoshi();
        Kartoshechka.info();

        System.out.println("Введите название овоща");
        new_name = reader.readLine();
        System.out.println("Введите срок годности");
        new_srok_godn = reader.readLine();
        System.out.println("Введите страну поставщика");
        new_strana = reader.readLine();

        System.out.println("Информация об овоще");
        ovoshi new_ovosh = new ovoshi(new_name , new_srok_godn, new_strana, 5);
        new_ovosh.info();

        System.out.println("Информация об фрукте");
        fruct  limon = new fruct();
        limon.info();

        System.out.println("Информация об ягоде");
        iagoda  arbus = new iagoda();
        arbus.info();
    }
}
