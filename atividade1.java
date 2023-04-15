package Atividades;

import javax.swing.JOptionPane;

public class atividade1 {
        
    public static void main(String[] args) {

    
        float salario = Float.parseFloat(JOptionPane.showInputDialog("Digite o salário: R$"));
        int nCarrosVendidos = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de carros vendidos: "));         
        float valorTotalVendas = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor total de vendas: R$"));
        float comissao = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor da comissão: R$"));
      
        float totalComissao = comissao + (valorTotalVendas * 5/100);
    
        float salarioFinal = salario+totalComissao;

        JOptionPane.showMessageDialog(null, "O salário final é: R$" +salarioFinal);
    }
}

