/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import Model.Agendamento;
import Model.Cliente;
import Model.Servico;
import Model.Usuario;

/**
 *
 * @author Vinicius Leonam
 */
public class Main {
    public static void main(String[] args) {
        
        Servico servico = new Servico(1, "Barba", 30);
        Cliente cliente = new Cliente(1, "Vinicius", "Oiapoque", "08744-140");
        System.out.println(cliente.getNome());
        Usuario usuario = new Usuario(1, "Renan", "senha");
        System.out.println(usuario.getNome());
        
        Agendamento agendamento = new Agendamento(1, cliente, servico, 30, "15/02/2022 09:15");
        System.out.println(agendamento.getCliente().getNome());
    }
}
