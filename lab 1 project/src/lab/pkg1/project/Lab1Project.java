/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg1.project;

/**
 *
 * @author kitearethomas
 */
public class Lab1Project {
    int num = 0;
    
    public void addOne(){
    num= num + 1;
            }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lab1Project thing= new Lab1Project();
        thing.addOne();
        System.out.print(thing.num);
        // TODO code application logic here
    }
    
}
