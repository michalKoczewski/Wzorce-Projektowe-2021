/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Wzorce;

/**
 *
 * @author kubap
 */
abstract class Komputer {
    public abstract String getRAM();
    public abstract String getHDD();
    public abstract String getCPU();

    @Override
    public String toString() {
        return "RAM= "+this.getRAM()+", HDD="+this.getHDD()+", CPU="+this.getCPU();
    }  
}

class PC extends Komputer {
    private String ram;
    private String hdd;
    private String cpu;
    
    public PC(String ram, String hdd, String cpu){
        this.ram = ram;
        this.hdd = hdd;
        this.cpu = cpu;
    }

    @Override
    public String getRAM() {
        return this.ram;
    }

    @Override
    public String getHDD() {
        return this.hdd;
    }

    @Override
    public String getCPU() {
        return this.cpu;
    }  
}

class Serwer extends Komputer {
    private String ram;
    private String hdd;
    private String cpu;
    
    public Serwer(String ram, String hdd, String cpu){
        this.ram = ram;
        this.hdd = hdd;
        this.cpu = cpu;
    }

    @Override
    public String getRAM() {
        return this.ram;
    }

    @Override
    public String getHDD() {
        return this.hdd;
    }

    @Override
    public String getCPU() {
        return this.cpu;
    }  
}

class KomputerFabryka {
    public static Komputer stworzKomputer(String typ, String ram, String hdd, String cpu){
        if("PC".equalsIgnoreCase(typ)) return new PC(ram, hdd, cpu);
        else if("Serwer".equalsIgnoreCase(typ)) return new Serwer(ram, hdd, cpu);
        
        return null;
    }
}