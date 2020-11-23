/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119014.latihan56.umur.barang.antik;

/**
 *
 * @author USER
 */
class Radio extends BarangAntik {
    private String name;
    
    public Radio(int umur) {
        super(umur);
    }
    
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
        System.out.println("Nama barang Antik : " + name);
    }  
}
