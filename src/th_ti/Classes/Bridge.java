/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *    This file is part of Foobar.
 *
 *   Foobar is free software: you can redistribute it and/or modify
 *   it under the terms of the GNU General Public License as published by
 *   the Free Software Foundation, either version 3 of the License, or
 *   (at your option) any later version.
 *
 *   Foobar is distributed in the hope that it will be useful,
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *   GNU General Public License for more details.
 *
 *   You should have received a copy of the GNU General Public License
 *   along with Foobar.  If not, see <http://www.gnu.org/licenses/>.
 *
 *   Este arquivo é parte do programa Foobar
 *
 *   Foobar é um software livre; você pode redistribuí-lo e/ou 
 *   modificá-lo dentro dos termos da Licença Pública Geral GNU como 
 *   publicada pela Fundação do Software Livre (FSF); na versão 3 da 
 *   Licença, ou (na sua opinião) qualquer versão.
 *
 *   Este programa é distribuído na esperança de que possa ser  útil, 
 *   mas SEM NENHUMA GARANTIA; sem uma garantia implícita de ADEQUAÇÃO
 *   a qualquer MERCADO ou APLICAÇÃO EM PARTICULAR. Veja a
 *   Licença Pública Geral GNU para maiores detalhes.
 *
 *   Você deve ter recebido uma cópia da Licença Pública Geral GNU junto
 *   com este programa, Se não, veja <http://www.gnu.org/licenses/>.
 *
 * 
 * @author Jeferson Slywitch - jeferson.slywitch@gmail.com
 */
public class Bridge {
    
    private ConexaoPostgresql Conexao;
    
    public Bridge() {        
    }
    
            
    public void ExecutaSQL(String SQL) {
        
//        boolean posicao = false;
        
        Conexao = new ConexaoPostgresql();
        Conexao.Conectar();
        ResultSet RS = Conexao.Consultar();

        try {
            Conexao.setSQL(SQL);
            Conexao.Executar();            
        } catch (Exception Erro){
            JOptionPane.showMessageDialog(null, "Erro na validação: " + Erro);
        }

        Conexao.Desconectar();
       
    }   
    
    public ResultSet RetornaRS (String SQL) {
        
        ResultSet RS = null;
        
        Conexao = new ConexaoPostgresql();
        Conexao.Conectar() ;
        Conexao.setSQL(SQL);

        RS = Conexao.Consultar();
    
        return RS;
        
    }
    
    public Boolean Existencia (String SQL) {
        
        boolean Resposta = false;
        
        Conexao = new ConexaoPostgresql();
        Conexao.Conectar();
        Conexao.setSQL(SQL);
        ResultSet RS = Conexao.Consultar();
    
        try {
            if (!(RS.next())) {
                return Resposta = false;
            }
        } catch (Exception Erro){
            JOptionPane.showMessageDialog(null, "Erro na validação: " + Erro);
            return Resposta = false;
        }
        
        return Resposta = true;
        
    }
    
}
