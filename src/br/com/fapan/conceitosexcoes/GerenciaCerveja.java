package br.com.fapan.conceitosexcoes;

import javax.swing.JOptionPane;

/**
 *
 * @author ademar
 */
public class GerenciaCerveja {

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "                   CONTROLE DE PAGAMENTO DE CERVEJA CONSUMIDA             ");

        int quantidadeCerveja = Integer.parseInt(JOptionPane.showInputDialog("DIGITE A QUANTIDADE DE CERVEJA QUE BEBEU HOJE:  "));
        int quantidadePessoa = Integer.parseInt(JOptionPane.showInputDialog("DIGITE A QUANTIDADE DE PESSOAS QUE ESTAVA BEBENDO: "));
        System.out.println("Divisão = " + (quantidadeCerveja / quantidadePessoa));

        JOptionPane.showMessageDialog(null, "VOCÊ DEVE DIVIDIR A CONTA COM ALGUÉM");

        JOptionPane.showMessageDialog(null, "DIGITOU ALGO ERRADO..... JÁ BEBEU MUITO");

        JOptionPane.showMessageDialog(null, "AGORA FALTA PAGAR A CONTA!");
    }
}
