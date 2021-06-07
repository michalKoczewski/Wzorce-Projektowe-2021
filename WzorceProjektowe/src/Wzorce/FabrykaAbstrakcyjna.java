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
abstract class KomputerA {
     
    public abstract String getRAM();
    public abstract String getHDD();
    public abstract String getCPU();
     
    @Override
    public String toString(){
        return "RAM= "+this.getRAM()+", HDD="+this.getHDD()+", CPU="+this.getCPU();
    }
}

class PCA extends KomputerA {
 
    private String ram;
    private String hdd;
    private String cpu;
     
    public PCA(String ram, String hdd, String cpu){
        this.ram=ram;
        this.hdd=hdd;
        this.cpu=cpu;
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

class SerwerA extends KomputerA {
 
    private String ram;
    private String hdd;
    private String cpu;
     
    public SerwerA(String ram, String hdd, String cpu){
        this.ram=ram;
        this.hdd=hdd;
        this.cpu=cpu;
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

interface KomputerFabrykaAbstrakcyjna{

	public KomputerA stworzKomputerA();

}

class PCFabrykaAbstrakcyjna implements KomputerFabrykaAbstrakcyjna {

	private String ram;
	private String hdd;
	private String cpu;
	
	public PCFabrykaAbstrakcyjna(String ram, String hdd, String cpu){
		this.ram=ram;
		this.hdd=hdd;
		this.cpu=cpu;
	}
	@Override
	public KomputerA stworzKomputerA() {
		return new PCA(ram,hdd,cpu);
	}

}

class SerwerFabrykaAbstrakcyjna implements KomputerFabrykaAbstrakcyjna {

	private String ram;
	private String hdd;
	private String cpu;
	
	public SerwerFabrykaAbstrakcyjna(String ram, String hdd, String cpu){
		this.ram=ram;
		this.hdd=hdd;
		this.cpu=cpu;
	}
	
	@Override
	public KomputerA stworzKomputerA() {
		return new SerwerA(ram,hdd,cpu);
	}

}

class KomputerFabrykaA {

	public static KomputerA zwrocKomputerA(KomputerFabrykaAbstrakcyjna fabryka){
		return fabryka.stworzKomputerA();
	}
}