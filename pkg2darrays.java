/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Main;
public class pkg2darrays{
 public static void main(String[] args) {
 String[][] states = new String[5][2];
 states[0][0] = "Telangana";
 states[0][1] = "Heyderabad";
 states[1][0] = "Karnataka";
 states[1][1] = "Bengaluru";
 states[2][0] = "Andhra";
 states[2][1] = "Amravathi";
 states[3][0] = "Tamilnadu";
 states[3][1] = "Chennai";
 states[4][0] = "Kerala";
 states[4][1] = "Thiruvananthapuram";
     for (String[] state : states) {
         StringBuilder sb = new StringBuilder();
         for (int j = 0; j < state.length; j++) {
             if (j == 0) {
                 sb.append("The capitol of ");
             } else {
                 sb.append(" is ");
             }           sb.append(state[j]);
         }
         System.out.println(sb);
     }
 }   
 
