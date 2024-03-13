/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conversiones;
import java.lang.Integer;
/**
 *
 * @author josue
 */
public class Conversiones {

 public String hexa(int n){
     return Integer.toHexString(n).toUpperCase();
 }
 public String octa(int n){
     return Integer.toOctalString(n);
     
 }
 public String bin(int n){
     return Integer.toBinaryString(n);
 }
}
