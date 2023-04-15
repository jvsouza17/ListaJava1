package Atividades;

import javax.swing.JOptionPane;

public class atividade2 {
       
    public static void main(String[] args) {

        int caloriaPrato=0, caloriaSobremesa=0, caloriaBebida=0, caloriasTotais;
        
        int prato = Integer.parseInt(JOptionPane.showInputDialog("1-Vegetariano\n2-Peixe\n3-Frango\n4-Carne\nFaça sua escolha de prato: "));
        
        switch(prato){
            case 1 -> {
                System.out.println("1-Vegetariano (180cal)");
                caloriaPrato=180;
                break;
            }
            case 2 -> {
                System.out.println("2-Peixe (230cal)");
                caloriaPrato=230;
                break;
            }
            case 3 -> {
                System.out.println("3-Frango (250cal)");
                caloriaPrato=250;
                break;
            }
            case 4 -> {
                System.out.println("4-Carne (350cal)");
                caloriaPrato=350;
                break;
            }
            default -> System.out.println("Opção inválida!");
        }
        
        int sobremesa = Integer.parseInt(JOptionPane.showInputDialog("1-Abacaxi\n2-Sorvete Diet\n3-Mouse Diet\n4-Mouse Chocolate\nFaça sua escolha de sobremesa: "));
        
        switch(sobremesa){
            case 1 -> {
                System.out.println("1-Abacaxi (75cal)");
                caloriaSobremesa=75;
                break;
            }
            case 2 -> {
                System.out.println("2-Sorvete Diet (110cal)");
                caloriaSobremesa=110;
                break;
            }
            case 3 -> {
                System.out.println("3-Mouse Diet (170cal)");
                caloriaSobremesa=170;
                break;
            }
            case 4 -> {
                System.out.println("4-Mouse Chocolate (200cal)");
                caloriaSobremesa=200;
                break;
            }
            default -> System.out.println("Opção inválida!");
        }
        
        int bebida = Integer.parseInt(JOptionPane.showInputDialog("1-Chá\n2-Suco de laranja\n3-Suco de melão\n4-Refrigerante Diet\nFaça sua escolha de bebida: "));
        
        switch(bebida){
            case 1 -> {
                System.out.println("1-Chá (20cal)");
                caloriaBebida=20;
                break;
            }
            case 2 -> {
                System.out.println("2-Suco de laranja (70cal)");
                caloriaBebida=70;
                break;
            }
            case 3 -> {
                System.out.println("3-Suco de melão (100cal)");
                caloriaBebida=100;
                break;
            }
            case 4 -> {
                System.out.println("4-Refrigerante Diet (65cal)");
                caloriaBebida=65;
                break;
            }
            default -> System.out.println("Opção inválida!");
        }
        
        caloriasTotais = caloriaPrato+caloriaSobremesa+caloriaBebida;
        JOptionPane.showMessageDialog(null, "O prato escolhido foi: " +prato 
                + "\nA sobremesa escolhida foi: " +sobremesa 
                + "\nA bebida escolhida foi: " +bebida 
                + "\nCom um total de: " +caloriasTotais + " calorias");
    }
}
