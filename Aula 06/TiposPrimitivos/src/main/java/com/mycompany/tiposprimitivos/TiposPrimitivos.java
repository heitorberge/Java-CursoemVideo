package com.mycompany.tiposprimitivos;
public class TiposPrimitivos {
    public static void main(String[] args) {
        float nota = (float) 8.5;
        System.out.println("A Nota e " + nota);
        /* Quando o System.out.print possui o ln
         * Ele Quebra Linha
         */
        
        System.out.print("A Nota e " + nota);
        /* Quando o System.out.print não possui o ln
         * Ele não Quebra Linha
         */
        
        System.out.printf("A Nota e %.1f \n", nota);
        /* Quando o System.out.print 
         * possui o f * Ele Pode ser Formatado
         * Obs: O comando também pode ser executado com
         * System.out.format. Exemplo na Linha a seguir
         */
        System.out.format("A Nota e %.1f \n", nota);
    }
}
